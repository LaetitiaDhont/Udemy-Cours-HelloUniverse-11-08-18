package cours1;

//Création de la classe Vaisseau 

public class Vaisseau {

	String type;
	int nbrePassagers;
	int blindage;
	int resistanceDuBouclier;

	// Mes méthodes

	void activerBouclier() {
		System.out.println("Activation du bouclier d'un vaisseau de type : " + type);
	}

	void desactiverBouclier() {
		System.out.println("Désactivation du bouclier d'un vaisseau de type : " + type);
	}

}
