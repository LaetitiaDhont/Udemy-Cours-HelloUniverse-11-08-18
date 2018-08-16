package cours1;

//Création de la classe Vaisseau 

public abstract class Vaisseau {

	String type;
	int nbrePassagers;
	int blindage;
	int resistanceDuBouclier;
	int tonnageMax;
	int tonnageActuel;

	// Mes méthodes

	void activerBouclier() {
		System.out.println("Activation du bouclier d'un vaisseau de type : " + type);
	}

	void desactiverBouclier() {
		System.out.println("Désactivation du bouclier d'un vaisseau de type : " + type);
	}
	
	// Méthode abstraite 

	abstract int emporterCargaison(int cargaison);

}
