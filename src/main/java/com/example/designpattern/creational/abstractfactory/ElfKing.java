package com.example.designpattern.creational.abstractfactory;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/06/16:40
 */
public class ElfKing implements King{

    private static final String DESCRIPTION = "This is the elven king!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
