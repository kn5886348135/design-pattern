package com.example.designpattern.creational.prototype;

import lombok.RequiredArgsConstructor;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/07/14:34
 */
@RequiredArgsConstructor
public class HeroFactoryImpl implements HeroFactory{

    private final Mage mage;

    private final Warlord warlord;

    private final Beast beast;

    /**
     * Create mage.
     */
    @Override
    public Mage createMage() {
        return mage.copy();
    }

    /**
     * Create warlord.
     */
    @Override
    public Warlord createWarlord() {
        return warlord.copy();
    }

    /**
     * Create beast.
     */
    @Override
    public Beast createBeast() {
        return beast.copy();
    }

}
