package com.example.designpattern.creational.prototype;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/07/14:32
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class ElfMage extends Mage {

    private final String helpType;

    public ElfMage(ElfMage elfMage) {
        super(elfMage);
        this.helpType = elfMage.helpType;
    }

    @Override
    public String toString() {
        return "Elven mage helps in " + helpType;
    }
}
