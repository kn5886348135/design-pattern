package com.example.designpattern.creational.prototype;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/07/14:31
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class ElfBeast extends Beast {

    private final String helpType;

    public ElfBeast(ElfBeast elfBeast) {
        super(elfBeast);
        this.helpType = elfBeast.helpType;
    }

    @Override
    public String toString() {
        return "Elven eagle helps in " + helpType;
    }
}
