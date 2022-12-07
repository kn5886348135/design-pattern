package com.example.designpattern.creational.prototype;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/07/14:37
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class OrcWarlord extends Warlord {

    private final String weapon;

    public OrcWarlord(OrcWarlord orcWarlord) {
        super(orcWarlord);
        this.weapon = orcWarlord.weapon;
    }

    @Override
    public String toString() {
        return "Orcish warlord attacks with " + weapon;
    }

}
