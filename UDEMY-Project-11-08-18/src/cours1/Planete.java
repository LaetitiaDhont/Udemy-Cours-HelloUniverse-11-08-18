package cours1;

public abstract class Planete {

	// Mes attributs
	// Ajout de l'attribut forme qui sera static c'est à dire commune à toutes les
	// planètes.

	static String forme = "Sphérique";
	static int nbrePlanetesDecouvertes = 0;
	Atmosphere atmosphere;
	Vaisseau vaisseauActuellementAcoste;
	String nom;
	long diametreKm;
	int totalVisiteurs;

	// Ajout d'un autre constructeur qui a pour argument le nom de nos planètes.

	Planete(String nom) {
		this.nom = nom;
		nbrePlanetesDecouvertes++;
	}

	// Mes méthodes
	// Amélioration de mes méthodes qui indique l'angle de rotation de mes planètes.
	// + valeur de retour.
	// Surcharge des méthodes en accueuillant des vaisseaux spaciaux.
	// Utilisation de la méthode equals.

	// Création d'une nouvelle méthode static expansion.

	static double expansion(double distanceKM) {

		if (distanceKM < 14) {
			System.out.println("Oh mais c'est super rapide!");
		}

		if (distanceKM >= 14) {
			System.out.println("Je rêve ou c'est plus rapide que la lumière ?");
		}

		return distanceKM;
	}

	int revolution(int angle) {
		return angle / 360;
	}

	int rotation(int angle) {
		return angle / 360;

	}

}
