package divClases;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Traduccion {
    public String traducir(String palabraESP) {
        String webPage = "https://www.ingles.com/traductor/" + palabraESP;
        String palabraTraducida = null;

        try {
            Document document = Jsoup.connect(webPage).get();
            palabraTraducida = document.getElementById("quickdef1-es")
                                        .getElementsByClass("tCur1iYH")
                                        .html();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return palabraTraducida;
    }
}
