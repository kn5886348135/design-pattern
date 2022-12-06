package com.example.designpattern.creational.abstractfactory;

import org.apache.ibatis.javassist.runtime.Desc;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/06/16:41
 */
public class OrcCastle implements Castle{

    private static final String DESCRIPTION = "This is the orc castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
