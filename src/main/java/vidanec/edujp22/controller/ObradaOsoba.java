/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidanec.edujp22.controller;

import java.util.List;
import vidanec.edujp22.model.Osoba;
import vidanec.edujp22.utility.EduException;

/**
 *
 * @author Ivan
 */
public class ObradaOsoba extends Obrada<Osoba>{

    @Override
    public List<Osoba> getPodaci() {
        return sesion.createQuery("from Osoba").list();
    }

    @Override
    protected void kontrolaCreate() throws EduException {
        kontrolaIme();
     }

    @Override
    protected void kontrolaUpdate() throws EduException {
     
    }

    @Override
    protected void kontrolaDelete() throws EduException {
     
    }
    
    protected void kontrolaIme() throws EduException{
       if(entitet.getIme()==null || entitet.getIme().trim().isEmpty()){
         throw new EduException("Ime obavezno");
     }
    }
}
