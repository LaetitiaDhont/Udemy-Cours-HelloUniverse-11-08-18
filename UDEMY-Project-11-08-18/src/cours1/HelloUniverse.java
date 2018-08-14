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
	// Instanciation des planètes Terre, Mars, Mercure, Jupiter, Saturne, Soleil, Uranus, Neptune, Pluton et Vénus
	// Afficher les valeurs de la planète Jupiter
	// Instanciation de la planète X pour utiliser le mot clé null 
	// Création des premières méthodes rotation et révolution 
	// Appel de ses méthodes avec Neptune et Mars
	

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
		
		// Instanciation de la planète Vénus 
		
		Venus.matiere = "Tellurique";
		Venus.nom = "Vénus";
		Venus.diametreKm = 12100;
		
		// Instanciation de la planète Terre
		
		Terre.matiere = "Tellurique";
		Terre.nom = "Terre";
		Terre.diametreKm = 12756;
		
		// Instanciation de la planète Mercure 
		
		Mercure.matiere = "Tellurique";
		Mercure.nom = "Mercure";
		Mercure.diametreKm = 4880;
		
		// Instanciation de la planète Mars
		
		Mars.matiere = "Tellurique";
		Mars.nom = "Mars";
		Mars.diametreKm = 6792;
		
		// Instanciation de la planète Jupiter
		
		Jupiter.matiere = "Gazeuse";
		Jupiter.nom = "Jupiter";
		Jupiter.diametreKm = 142984;
		
		// Instanciation de la planète Soleil 
		
		Soleil.matiere = "Gazeux";
		Soleil.nom ="Soleil";
		Soleil.diametreKm = 149600000;
		
		// Instanciation de la planète Saturne
		
		Saturne.matiere = "Gazeuse";
		Saturne.nom = "Saturne";
		Saturne.diametreKm = 120536;
		
		// Instanciation de la planète Uranus 
		
		Uranus.matiere = "Gazeuse";
		Uranus.nom = "Uranus";
		Uranus.diametreKm = 51118;
		
		// Instanciation de la planète Pluton 
		
		Pluton.matiere = "Gazeuse";
		Pluton.nom = "Pluton";
		Pluton.diametreKm = 2300;
		
		// Instanciation de la planète Neptune 
		
		Neptune.matiere = "Gazeuse";
		Neptune.nom = "Neptune";
		Neptune.diametreKm = 49532;

		
		System.out.println(Jupiter.nom + " " + "est une planète " + Jupiter.matiere + " " + "avec un diamètre de " + Jupiter.diametreKm + " " + "kilomètres.");

		
		// Instanciation de la planète X
		
		System.out.println(X.nom + " " + "est une planète " + X.matiere + " " + "avec un diamètre de " + X.diametreKm + " " + "kilomètres.");
		
		
		// Appelle de mes méthodes 
		
		System.out.println("Neptune à effectué " + Neptune.revolution(-3542) + " tours autour de son étoile.");
		System.out.println("Mars à effectué " + Mars.rotation(-684) + " tours sur elle même.");
		System.out.println("Vénus à effectué " + Venus.rotation(1250) + " tours sur elle même.");


	}

}
