package riccardogulin.u5d1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import riccardogulin.u5d1.entities.BackendStudent;
import riccardogulin.u5d1.entities.FrontendStudent;
import riccardogulin.u5d1.entities.FullstackStudent;
import riccardogulin.u5d1.entities.Interviewer;

@Configuration
public class ConfigClass {

	/*
	Questa sarà una classe "speciale" all'interno dell'applicazione. Essendo annotata da @Configuration, questo significa che
	al suo interno potremo inserire N metodi, ognuno dei quali conterrà le "istruzioni" per generare un Bean, ovvero per
	chiedere a Spring di gestire lui quell'oggetto ed inserirlo nell'Application Context (lo "scatolone")
	Per creare un nuovo Bean aggiungiamo un metodo con annotazione @Bean
	*/

	@Bean
	public int getNumber() {
		return 42;
	}

//	@Bean
//	public String getAdminName() {
//		return "Ajeje";
//	}

	@Bean
	public String getAdminName2() {
		return "Claudio";
	}

	@Bean(name = "aldo") // Opzionalmente quando dichiaro un Bean, posso assegnargli un nome,
	// altrimenti verrà utilizzato il nome del metodo come nome
	public FrontendStudent getFEStudent() {
		return new FrontendStudent("Aldo", "Baglio");
	}

	@Bean
	public BackendStudent getBEStudent() {
		return new BackendStudent("Giovanni", "Storti");
	}

	@Bean
	public FullstackStudent getFSStudent(String name) {
		return new FullstackStudent(name, "Poretti");
	}

	@Bean
	public Interviewer getInterviewer(FullstackStudent student) {
		// Si dice che il parametro student è una DIPENDENZA del Bean Interviewer
		// Quindi Spring non solo crea oggetti ma anche va cercare di soddisfare le loro
		// dipendenze, ricercando se nello scatolone ci siano dei Bean compatibili
		// Se trova un Bean compatibile lo passa ad Interviewer, altrimenti se ne trova zero
		// l'applicazione non si avvierà proprio. Anche se ne dovesse trovare più di uno
		// compatibile avremmo dei problemi all'avvio.
		return new Interviewer(student);
	}

}
