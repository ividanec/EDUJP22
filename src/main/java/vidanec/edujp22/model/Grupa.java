/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidanec.edujp22.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


/**
 *
 * @author Ivan
 */
@Entity
public class Grupa extends Entitet{
    private String naziv;
    private Date datumPocetka;
    
    @ManyToOne
    @JoinColumn(name="smjer")
    private Smjer smjer;
    
    @ManyToOne
    @JoinColumn(name="predavac")
    private Predavac predavac;
    
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="clan",joinColumns=@JoinColumn(name="grupa"),inverseJoinColumns=@JoinColumn(name="polaznik") )
    private List<Polaznik> polaznici = new ArrayList<>();

    public List<Polaznik> getPolaznici() {
        return polaznici;
    }

    public void setPolaznici(List<Polaznik> polaznici) {
        this.polaznici = polaznici;
    }

   
    
    

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Date getDatumPocetka() {
        return datumPocetka;
    }

    public void setDatumPocetka(Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public Smjer getSmjer() {
        return smjer;
    }

    public void setSmjer(Smjer smjer) {
        this.smjer = smjer;
    }

    public Predavac getPredavac() {
        return predavac;
    }

    public void setPredavac(Predavac predavac) {
        this.predavac = predavac;
    }
    
    
}
