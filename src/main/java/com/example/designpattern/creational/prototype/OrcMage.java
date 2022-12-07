package com.example.designpattern.creational.prototype;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/07/14:36
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class OrcMage extends Mage {

    private final String weapon;

    public OrcMage(OrcMage orcMage) {
        super(orcMage);
        this.weapon = orcMage.weapon;
    }

    @Override
    public String toString() {
        return "Orcish mage attacks with " + weapon;
    }

}
