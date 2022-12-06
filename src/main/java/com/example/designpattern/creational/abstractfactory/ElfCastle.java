package com.example.designpattern.creational.abstractfactory;

import org.apache.ibatis.javassist.runtime.Desc;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/06/16:43
 */
public class ElfCastle implements Castle{

    private static final String DESCRIPTION = "This is the elven castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
