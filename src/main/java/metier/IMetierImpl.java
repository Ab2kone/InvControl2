package metier;

import dao.IDao;

public class IMetierImpl implements IMetier {
    private IDao dao ; //Couplage faible

    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp*540 / Math.cos(tmp*Math.PI);
        return res;
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
