package com.example.designpattern.creational.prototype;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/07/14:33
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class ElfWarlord extends Warlord {

    private final String helpType;

    public ElfWarlord(ElfWarlord elfWarlord) {
        super(elfWarlord);
        this.helpType = elfWarlord.helpType;
    }

    @Override
    public String toString() {
        return "Elven warlord helps in " + helpType;
    }
}
