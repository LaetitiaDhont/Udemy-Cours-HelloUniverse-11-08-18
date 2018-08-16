package cours1;

import java.util.Scanner;

public class HelloUniverse {

	// D�claration de la premi�re variable
	// Remplacer les prints par la classe String
	// Ajouter les op�rateurs d'incr�mentation
	// Utilisation de la concat�nation
	// Premi�re instruction conditionnelle
	// Ajout du else
	// Ajout du else if
	// Remplacer les else / else if / else par un switch case default break
	// Utiliser la structure it�rative avec for
	// Utiliser la structure for avec switch
	// Remplacer la boucle for par une boucle while
	// Instanciation des plan�tes Terre, Mars, Mercure, Jupiter, Saturne, Soleil,
	// Uranus, Neptune, Pluton et V�nus
	// Afficher les valeurs de la plan�te Jupiter
	// Instanciation de la plan�te X pour utiliser le mot cl� null
	// Cr�ation des premi�res m�thodes rotation et r�volution
	// Appel de ses m�thodes avec Neptune et Mars
	// Surcharge des m�thodes
	// Cr�ation d'une nouvelle classe Atmosph�re
	// Instances de mes plan�tes compl�t�e avec le nom
	// Il n'est donc plus possible de construire une plan�te sans nom !

	public static void main(String[] args) {

		// Mes instances

		PlaneteTellurique Venus = new PlaneteTellurique("Venus");
		PlaneteTellurique Mars = new PlaneteTellurique("Mars");
		PlaneteTellurique Mercure = new PlaneteTellurique("Mercure");
		PlaneteTellurique Terre = new PlaneteTellurique("Terre");
		PlaneteGazeuse Soleil = new PlaneteGazeuse("Soleil");
		PlaneteGazeuse Jupiter = new PlaneteGazeuse("Jupiter");
		PlaneteGazeuse Saturne = new PlaneteGazeuse("Saturne");
		PlaneteGazeuse Uranus = new PlaneteGazeuse("Uranus");
		PlaneteGazeuse Pluton = new PlaneteGazeuse("Pluton");
		PlaneteGazeuse Neptune = new PlaneteGazeuse("Neptune");

		// Instanciation de la plan�te V�nus

		Venus.nom = "V�nus";
		Venus.diametreKm = 12100;

		// Instanciation de la plan�te Terre

		Terre.nom = "Terre";
		Terre.diametreKm = 12756;

		// Instanciation de la plan�te Mercure

		Mercure.nom = "Mercure";
		Mercure.diametreKm = 4880;

		// Instanciation de la plan�te Mars

		Mars.nom = "Mars";
		Mars.diametreKm = 6792;

		// Instanciation de la plan�te Jupiter

		Jupiter.nom = "Jupiter";
		Jupiter.diametreKm = 142984;

		// Instanciation de la plan�te Soleil

		Soleil.nom = "Soleil";
		Soleil.diametreKm = 149600000;

		// Instanciation de la plan�te Saturne

		Saturne.nom = "Saturne";
		Saturne.diametreKm = 120536;

		// Instanciation de la plan�te Uranus

		Uranus.nom = "Uranus";
		Uranus.diametreKm = 51118;

		// Instanciation de la plan�te Pluton

		Pluton.nom = "Pluton";
		Pluton.diametreKm = 2300;

		// Instanciation de la plan�te Neptune

		Neptune.nom = "Neptune";
		Neptune.diametreKm = 49532;

		// La classe Scanner

		VaisseauCivil vaisseau1 = new VaisseauCivil("VAISSEAU-MONDE");
		VaisseauCivil vaisseau2 = new VaisseauCivil("CARGO");
		VaisseauDeGuerre vaisseau3 = new VaisseauDeGuerre("FREGATE");
		VaisseauDeGuerre vaisseau4 = new VaisseauDeGuerre("CHASSEUR");
		VaisseauDeGuerre vaisseau5 = new VaisseauDeGuerre("CROISEUR");

		Scanner sc = new Scanner(System.in);
		System.out.println("Quel vaisseau souhaitez-vous utiliser ? Indiquer le type du vaisseau.");
		String inputVaisseau = sc.nextLine();

		System.out.println("Sur quel plan�te voulez-vous atterir ?");
		String inputPlanete = sc.nextLine();

		System.out.println("Quel tonnage de cargaison souhaitez-vous embarquer ?");
		int inputCargaison = sc.nextInt();

		Vaisseau vaisseau = null;

		switch (inputVaisseau) {
		case "CHASSEUR":
			vaisseau = vaisseau4;
			break;

		case "FREGATE":
			vaisseau = vaisseau3;
			break;
		case "VAISSEAU-MONDE":
			vaisseau = vaisseau1;
			break;
		case "CARGO":
			vaisseau = vaisseau2;
			break;
		case "CROISEUR":
			vaisseau = vaisseau5;
			break;
		}

		PlaneteTellurique planete = null;

		switch (inputPlanete) {
		case "TERRE":
			planete = Terre;
			break;

		case "VENUS":
			planete = Venus;
			break;
		case "MARS":
			planete = Mars;
			break;
		case "MERCURE":
			planete = Mercure;
			break;
		}
		
		planete.acceuillirVisiteurs(vaisseau);
		int rejet = vaisseau.emporterCargaison(inputCargaison);
		System.out.println("Le rejet est de : " + rejet);
	}

}
