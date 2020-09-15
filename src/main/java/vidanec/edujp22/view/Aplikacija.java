/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidanec.edujp22.view;

import vidanec.edujp22.model.Operater;

/**
 *
 * @author Ivan
 */
public class Aplikacija {
    public static final String NASLOV_APP="Edunova APP";
    
    public static Operater operater;
    
    public static boolean isAdmin(){
        if(operater==null || operater.getUloga()==null){
            return false;
        }
        return operater.getUloga().equals("admin");
    }
}
