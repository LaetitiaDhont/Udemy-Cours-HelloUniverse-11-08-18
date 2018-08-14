package cours1;

public class Planete {

	// Mes attributs

	String nom;
	String matiere;
	long diametreKm;
	int totalVisiteurs;
	Atmosphere atmosphere;

	// Mes méthodes
	// Amélioration de mes méthodes qui indique l'angle de rotation de mes planètes
	// + valeur de retour
	// Surcharge des méthodes en accueuillant des vaisseaux spaciaux
	// Utilisation de la méthode equals

	int revolution(int angle) {
		return angle / 360;
	}

	int rotation(int angle) {
		return angle / 360;

	}

	void acceuillirVaisseau(int nbreHumains) {
		totalVisiteurs = nbreHumains + totalVisiteurs;
	}

	void acceuillirVaisseau(String typeVaisseau) {
		if (typeVaisseau.equals("CHASSEUR")) {
			totalVisiteurs = totalVisiteurs + 3;
		}

		else if (typeVaisseau.equals("FREGATE")) {
			totalVisiteurs = totalVisiteurs + 12;
		}

		else if (typeVaisseau.equals("CROISEUR")) {
			totalVisiteurs = totalVisiteurs + 50;
		}

	}
	

	
}
