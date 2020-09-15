/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidanec.edujp22.utility;

/**
 *
 * @author Ivan
 */
public class EduException extends Exception{
     private String poruka;

    public EduException(String poruka) {
        this.poruka=poruka;
    }

    public String getPoruka() {
        return poruka;
    }
}
