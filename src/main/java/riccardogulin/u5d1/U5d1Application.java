package riccardogulin.u5d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import riccardogulin.u5d1.entities.FrontendStudent;
import riccardogulin.u5d1.entities.FullstackStudent;
import riccardogulin.u5d1.entities.Interviewer;

@SpringBootApplication
public class U5d1Application {

	public static void main(String[] args) {

		SpringApplication.run(U5d1Application.class, args);

		// ************************************* METODO TRADIZIONALE ******************************************
		FullstackStudent giacomo = new FullstackStudent("Giacomo", "Poretti");
		Interviewer i0 = new Interviewer(giacomo);
		i0.askQuestion();

		// *********************************** LETTURA BEANS DA CONTEXT *****************************************
		// 1. Ottengo un riferimento al context
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5d1Application.class);

		// 2. Tramite metodi .getBean dell'oggetto context posso leggere i Bean dallo "scatolone" tramite NOME del Bean o tramite TIPO del Bean
		FrontendStudent fes = ctx.getBean(FrontendStudent.class);
		System.out.println(fes);
		fes.answerQuestion();

		FrontendStudent fes2 = ctx.getBean("aldo", FrontendStudent.class);
		System.out.println(fes2);
		fes2.answerQuestion();

		FullstackStudent fss = ctx.getBean(FullstackStudent.class);
		System.out.println(fss);

		Interviewer i = ctx.getBean(Interviewer.class);
		i.askQuestion();
	}

}
