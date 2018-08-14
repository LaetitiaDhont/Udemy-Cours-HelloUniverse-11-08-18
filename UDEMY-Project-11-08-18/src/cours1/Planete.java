package cours1;

public class Planete {

	// Mes attributs

	String nom;
	String matiere;
	long diametreKm;
	int totalVisiteurs;
	Atmosphere atmosphere;
	Vaisseau vaisseauActuellementAcoste;
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
	
	
	// Fusion des deux méthodes avec l'utilisation de la classe Vaisseau
	
	Vaisseau acceuillirVisiteurs(Vaisseau vaisseau) {

		totalVisiteurs = totalVisiteurs + vaisseau.nbrePassagers;

		if (vaisseauActuellementAcoste == null) {
			System.out.println("Aucun vaisseau ne s'en va.");
		}

		else {
			System.out.println("Un vaisseau de type " + vaisseauActuellementAcoste.type + " doit s'en aller.");
		}
		
		Vaisseau vaisseauPrecedent = vaisseauActuellementAcoste;
		vaisseauActuellementAcoste = vaisseau;
		return vaisseauPrecedent;

	}

}
