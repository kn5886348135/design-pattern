package com.example.designpattern.creational.factorymethod;

import lombok.RequiredArgsConstructor;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/06/15:06
 */
@RequiredArgsConstructor
public class OrcWeapon implements Weapon{

    private final WeaponType weaponType;

    @Override
    public WeaponType getWeaponType() {
        return weaponType;
    }

    @Override
    public String toString() {
        return "an orcish " + weaponType;
    }

}
