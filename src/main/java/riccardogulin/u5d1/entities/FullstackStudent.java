package riccardogulin.u5d1.entities;

public class FullstackStudent extends Student {
	public FullstackStudent(String name, String surname) {
		super(name, surname);
	}

	@Override
	public void answerQuestion() {
		System.out.println("Ciao sono lo studente FULLSTACK e la risposta alla domanda è...blablbalba");
	}

	@Override
	public String toString() {
		return "FullstackStudent{} " + super.toString();
	}
}
