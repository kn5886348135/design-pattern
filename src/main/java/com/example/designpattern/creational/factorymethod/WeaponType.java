package com.example.designpattern.creational.factorymethod;

/**
 * @author jack
 * @version 1.0
 * @description WeaponType
 * @date 2022/12/06/14:55
 */
public enum WeaponType {
    SHORT_SWORD("short sword"),
    SPEAR("spear"),
    AXE("axe"),
    UNDEFINED("")
    ;

    private String title;

    WeaponType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
