package com.example.designpattern.creational.abstractfactory;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/06/16:44
 */
public class OrcArmy implements Army{

    private static final String DESCRIPTION = "This is the orc army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
