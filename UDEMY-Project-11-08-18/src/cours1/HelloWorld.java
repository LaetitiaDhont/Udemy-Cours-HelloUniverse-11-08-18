package cours1;

public class HelloWorld {
	
	// D�claration de la premi�re variable
	// Remplacer les prints par la classe String
	// Ajouter les op�rateurs d'incr�mentation
	// Utilisation de la concat�nation
	// Premi�re instruction conditionnelle
	// Ajout du else
	// Ajout du else if 
	
	public static void main(String[] args) {
		
		int nbrePlanetes = 8;
		
		if (nbrePlanetes == 8) {
			System.out.println("Aux derni�res nouvelles, le nombre total de plan�tes dans le syst�me solaire est de:" + nbrePlanetes);

		}
		
		else if (nbrePlanetes != 8){
			System.out.println("Au cours de l'�re moderne, le nombre de plan�tes n'a jamais �t� officiellement de : 44");
		}
		
		else {
			
		System.out.println("Il y a quelques ann�es cependant,elles �taient au nombre de :");
		nbrePlanetes++;
		
		}
		
	}

}
