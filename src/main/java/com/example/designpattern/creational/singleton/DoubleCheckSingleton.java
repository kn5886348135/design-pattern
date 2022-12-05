package com.example.designpattern.creational.singleton;

import com.example.designpattern.test.TestService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 线程安全
 * 需要添加volatile关键字
 * 不能避免反射和序列化
 * 不能依赖其他外部属性，比如从文件或者网络加载
 */
@Component
public class DoubleCheckSingleton {

    private String name;

    // 没有volatile关键字，在并发场景下可能会获取到null
    // volatile保证线程可见性和指令重排
    private volatile static DoubleCheckSingleton INSTANCE;

    private TestService testServicea;

    private static TestService testService;

    private DoubleCheckSingleton() {
    }

    public DoubleCheckSingleton(TestService testServicea) {
        this.testServicea = testServicea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static TestService getTestService() {
        return testService;
    }

    public static void setTestService(TestService testService) {
        DoubleCheckSingleton.testService = testService;
    }

    public static DoubleCheckSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckSingleton();
                    if (testService == null) {
                        System.out.println("===================");
                    }
                    // TODO 注入的testService为空
                    INSTANCE.setName(testService.findEntity("1").getUserName());
                }
            }
        }
        return INSTANCE;
    }

    @PostConstruct
    void init() {
        testService = this.testServicea;
    }
}
