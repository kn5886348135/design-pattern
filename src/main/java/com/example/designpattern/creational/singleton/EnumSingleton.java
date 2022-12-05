package com.example.designpattern.creational.singleton;

/**
 * 线程安全
 * 可以避免反射和序列化
 * 需要处理注入的属性
 * jdk反射不能创建枚举实例，会抛异常
 * 序列化的时候仅是将枚举对象的name属性输出到结果中，反序列化的时候通过Enum的valueOf去查找对应的枚举对象
 * 所有枚举的基类是{@link Enum}
 * 引用类型需要加{@link java.lang.reflect.Modifier#TRANSIENT transient}关键字
 */
public enum EnumSingleton {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
    // TODO注入其他组件
}
