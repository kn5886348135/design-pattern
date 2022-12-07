package com.example.designpattern.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/07/14:29
 */
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        HeroFactory factory = new HeroFactoryImpl(
                new ElfMage("cooking"),
                new ElfWarlord("cleaning"),
                new ElfBeast("protecting")
        );

        Mage mage = factory.createMage();
        Warlord warlord = factory.createWarlord();
        Beast beast = factory.createBeast();
        LOGGER.info(mage.toString());
        LOGGER.info(warlord.toString());
        LOGGER.info(beast.toString());

        factory = new HeroFactoryImpl(
                new OrcMage("axe"),
                new OrcWarlord("sword"),
                new OrcBeast("laser")
        );
        mage = factory.createMage();
        warlord = factory.createWarlord();
        beast = factory.createBeast();
        LOGGER.info(mage.toString());
        LOGGER.info(warlord.toString());
        LOGGER.info(beast.toString());
    }
}
