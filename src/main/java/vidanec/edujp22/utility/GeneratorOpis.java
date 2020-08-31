/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidanec.edujp22.utility;

import java.net.URL;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import us.codecraft.xsoup.Xsoup;

/**
 *
 * @author Ivan
 */
public class GeneratorOpis {
     public static String getOpis() {
        try {
     String html = new Scanner(new URL("https://www.posao.hr/oglasi/angular-frontend-developer-m-z/703458/").openStream(), "UTF-8").useDelimiter("\\A").next();

            Document document = Jsoup.parse(html);

            return Xsoup.compile("//*[@id=\"__xclaimwords_wrapper\"]/section[1]/div/div[1]/div[2]").evaluate(document).get();
        } catch (Exception e) {
            return null;
        }
        
    }
}
