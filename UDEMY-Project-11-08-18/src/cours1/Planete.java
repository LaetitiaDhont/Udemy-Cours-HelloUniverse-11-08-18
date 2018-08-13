package cours1;

public class Planete {
	
	// Mes attributs 
	
	String nom;
	String matiere;
	long diametreKm;

	
	// Mes méthodes 
	
	void revolution () {
		System.out.println("Je suis la planète " + nom + " " +"et je tourne autour de mon étoile.");
	}
	
	void rotation () {
		System.out.println("Je suis la planète " + nom + " " +"et je tourne sur moi-même.");
	}

}
