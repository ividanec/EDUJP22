/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidanec.edujp22.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Ivan
 */
@Entity
public class Predavac extends Entitet{
    private String iban;
    
    @ManyToOne
    private Osoba osoba;

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }
    
    
}
