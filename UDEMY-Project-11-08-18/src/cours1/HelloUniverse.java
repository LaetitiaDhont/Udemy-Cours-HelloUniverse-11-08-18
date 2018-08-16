package cours1;

public class HelloUniverse {

	// Déclaration de la première variable
	// Remplacer les prints par la classe String
	// Ajouter les opérateurs d'incrémentation
	// Utilisation de la concaténation
	// Première instruction conditionnelle
	// Ajout du else
	// Ajout du else if
	// Remplacer les else / else if / else par un switch case default break
	// Utiliser la structure itérative avec for
	// Utiliser la structure for avec switch
	// Remplacer la boucle for par une boucle while
	// Instanciation des planètes Terre, Mars, Mercure, Jupiter, Saturne, Soleil,
	// Uranus, Neptune, Pluton et Vénus
	// Afficher les valeurs de la planète Jupiter
	// Instanciation de la planète X pour utiliser le mot clé null
	// Création des premières méthodes rotation et révolution
	// Appel de ses méthodes avec Neptune et Mars
	// Surcharge des méthodes
	// Création d'une nouvelle classe Atmosphère
	// Instances de mes planètes complétée avec le nom
	// Il n'est donc plus possible de construire une planète sans nom !

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

		// Instanciation de la planète Vénus

		Venus.nom = "Vénus";
		Venus.diametreKm = 12100;

		// Instanciation de la planète Terre

		Terre.nom = "Terre";
		Terre.diametreKm = 12756;

		// Instanciation de la planète Mercure

		Mercure.nom = "Mercure";
		Mercure.diametreKm = 4880;

		// Instanciation de la planète Mars

		Mars.nom = "Mars";
		Mars.diametreKm = 6792;

		// Instanciation de la planète Jupiter

		Jupiter.nom = "Jupiter";
		Jupiter.diametreKm = 142984;

		// Instanciation de la planète Soleil

		Soleil.nom = "Soleil";
		Soleil.diametreKm = 149600000;

		// Instanciation de la planète Saturne

		Saturne.nom = "Saturne";
		Saturne.diametreKm = 120536;

		// Instanciation de la planète Uranus

		Uranus.nom = "Uranus";
		Uranus.diametreKm = 51118;

		// Instanciation de la planète Pluton

		Pluton.nom = "Pluton";
		Pluton.diametreKm = 2300;

		// Instanciation de la planète Neptune

		Neptune.nom = "Neptune";
		Neptune.diametreKm = 49532;

		// Appelle de mes méthodes

		System.out.println("Neptune à effectué " + Neptune.revolution(-3542) + " tours autour de son étoile.");
		System.out.println("Mars à effectué " + Mars.rotation(-684) + " tours sur elle même.");
		System.out.println("Vénus à effectué " + Venus.rotation(1250) + " tours sur elle même.");

		System.out
				.println("Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de " + Mars.totalVisiteurs);

		// Propriétés sous forme d'objet

		Atmosphere atmosphereUranus = new Atmosphere();

		atmosphereUranus.tauxHydrogene = 83f;
		atmosphereUranus.tauxDHelium = 15f;
		atmosphereUranus.tauxMethane = 2.5f;

		Uranus.atmosphere = atmosphereUranus;

		System.out.println("L'atmosphère d'Uranus est composé de " + Uranus.atmosphere.tauxHydrogene
				+ " % d'hydrogène, de " + Uranus.atmosphere.tauxDHelium + " % d'hélium et de "
				+ Uranus.atmosphere.tauxMethane + " % de méthane.");

		// Appelle de ma méthode static expansion

		Planete.expansion(10.5);
		Planete.expansion(14.2);

		// Afficher le nombre de planètes grâce au constructeur

		System.out.println("Le nombre de planètes est de " + Planete.nbrePlanetesDecouvertes + ".");

		// Attaque spaciale !

		VaisseauDeGuerre vaisseau3 = new VaisseauDeGuerre("CHASSEUR");

		vaisseau3.type = "Chasseur";
		vaisseau3.blindage = 156;
		vaisseau3.resistanceDuBouclier = 2000;

		VaisseauCivil vaisseau4 = new VaisseauCivil("VAISSEAU-MONDE");

		vaisseau4.blindage = 4784;
		vaisseau4.resistanceDuBouclier = 10000;

		vaisseau3.activerBouclier();
		vaisseau4.activerBouclier();
		
		// Cast VaisseauDeGuerre 

		((VaisseauDeGuerre)vaisseau3).attaque(vaisseau4, "lasers photoniques", 3);

		vaisseau4.desactiverBouclier();

		System.out.println("Le vaisseau a été attaqué ! Il lui reste un bouclier de : " + vaisseau4.resistanceDuBouclier
				+ " Son blindage est dorénavant de : " + vaisseau4.blindage);

		// Les interfaces avec l'exemple de Mars

		Mars.acceuillirVisiteurs(vaisseau4);
		Mars.acceuillirVisiteurs(vaisseau3);
		
		// Classes et méthodes abstraites
		
		VaisseauDeGuerre vaisseau5 = new VaisseauDeGuerre("CHASSEUR");
		Terre.acceuillirVisiteurs(vaisseau5);
		System.out.println("Le chasseur a rejeté " + vaisseau5.emporterCargaison(20) + " tonnes.");
		
		
		VaisseauDeGuerre vaisseau6 = new VaisseauDeGuerre("FREGATE");
		vaisseau6.nbrePassagers = 100;
		Terre.acceuillirVisiteurs(vaisseau6);
		System.out.println("La fregate a rejeté " + vaisseau6.emporterCargaison(45) + " tonnes.");		
		System.out.println("La fregate a rejeté " + vaisseau6.emporterCargaison(12) + " tonnes.");
		
		
		VaisseauCivil vaisseau7 = new VaisseauCivil("VAISSEAU-MONDE");
		Terre.acceuillirVisiteurs(vaisseau7);
		System.out.println("Le vaisseau-monde a rejeté " + vaisseau7.emporterCargaison(1560) + " tonnes.");
		System.out.println("Le vaisseau-monde a rejeté " + vaisseau7.emporterCargaison(600) + " tonnes.");
		
	}

}
