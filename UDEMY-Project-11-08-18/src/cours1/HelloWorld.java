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

	public static void main(String[] args) {

		int nbrePlanetes = 8;

		switch (nbrePlanetes) {
		case 8:
			System.out.println("Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de 8");
			break;
		case 9:
			System.out.println("Il y a quelques années cependant,elles étaient au nombre de : 9");
			break;
		default:
			System.out.println("Au cours de l'ère moderne, le nombre de planètes n'a jamais été officiellement de : 44");

		}

	}

}
