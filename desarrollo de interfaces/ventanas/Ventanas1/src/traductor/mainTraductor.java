package traductor;

import java.io.*;
import java.net.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class mainTraductor {

	public static void main(String[] args) throws IOException{ //throws hace la escepcion, try cacth es en el momento 
		
		URL direccion =new URL("https://www.ingles.com/traductor/perro");
		
		String html=obtenerHTML(direccion);
		
		buscarHtml(html); //version tosca
		
		//version fina 
		System.out.println(traducirJsoup("perro"));

	}
	
    //manera fina
	private static String traducirJsoup(String palabra) {
		
		String cadena=null;
		
		Document document=null;
		
		String webPage="https://www.ingles.com/traductor/" + palabra;
		try {
		document=Jsoup.connect(webPage).get();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		cadena=document.getElementById("quickdef1-es").getElementsByClass("MhZ0VHvJ").html().toUpperCase();
		
		return cadena;
	}


	//manera tosca
	private static void buscarHtml(String html) {
		
		int inicio= html.indexOf("<a href=\"/traductor/dog?langFrom=en\" class=\"MhZ0VHvJ\">"); //nos dice en que linea esta
		
		String resultado= html.substring(inicio+54,inicio+57); //corta cadenas
		System.out.println("La palabra traducida es: " +resultado);
		
	}


   
	private static String obtenerHTML(URL direccion) throws IOException{
		
		BufferedReader in= new BufferedReader(new InputStreamReader(direccion.openStream()));
		String inputline,codigo="";
		
		while((inputline=in.readLine())!=null) {
			
			codigo+=inputline;
		}
		
		in.close();
		
		return codigo;
	}

}
