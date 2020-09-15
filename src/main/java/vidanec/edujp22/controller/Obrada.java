/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidanec.edujp22.controller;

import java.util.List;
import org.hibernate.Session;
import vidanec.edujp22.utility.EduException;
import vidanec.edujp22.utility.HibernateUtil;

/**
 *
 * @author Ivan
 */
public abstract class Obrada<T> {
    protected T entitet;
    protected Session sesion;
    
    public abstract List<T> getPodaci();
    protected abstract void kontrolaCreate() throws EduException;
    protected abstract void kontrolaUpdate() throws EduException;
    protected abstract void kontrolaDelete() throws EduException;
    

    public Obrada(T entitet) {
        this();
        this.entitet = entitet;
    }  
    
    public Obrada() {
        this.sesion = HibernateUtil.getSessionFactory().openSession();
    }

    public T create() throws EduException {
        kontrolaCreate();
        save();
        return entitet;
    }
    
    public T createAll(List<T> lista) throws EduException {
        sesion.beginTransaction();
        for (T t : lista) {
            setEntitet(t);
            kontrolaCreate();
            sesion.save(t);
        }
        sesion.getTransaction().commit();
       
      
        return entitet;
    }

    public T update() throws EduException {
        kontrolaUpdate();
        save();
        return entitet;
    }

    public boolean delete() throws EduException {
        kontrolaDelete();
        sesion.beginTransaction();
        sesion.delete(entitet);
        sesion.getTransaction().commit();
        return true;
    }

    private void save() {
        sesion.beginTransaction();
        sesion.save(entitet);
        sesion.getTransaction().commit();
    }

    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }

    
}
