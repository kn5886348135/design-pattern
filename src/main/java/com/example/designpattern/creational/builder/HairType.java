package com.example.designpattern.creational.builder;

import lombok.AllArgsConstructor;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/07/14:19
 */
@AllArgsConstructor
public enum HairType {
    BALD("bald"),
    SHORT("short"),
    CURLY("curly"),
    LONG_STRAIGHT("long straight"),
    LONG_CURLY("long curly");

    private final String title;

    @Override
    public String toString() {
        return "HairType{" +
                "title='" + title + '\'' +
                '}';
    }
}
