package com.example.designpattern.creational.builder;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/07/14:18
 */

public enum HairColor {
    WHITE,
    BLOND,
    RED,
    BROWN,
    BLACK;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
