package metier;

import dao.IDao;

public class MetierImp implements IMetier{

    // Couplage faible
    private IDao dao =null;

    @Override
    public double compute() {


        double result=dao.getValue();
        return result;
    }

    // Injecter dans la variable dao un objet
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
