package cours1;

public class HelloWorld {

	// D�claration de la premi�re variable
	// Remplacer les prints par la classe String
	// Ajouter les op�rateurs d'incr�mentation
	// Utilisation de la concat�nation
	// Premi�re instruction conditionnelle
	// Ajout du else
	// Ajout du else if
	// Remplacer les else / else if / else par un switch case default break

	public static void main(String[] args) {

		int nbrePlanetes = 8;

		switch (nbrePlanetes) {
		case 8:
			System.out.println("Aux derni�res nouvelles, le nombre total de plan�tes dans le syst�me solaire est de 8");
			break;
		case 9:
			System.out.println("Il y a quelques ann�es cependant,elles �taient au nombre de : 9");
			break;
		default:
			System.out.println("Au cours de l'�re moderne, le nombre de plan�tes n'a jamais �t� officiellement de : 44");

		}

	}

}
