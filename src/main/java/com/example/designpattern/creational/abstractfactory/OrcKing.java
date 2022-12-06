package com.example.designpattern.creational.abstractfactory;

import org.apache.ibatis.javassist.runtime.Desc;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/06/16:40
 */
public class OrcKing implements King{

    private static final String DESCRIPTION = "This is the orc king!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
