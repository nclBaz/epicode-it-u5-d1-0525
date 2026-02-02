package riccardogulin.u5d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public abstract class Student {
	//	@Setter(AccessLevel.NONE) // Serve per eliminare il setter automatico su un campo specifico
//	private UUID id;
	private String name;
	private String surname;

	public abstract void answerQuestion();

}
