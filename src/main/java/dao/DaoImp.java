package dao;

import javax.sound.midi.Soundbank;

public class DaoImp implements IDao{
    @Override
    public double getValue() {
        System.out.println("a travers la base de donnee");

        return Math.random()*19;
    }
}
