package presentation;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.IMetierImpl;

public class Presentation {

    public static void main(String[] args) {

        /**
         * Injection des dependances par
         * instanciation statique > new
         */

        DaoImpl dao = new DaoImpl();

        IMetierImpl metier = new IMetierImpl(dao);
//        metier.setDao(dao);
        System.out.println("Résultat = "+metier.calcul());

        DaoImpl2 daoImpl2 = new DaoImpl2();
        metier.setDao(daoImpl2);
        System.out.println("Résultat = "+metier.calcul());

    }
}
