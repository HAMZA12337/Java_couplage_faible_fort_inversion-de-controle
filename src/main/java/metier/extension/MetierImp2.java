package metier.extension;

import dao.IDao;
import metier.IMetier;

public class MetierImp2 implements IMetier {

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
