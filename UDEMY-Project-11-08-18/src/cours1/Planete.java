package cours1;

public abstract class Planete {

	// Mes attributs
	// Ajout de l'attribut forme qui sera static c'est � dire commune � toutes les
	// plan�tes.

	static String forme = "Sph�rique";
	static int nbrePlanetesDecouvertes = 0;
	Atmosphere atmosphere;
	Vaisseau vaisseauActuellementAcoste;
	String nom;
	long diametreKm;
	int totalVisiteurs;

	// Ajout d'un autre constructeur qui a pour argument le nom de nos plan�tes.

	Planete(String nom) {
		this.nom = nom;
		nbrePlanetesDecouvertes++;
	}

	// Mes m�thodes
	// Am�lioration de mes m�thodes qui indique l'angle de rotation de mes plan�tes.
	// + valeur de retour.
	// Surcharge des m�thodes en accueuillant des vaisseaux spaciaux.
	// Utilisation de la m�thode equals.

	// Cr�ation d'une nouvelle m�thode static expansion.

	static double expansion(double distanceKM) {

		if (distanceKM < 14) {
			System.out.println("Oh mais c'est super rapide!");
		}

		if (distanceKM >= 14) {
			System.out.println("Je r�ve ou c'est plus rapide que la lumi�re ?");
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
