package com.example.designpattern.creational.prototype;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/07/14:34
 */
public interface HeroFactory {
    Mage createMage();

    Warlord createWarlord();

    Beast createBeast();
}
