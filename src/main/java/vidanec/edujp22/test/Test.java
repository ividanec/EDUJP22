/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidanec.edujp22.test;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import org.assertj.core.util.ToString;




/**
 *
 * @author Ivan
 */
public class Test {
   
    public static String getIiP() {
        String ime = null;
        String prezime;
        try {
            String url = new Scanner(new URL("https://vit.hr/GIP/API/10/json/prvaSlovaVelika").openStream(), "UTF-8").useDelimiter("\\A").next();
        
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
      
            gson.toJson(url);
           
            
           
           return url;
          
        
        } catch (IOException ex) {
            return null;
        }
        
    
   
    }
}
