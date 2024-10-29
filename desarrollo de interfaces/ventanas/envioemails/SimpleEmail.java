package envioemails;


import java.util.Properties;
import javax.mail.*;

public class SimpleEmail {

	public static void main(String[] args) {
		final String fromEmail= "angelavivandiaz@gmail.com";// email de salida
		final String password="fwyy rdfq onzn gvxb";//contraseña email de salida
		final String toEmail="fp.avivancodiaz@salesianosdosa.com";//email destinatario
		
		System.out.println("Configurando datos conexion SSL");
		
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");//smtp de gmail en este caso
		props.put("mail.smtp.socketFactory.port", "465");//puerto SSL
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); //ssl factory class
		props.put("mail.smtp.auth", "true");//Activar smtp autentificacion
		props.put("mail.smtp.port", "465");//SMTP port
		
		Authenticator auth = new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail,password);
			}
		};
		
		Session session=Session.getDefaultInstance(props,auth);//Crea una sesion con todas las propiedades y el login
		System.out.println("Sesión creada");
		
		/**
		 * Llama al metodo sendEmail con todos los datos configurados
		 */
		
		EmailUtil.sendEmail(session, toEmail, "Asunto", "Esto es una prueba");
	}
}
