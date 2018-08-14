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
	// Instanciation des plan�tes Terre, Mars, Mercure, Jupiter, Saturne, Soleil, Uranus, Neptune, Pluton et V�nus
	// Afficher les valeurs de la plan�te Jupiter
	// Instanciation de la plan�te X pour utiliser le mot cl� null 
	// Cr�ation des premi�res m�thodes rotation et r�volution 
	// Appel de ses m�thodes avec Neptune et Mars
	

	public static void main(String[] args) {

		// Mes instances 
		
		Planete Venus  = new Planete();
		Planete Mars = new Planete();
		Planete Mercure = new Planete();
		Planete Terre = new Planete();
		Planete Soleil = new Planete();
		Planete Jupiter = new Planete();
		Planete Saturne = new Planete();
		Planete Uranus = new Planete();
		Planete Pluton = new Planete();
		Planete Neptune = new Planete();
		Planete X = new Planete();
		
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
		Soleil.nom ="Soleil";
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

		
		System.out.println(Jupiter.nom + " " + "est une plan�te " + Jupiter.matiere + " " + "avec un diam�tre de " + Jupiter.diametreKm + " " + "kilom�tres.");

		
		// Instanciation de la plan�te X
		
		System.out.println(X.nom + " " + "est une plan�te " + X.matiere + " " + "avec un diam�tre de " + X.diametreKm + " " + "kilom�tres.");
		
		
		// Appelle de mes m�thodes 
		
		System.out.println("Neptune � effectu� " + Neptune.revolution(-3542) + " tours autour de son �toile.");
		System.out.println("Mars � effectu� " + Mars.rotation(-684) + " tours sur elle m�me.");
		System.out.println("V�nus � effectu� " + Venus.rotation(1250) + " tours sur elle m�me.");


	}

}
