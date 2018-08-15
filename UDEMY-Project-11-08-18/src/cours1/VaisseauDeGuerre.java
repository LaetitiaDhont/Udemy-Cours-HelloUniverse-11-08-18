package cours1;

public class VaisseauDeGuerre extends Vaisseau {

	// Mes attributs

	boolean armesDesactivees;

	// Mes méthodes

	void attaque(Vaisseau cible, String arme, int dureeAttaque) {

		if (armesDesactivees) {
			System.out.println("Attaque impossible ! L'armement est désactivé ! ");
		}

		else {
			System.out.println("Un vaisseau de type : " + this.type + " attaque un vaisseau de type : " + cible.type
					+ " en utilisant l'arme " + arme + " pendant " + dureeAttaque + " minutes.");
			cible.resistanceDuBouclier = 0;
			cible.blindage = cible.blindage / 2;
		}
	}

	void desactiverArmes() {
		System.out.println("Désactivation des armes d'un vaisseau de type : " + type);
		armesDesactivees = true;
	}
	
	
	void activerBouclier() {
		desactiverArmes();
		super.activerBouclier();

	}
	
	
}
