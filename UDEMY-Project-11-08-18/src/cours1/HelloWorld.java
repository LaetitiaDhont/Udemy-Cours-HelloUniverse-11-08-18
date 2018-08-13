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

	public static void main(String[] args) {
		for (int nbrePlanetes = 8; nbrePlanetes < 11; nbrePlanetes++) {
			switch (nbrePlanetes) {
			case 8:
				System.out.println("Auparavant le nombre de planètes était de : " + nbrePlanetes);
				break;
			case 9:
				System.out.println("Actuellement le nombre de planètes est de : " + nbrePlanetes);
				break;
			case 10:
				System.out.println("Le nombre n'a cependant jamais atteint : " + nbrePlanetes);
			}
		}
	}
}
