package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class IMetierImpl implements IMetier {
    @Autowired
    private IDao dao ; //Couplage faible

    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp*540 / Math.cos(tmp*Math.PI);
        return res;
    }


    public IMetierImpl(IDao dao){
        this.dao = dao;
    }



    /**
     * Injecter dans la variable Dao un objet
     * d'une classe qui implemente l'iterface IDao
     * @param dao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
