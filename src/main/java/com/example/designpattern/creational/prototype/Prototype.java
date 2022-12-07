package com.example.designpattern.creational.prototype;

import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/07/14:37
 */
public abstract class Prototype<T> implements Cloneable {

    private static final Logger LOGGER = LoggerFactory.getLogger(Prototype.class);

    @SneakyThrows
    public T copy() {
        return (T) super.clone();
    }

}
