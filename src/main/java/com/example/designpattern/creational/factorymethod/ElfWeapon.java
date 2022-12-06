package com.example.designpattern.creational.factorymethod;

import lombok.RequiredArgsConstructor;

/**
 * @author jack
 * @version 1.0
 * @description elven 精灵
 * @date 2022/12/06/15:06
 */
@RequiredArgsConstructor
public class ElfWeapon implements Weapon{

    private final WeaponType weaponType;

    @Override
    public WeaponType getWeaponType() {
        return weaponType;
    }

    @Override
    public String toString() {
        return "an elven " + weaponType;
    }

}
