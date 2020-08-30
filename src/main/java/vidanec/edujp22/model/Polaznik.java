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
public class Polaznik extends Entitet{
    private String brojUgovora;
    
    @ManyToOne
    private Osoba osoba;

    public String getBrojUgovora() {
        return brojUgovora;
    }

    public void setBrojUgovora(String brojUgovora) {
        this.brojUgovora = brojUgovora;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }
    
    
}
