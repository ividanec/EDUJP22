/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidanec.edujp22.controller;

import java.util.List;
import org.mindrot.jbcrypt.BCrypt;
import vidanec.edujp22.model.Operater;
import vidanec.edujp22.utility.EduException;

/**
 *
 * @author Ivan
 */
public class ObradaOperater extends Obrada<Operater>{

     public Operater autoriziraj(String email, char[] lozinka){
        
        Operater operater = (Operater) sesion.createQuery(
                " from Operater o where o.email=:email")
                .setParameter("email", email).getSingleResult();
        
        if(operater==null){
            return null;
        }
        
        return BCrypt.checkpw(new String(lozinka), operater.getLozinka()) 
                ? operater : null;
    }
    
    @Override
    public List<Operater> getPodaci() {
     return sesion.createQuery("from Operater").list();
    }

    @Override
    protected void kontrolaCreate() throws EduException {
        kontrolaIme();
    }

    @Override
    protected void kontrolaUpdate() throws EduException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void kontrolaDelete() throws EduException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    protected void kontrolaIme() throws EduException{
       if(entitet.getIme()==null || entitet.getIme().trim().isEmpty()){
         throw new EduException("Ime obavezno");
     }
    }
}
