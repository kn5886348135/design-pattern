package com.example.designpattern.creational.abstractfactory;

/**
 * @author jack
 * @version 1.0
 * @description TODO
 * @date 2022/12/06/16:38
 */
public class OrcKingdomFactory implements KingdomFactory{

    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public King createKing() {
        return new OrcKing();
    }

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }
}
