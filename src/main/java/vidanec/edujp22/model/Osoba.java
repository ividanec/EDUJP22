/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidanec.edujp22.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Ivan
 */
@Entity
public class Osoba extends Entitet{
    
    private String ime;
    private String prezime;
    private String email;
    private String oib;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

 public String getImePrezime(){
        return getIme() + " " + getPrezime();
    }
    
}
