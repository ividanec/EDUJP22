/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidanec.edujp22.utility;

import org.hibernate.Session;
import org.mindrot.jbcrypt.BCrypt;
import vidanec.edujp22.controller.ObradaOperater;
import vidanec.edujp22.model.Operater;

/**
 *
 * @author Ivan
 */
public class PocetniInsert {
     public static void izvedi(){
        
        
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        
        Operater operater = new Operater();
        operater.setIme("Ivan");
        operater.setPrezime("Vidanec");
        operater.setUloga("oper");
        operater.setEmail("ividanec@gmail.com");
        
        operater.setLozinka(BCrypt.hashpw("i", BCrypt.gensalt()));
        
        ObradaOperater oo = new ObradaOperater();
        oo.setEntitet(operater);
        try {
            oo.create();
        } catch (EduException ex) {
            ex.printStackTrace();
        }
     }
}
