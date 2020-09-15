/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidanec.edujp22;

import vidanec.edujp22.test.Test;
import vidanec.edujp22.utility.GeneratorOpis;
import vidanec.edujp22.utility.HibernateUtil;
import vidanec.edujp22.view.LjubavniKalkulator;
import vidanec.edujp22.view.Zadatak1;

/**
 *
 * @author Ivan
 */
public class Start {
    public static void main(String[] args) {
//       HibernateUtil.getSessionFactory().openSession();
//        new Zadatak1().setVisible(true);
        new LjubavniKalkulator().setVisible(true);
    }
}
