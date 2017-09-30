import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Task {

	public static void main(String[] args) throws IOException {
        URL wykop = new URL("https://www.wykop.pl");
        BufferedReader in = new BufferedReader(new InputStreamReader(wykop.openStream(),"UTF-8"));
 
        StringBuilder websiteSource = new StringBuilder();
        String tmp = null;
        while ((tmp = in.readLine()) != null) {
            websiteSource.append(tmp);
        }
        in.close();
         
        Document doc = Jsoup.parse(websiteSource.toString());
        
       Elements el = doc.select("div.lcontrast.m-reset-margin").select("h2");
        
        for(Element e: el){
        	System.out.println(e.text());
        }
/*
        Elements h1Elements = doc.getElementsByTag("h2");
         
        for(Element e: h1Elements) {
            System.out.println(e.text());
        }
*/       
    }

}
