/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidanec.edujp22.utility;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import us.codecraft.xsoup.Xsoup;

/**
 *
 * @author Ivan
 */
public class GeneratorOpis {
    public static void main(String[] args) throws IOException {
        
            Document doc = Jsoup.connect("https://www.posao.hr/oglasi/angular-frontend-developer-m-z/703458/").userAgent("Chrome").get();
            Elements temp=doc.select(".jobs_about_p, .jobs_about_right ");
            for(Element posao:temp) {
                System.out.println(posao.text());
            

            
      
        
            }
}
    
}
