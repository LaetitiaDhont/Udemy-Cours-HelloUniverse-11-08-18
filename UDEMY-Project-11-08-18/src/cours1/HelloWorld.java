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
	// Utiliser la structure it�rative avec for

	public static void main(String[] args) {

		for (int nbrePlanetes = 8; nbrePlanetes < 11; nbrePlanetes++) {

			if (nbrePlanetes == 8) {
				System.out.println(
						"Aux derni�res nouvelles, le nombre total de plan�tes dans le syst�me solaire est de 8");
			}

			else if (nbrePlanetes == 9) {
				System.out.println("Il y a quelques ann�es cependant,elles �taient au nombre de : 9");
			}

			else {
				System.out.println(
						"Au cours de l'�re moderne, le nombre de plan�tes n'a jamais �t� officiellement de : 10");
			}

		}
	}
}
