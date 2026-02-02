package riccardogulin.u5d1.entities;

public class Interviewer {
	private Student student;

	public Interviewer(Student student) {
		this.student = student;
	}

	public void askQuestion() {
		System.out.println("Ciao " + student.getName() + ", rispondimi alla seguente domanda...blablblba");
		this.student.answerQuestion();
	}
}
