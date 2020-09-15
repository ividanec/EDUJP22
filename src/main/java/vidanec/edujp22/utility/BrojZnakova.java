/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidanec.edujp22.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Ivan
 */
public class BrojZnakova {
    
 


public static int countChars(String prvoIme, String drugoIme){
    String obaImena = prvoIme + drugoIme;
    char[] niz;
    List<Integer> brojevi = new ArrayList<>();
    do{
      niz = obaImena.toCharArray();
      Arrays.sort(niz);
      char ch =  niz[0];
      int count = 1;
      int j =1;
      for(int i = 0; i < obaImena.length(); i++){
        if(ch == niz[i]){
           
            if(ch == niz[j]) {
                i++;
                count++;
                continue;
            }
            
          count=1;
          i++;
          
        } 
        
      
      }
      if(((ch != ' ') && (ch != '\t'))){
        brojevi.add(count);
      }
      
     // System.out.println(ch + " - " + count);
        
    obaImena = obaImena.replace(""+ch, "");
    }while(obaImena.length() > 1);
    
    //System.out.println(brojevi);
   return sum(brojevi);
    
  }

    private static int sum(List<Integer> num){
        int broj1 =0;
        int broj2 =0;
        
        List<Integer> postotak = new ArrayList<>();
        Iterator<Integer> itr = num.iterator();
        
        if(num.size()==2){
            return Integer.parseInt(num.get(0) + "" + num.get(1));
        }
        
        while( itr.hasNext()) {
            
            
            if(num.size() == 1) {
                broj1 += itr.next();
                postotak.add(broj1);
                break;
            }
            broj1 += itr.next();
            broj2++;
            
            if(broj2 == 2) {
                if(kontrolaBroja(broj1)) {
                    postotak.add(broj1);
                } else {
                    postotak.add(1);
                }
                broj1 = 0;
                broj2 = 0;
            }
            itr.remove();
        }
        
        return sum(postotak);
    
    }
    
    
    private static boolean kontrolaBroja(int broj) {

        return (broj < 10);
    }
}
