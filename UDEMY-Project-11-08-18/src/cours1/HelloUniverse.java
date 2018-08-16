package cours1;

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

		// Appelle de mes m�thodes

		System.out.println("Neptune � effectu� " + Neptune.revolution(-3542) + " tours autour de son �toile.");
		System.out.println("Mars � effectu� " + Mars.rotation(-684) + " tours sur elle m�me.");
		System.out.println("V�nus � effectu� " + Venus.rotation(1250) + " tours sur elle m�me.");

		System.out
				.println("Le nombre d'humains ayant d�j� s�journ� sur Mars est actuellement de " + Mars.totalVisiteurs);

		// Propri�t�s sous forme d'objet

		Atmosphere atmosphereUranus = new Atmosphere();

		atmosphereUranus.tauxHydrogene = 83f;
		atmosphereUranus.tauxDHelium = 15f;
		atmosphereUranus.tauxMethane = 2.5f;

		Uranus.atmosphere = atmosphereUranus;

		System.out.println("L'atmosph�re d'Uranus est compos� de " + Uranus.atmosphere.tauxHydrogene
				+ " % d'hydrog�ne, de " + Uranus.atmosphere.tauxDHelium + " % d'h�lium et de "
				+ Uranus.atmosphere.tauxMethane + " % de m�thane.");

		// Appelle de ma m�thode static expansion

		Planete.expansion(10.5);
		Planete.expansion(14.2);

		// Afficher le nombre de plan�tes gr�ce au constructeur

		System.out.println("Le nombre de plan�tes est de " + Planete.nbrePlanetesDecouvertes + ".");

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

		System.out.println("Le vaisseau a �t� attaqu� ! Il lui reste un bouclier de : " + vaisseau4.resistanceDuBouclier
				+ " Son blindage est dor�navant de : " + vaisseau4.blindage);

		// Les interfaces avec l'exemple de Mars

		Mars.acceuillirVisiteurs(vaisseau4);
		Mars.acceuillirVisiteurs(vaisseau3);
		
		// Classes et m�thodes abstraites
		
		VaisseauDeGuerre vaisseau5 = new VaisseauDeGuerre("CHASSEUR");
		Terre.acceuillirVisiteurs(vaisseau5);
		System.out.println("Le chasseur a rejet� " + vaisseau5.emporterCargaison(20) + " tonnes.");
		
		
		VaisseauDeGuerre vaisseau6 = new VaisseauDeGuerre("FREGATE");
		vaisseau6.nbrePassagers = 100;
		Terre.acceuillirVisiteurs(vaisseau6);
		System.out.println("La fregate a rejet� " + vaisseau6.emporterCargaison(45) + " tonnes.");		
		System.out.println("La fregate a rejet� " + vaisseau6.emporterCargaison(12) + " tonnes.");
		
		
		VaisseauCivil vaisseau7 = new VaisseauCivil("VAISSEAU-MONDE");
		Terre.acceuillirVisiteurs(vaisseau7);
		System.out.println("Le vaisseau-monde a rejet� " + vaisseau7.emporterCargaison(1560) + " tonnes.");
		System.out.println("Le vaisseau-monde a rejet� " + vaisseau7.emporterCargaison(600) + " tonnes.");
		
	}

}
