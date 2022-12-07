package com.example.designpattern.creational.builder;

import lombok.AllArgsConstructor;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/07/14:18
 */
@AllArgsConstructor
public enum Armor {
    CLOTHES("clothes"),
    LEATHER("leather"),
    CHAIN_MAIL("chain mail"),
    PLATE_MAIL("plate mail");

    private final String title;

    @Override
    public String toString() {
        return "Armor{" +
                "title='" + title + '\'' +
                '}';
    }
}
