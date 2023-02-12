package dao.extension;

import dao.IDao;

public class DaoImp2 implements IDao {
    @Override
    public double getValue() {
        System.out.println("a travers web service");

        return Math.random()*19;
    }
}
