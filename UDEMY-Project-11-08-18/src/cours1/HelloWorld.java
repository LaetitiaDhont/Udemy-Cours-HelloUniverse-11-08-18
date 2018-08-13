package cours1;

public class HelloWorld {

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

	public static void main(String[] args) {

		int nbrePlanetes = 8;

		while (nbrePlanetes < 11) {
			switch (nbrePlanetes) {
			case 8:
				System.out.println("Auparavant le nombre de planètes était de : " + nbrePlanetes);
				break;
			case 9:
				System.out.println("Le nombre de planètes actuel est de : " + nbrePlanetes);
				break;
			default:
				System.out.println("Le nombre n'a cependant jamais été : " + nbrePlanetes);
			}
			
			nbrePlanetes++;
		}

	}

}
