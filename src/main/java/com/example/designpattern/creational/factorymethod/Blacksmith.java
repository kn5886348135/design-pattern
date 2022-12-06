package com.example.designpattern.creational.factorymethod;

/**
 * @author jack
 * @version 1.0
 * @description blacksmith 铁匠
 * @date 2022/12/06/14:59
 */
public interface Blacksmith {
    Weapon manufactureWeapon(WeaponType weaponType);
}
