package cours1;

//Cr�ation de la classe Vaisseau 

public abstract class Vaisseau {

	String type;
	int nbrePassagers;
	int blindage;
	int resistanceDuBouclier;
	int tonnageMax;
	int tonnageActuel;

	// Mes m�thodes

	void activerBouclier() {
		System.out.println("Activation du bouclier d'un vaisseau de type : " + type);
	}

	void desactiverBouclier() {
		System.out.println("D�sactivation du bouclier d'un vaisseau de type : " + type);
	}
	
	// M�thode abstraite 

	abstract int emporterCargaison(int cargaison);

}
