package cours1;

public class VaisseauDeGuerre extends Vaisseau {

	// Mes attributs

	boolean armesDesactivees;

	// Mes méthodes

	VaisseauDeGuerre(String type) {
		if (type.equals("CHASSEUR")) {
			tonnageMax = 0;
		}

		else if (type.equals("FREGATE")) {
			tonnageMax = 50;
		}

		else if (type.equals("CROISEUR")) {
			tonnageMax = 100;
		}
	}

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

	int emporterCargaison(int cargaison) {

		if (nbrePassagers < 12) {
			System.out.println("Le nombre de passagers est insuffisant ! Cargaison impossible! ");
			return cargaison;

		}

		else {
			int tonnagePassagers = 2 * nbrePassagers;
			int tonnageRestant = tonnageMax - tonnageActuel;
			int tonnageAConsiderer = (tonnagePassagers<tonnageRestant ? tonnagePassagers : tonnageRestant);
			
			if (cargaison > tonnageAConsiderer) {
				tonnageActuel = tonnageMax;
				return cargaison - tonnageAConsiderer;
			}
			
			else {
				
				// similar to tonnageActuel = tonnageActuel + cargaison;
				tonnageActuel += cargaison;
				return 0;
			}
			
		}
		
		

	}

}
