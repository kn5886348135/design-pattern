package com.example.designpattern.creational.singleton;

import java.io.Serializable;

/**
 * 线程安全
 * 懒加载
 * 不能避免反射和序列化
 * 不能依赖其他外部属性，比如从文件或者网络加载
 */
public class StaticInnerClassSingleton implements Serializable {

    // 避免反射
    private StaticInnerClassSingleton() {
        if (StaticInnerClassSingletonHolder.INSTANCE != null) {
            throw new RuntimeException("StaticInnerClassSingleton has already been initialized!");
        }
    }

    private static class StaticInnerClassSingletonHolder{
        private static StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return StaticInnerClassSingletonHolder.INSTANCE;
    }

    // 添加resolve方法避免反序列化
    // 反序列化过程中会检查是否包含readResolve方法，如果有则通过反射调用它
    private Object readResolve(){
        return StaticInnerClassSingletonHolder.INSTANCE;
    }
}
