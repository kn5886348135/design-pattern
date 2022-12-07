package com.example.designpattern.creational.builder;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/07/14:21
 */
public enum Weapon {
    DAGGER, SWORD, AXE, WARHAMMER, BOW;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
