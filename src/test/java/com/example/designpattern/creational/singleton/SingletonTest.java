package com.example.designpattern.creational.singleton;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class SingletonTest implements Serializable {

    private static final Logger LOGGER = LoggerFactory.getLogger(SingletonTest.class);

    private ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5, 10, 0, TimeUnit.SECONDS,
            new LinkedBlockingDeque<>());

    // 测试双检查锁单例线程安全
    @Test
    void threadSafeDoubleCheck() {
        int testCount = 10000;
        CountDownLatch countDownLatch = new CountDownLatch(1);

        // 单例类不重写equals方法
        Set<DoubleCheckSingleton> doubleCheckSingletons = new HashSet<>();
        try {
            for (int i = 0; i < testCount; i++) {
                threadPool.submit(() -> doubleCheckSingletons.add(DoubleCheckSingleton.getInstance()));
            }
        } catch (Exception exception) {
            LOGGER.error("exception", exception);
        } finally {
            countDownLatch.countDown();
        }
        // TODO
        // CountDownLatch的使用姿势不对？new DoubleCheckSingleton()的时候size和testCount对不上
        System.out.println(doubleCheckSingletons.size());

        assertEquals(1, doubleCheckSingletons.size());
    }

    // 测试静态内部类单例线程安全
    @Test
    void threadSafeStaticInnerClass() {
        int testCount = 10000;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Set<StaticInnerClassSingleton> staticInnerClassSingletons = new HashSet<>();
        try {
            for (int i = 0; i < testCount; i++) {
                threadPool.submit(() -> staticInnerClassSingletons.add(StaticInnerClassSingleton.getInstance()));
            }
        } catch (Exception exception) {
            LOGGER.error("exception", exception);
        } finally {
            countDownLatch.countDown();
        }
        System.out.println(staticInnerClassSingletons.size());
        assertEquals(1, staticInnerClassSingletons.size());
    }

    @Test
    void threadSafeEnum() {
        int testCount = 10000;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Set<EnumSingleton> enumSingletons = new HashSet<>();
        try {
            for (int i = 0; i < testCount; i++) {
                threadPool.submit(() -> enumSingletons.add(EnumSingleton.getInstance()));
            }
        } catch (Exception exception) {
            LOGGER.error("exception", exception);
        } finally {
            countDownLatch.countDown();
        }
        System.out.println(enumSingletons.size());
        assertEquals(1, enumSingletons.size());
    }

    // 测试反射对单例的破坏
    @Test
    void reflectionDoubleCheck() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException {
        Class<DoubleCheckSingleton> clazz = DoubleCheckSingleton.class;
        Constructor<DoubleCheckSingleton> ctor = clazz.getDeclaredConstructor();
        ctor.setAccessible(true);
        DoubleCheckSingleton doubleCheckSingleton = ctor.newInstance();
        assertEquals(doubleCheckSingleton, DoubleCheckSingleton.getInstance());
    }

    // 测试反射对单例的破坏
    @Test
    void reflectionStaticInnerClass() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException {
        Class<StaticInnerClassSingleton> clazz = StaticInnerClassSingleton.class;
        Constructor<StaticInnerClassSingleton> ctor = clazz.getDeclaredConstructor();
        ctor.setAccessible(true);
        StaticInnerClassSingleton staticInnerClassSingleton = ctor.newInstance();
        assertEquals(staticInnerClassSingleton, StaticInnerClassSingleton.getInstance());
    }

    // 测试反射对单例的破坏
    @Test
    void reflectionEnum() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException {
        System.out.println(EnumSingleton.class.getName());

        Class<EnumSingleton> clazz = EnumSingleton.class;
        Constructor<EnumSingleton> ctor = clazz.getDeclaredConstructor();
        ctor.setAccessible(true);
        EnumSingleton instancea = ctor.newInstance();
        assertEquals(instancea, EnumSingleton.getInstance());
    }

    // 测试反序列化对单例的破坏
    @Test
    void deserializationDoubleCheck() throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("doublecheck.obj"));
        oos.writeObject(DoubleCheckSingleton.getInstance());

        File file = new File("doublecheck.obj");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        DoubleCheckSingleton doubleCheckSingleton = (DoubleCheckSingleton) ois.readObject();
        assertEquals(DoubleCheckSingleton.getInstance(), doubleCheckSingleton);
    }

    @Test
    void deserializationStaticInnerClass() throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("staticinnerclass.obj"));
        oos.writeObject(StaticInnerClassSingleton.getInstance());

        File file = new File("staticinnerclass.obj");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        StaticInnerClassSingleton staticInnerClassSingleton = (StaticInnerClassSingleton) ois.readObject();
        assertEquals(StaticInnerClassSingleton.getInstance(), staticInnerClassSingleton);
    }

    @Test
    void deserializationEnum() throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("enumsingleton.obj"));
        oos.writeObject(EnumSingleton.getInstance());

        File file = new File("enumsingleton.obj");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        EnumSingleton singleton = (EnumSingleton) ois.readObject();
        System.out.println(singleton);
        assertEquals(EnumSingleton.getInstance(), singleton);
    }
}