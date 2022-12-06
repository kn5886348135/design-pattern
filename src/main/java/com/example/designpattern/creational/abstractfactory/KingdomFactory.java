package com.example.designpattern.creational.abstractfactory;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/06/16:37
 */
public interface KingdomFactory {
    Castle createCastle();

    King createKing();

    Army createArmy();
}
