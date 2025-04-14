package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl m = new MetierImpl(dao);
        //m.setDao(dao);
        System.out.println("Res="+m.calcul());
    }
}
