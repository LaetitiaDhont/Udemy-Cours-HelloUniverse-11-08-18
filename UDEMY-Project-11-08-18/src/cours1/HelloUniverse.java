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

		Planete Venus = new Planete("Venus");
		Planete Mars = new Planete("Mars");
		Planete Mercure = new Planete("Mercure");
		Planete Terre = new Planete("Terre");
		Planete Soleil = new Planete("Soleil");
		Planete Jupiter = new Planete("Jupiter");
		Planete Saturne = new Planete("Saturne");
		Planete Uranus = new Planete("Uranus");
		Planete Pluton = new Planete("Pluton");
		Planete Neptune = new Planete("Neptune");
		Planete X = new Planete("X");

		// Instanciation de la plan�te V�nus

		Venus.matiere = "Tellurique";
		Venus.nom = "V�nus";
		Venus.diametreKm = 12100;

		// Instanciation de la plan�te Terre

		Terre.matiere = "Tellurique";
		Terre.nom = "Terre";
		Terre.diametreKm = 12756;

		// Instanciation de la plan�te Mercure

		Mercure.matiere = "Tellurique";
		Mercure.nom = "Mercure";
		Mercure.diametreKm = 4880;

		// Instanciation de la plan�te Mars

		Mars.matiere = "Tellurique";
		Mars.nom = "Mars";
		Mars.diametreKm = 6792;

		// Instanciation de la plan�te Jupiter

		Jupiter.matiere = "Gazeuse";
		Jupiter.nom = "Jupiter";
		Jupiter.diametreKm = 142984;

		// Instanciation de la plan�te Soleil

		Soleil.matiere = "Gazeux";
		Soleil.nom = "Soleil";
		Soleil.diametreKm = 149600000;

		// Instanciation de la plan�te Saturne

		Saturne.matiere = "Gazeuse";
		Saturne.nom = "Saturne";
		Saturne.diametreKm = 120536;

		// Instanciation de la plan�te Uranus

		Uranus.matiere = "Gazeuse";
		Uranus.nom = "Uranus";
		Uranus.diametreKm = 51118;

		// Instanciation de la plan�te Pluton

		Pluton.matiere = "Gazeuse";
		Pluton.nom = "Pluton";
		Pluton.diametreKm = 2300;

		// Instanciation de la plan�te Neptune

		Neptune.matiere = "Gazeuse";
		Neptune.nom = "Neptune";
		Neptune.diametreKm = 49532;

		System.out.println(Jupiter.nom + " " + "est une plan�te " + Jupiter.matiere + " " + "avec un diam�tre de "
				+ Jupiter.diametreKm + " " + "kilom�tres.");

		// Instanciation de la plan�te X

		System.out.println(X.nom + " " + "est une plan�te " + X.matiere + " " + "avec un diam�tre de " + X.diametreKm
				+ " " + "kilom�tres.");

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

		// Utilisation de ma classe Vaisseau m�thodes + objets

		Vaisseau vaisseau1 = new Vaisseau();

		vaisseau1.type = "Fr�gate";
		vaisseau1.nbrePassagers = 9;

		Mars.acceuillirVisiteurs(vaisseau1);

		Vaisseau vaisseau2 = new Vaisseau();

		vaisseau2.type = "Croiseur";
		vaisseau2.nbrePassagers = 42;

		Mars.acceuillirVisiteurs(vaisseau2);

		System.out.println("Le nombre d'humains actuellement sur " + Mars.nom + " est de " + Mars.totalVisiteurs + ".");
		System.out.println("La forme d'une plan�te est " + Planete.forme + ".");
		System.out.println("La forme de la plan�te " + Mars.nom + " est " + Planete.forme + ".");

		// Appelle de ma m�thode static expansion

		Planete.expansion(10.5);
		Planete.expansion(14.2);

		// Afficher le nombre de plan�tes gr�ce au constructeur

		System.out.println("Le nombre de plan�tes est de " + Planete.nbrePlanetesDecouvertes + ".");
		
		// Attaque spaciale !
		
		VaisseauDeGuerre vaisseau3 = new VaisseauDeGuerre();
		
		vaisseau3.type = "Chasseur";
		vaisseau3.blindage = 156;
		vaisseau3.resistanceDuBouclier = 2000;
		
		VaisseauCivil vaisseau4 = new VaisseauCivil();
		
		vaisseau4.type = "Vaisseau-Monde";
		vaisseau4.blindage = 4784;
		vaisseau4.resistanceDuBouclier = 10000;
		
		vaisseau3.activerBouclier();
		vaisseau4.activerBouclier();
		
		vaisseau3.attaque(vaisseau4, "lasers photoniques", 3);
		
		vaisseau4.desactiverBouclier();
		
		System.out.println("Le vaisseau a �t� attaqu� ! Il lui reste un bouclier de : " + vaisseau4.resistanceDuBouclier +
				" Son blindage est dor�navant de : " + vaisseau4.blindage
				);
		

	}

}
