package uvsq21921358.DIP;
import java.time.LocalDateTime;

public class ClasseMetier {

	public void uneMethodeMetier(LogInterface log) {

		log.write(LocalDateTime.now() + "Debut methode métier");

		// traitement métier

		log.write(LocalDateTime.now() + "Fin methode métier");

	}
}