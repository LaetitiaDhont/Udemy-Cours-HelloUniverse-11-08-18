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
	// Utiliser la structure for avec switch
	// Remplacer la boucle for par une boucle while

	public static void main(String[] args) {

		int nbrePlanetes = 8;

		while (nbrePlanetes < 11) {
			switch (nbrePlanetes) {
			case 8:
				System.out.println("Auparavant le nombre de plan�tes �tait de : " + nbrePlanetes);
				break;
			case 9:
				System.out.println("Le nombre de plan�tes actuel est de : " + nbrePlanetes);
				break;
			default:
				System.out.println("Le nombre n'a cependant jamais �t� : " + nbrePlanetes);
			}
			
			nbrePlanetes++;
		}

	}

}
