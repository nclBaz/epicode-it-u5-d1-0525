package riccardogulin.u5d1.entities;

public class BackendStudent extends Student {
	public BackendStudent(String name, String surname) {
		super(name, surname);
	}

	@Override
	public void answerQuestion() {
		System.out.println("Ciao sono lo studente BACKEND e la risposta alla domanda è...blablbalba");
	}

	@Override
	public String toString() {
		return "BackendStudent{} " + super.toString();
	}
}
