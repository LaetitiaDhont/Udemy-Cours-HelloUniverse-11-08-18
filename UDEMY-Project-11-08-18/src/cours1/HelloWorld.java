package cours1;

public class HelloWorld {
	
	// D�claration de la premi�re variable
	// Remplacer les prints par la classe String
	// Ajouter les op�rateurs d'incr�mentation
	// Utilisation de la concat�nation
	// Premi�re instruction conditionnelle
	// Ajout du else
	
	public static void main(String[] args) {
		String premiereNouvelle ="Aux derni�res nouvelles, le nombre total de plan�tes dans le syst�me solaire est de:";
		int nbrePlanetes = 8;
		if (nbrePlanetes == 8) {
		System.out.println(premiereNouvelle + nbrePlanetes);
		}
		
		else {
		String deuxiemeNouvelle = "Il y a quelques ann�es cependant,elles �taient au nombre de :";
		nbrePlanetes++;
		System.out.println(deuxiemeNouvelle + nbrePlanetes);
		}
	}

}
