package cours1;

public class HelloWorld {
	
	// Déclaration de la première variable
	// Remplacer les prints par la classe String
	// Ajouter les opérateurs d'incrémentation
	// Utilisation de la concaténation
	// Première instruction conditionnelle
	// Ajout du else
	// Ajout du else if 
	
	public static void main(String[] args) {
		
		int nbrePlanetes = 8;
		
		if (nbrePlanetes == 8) {
			System.out.println("Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de:" + nbrePlanetes);

		}
		
		else if (nbrePlanetes != 8){
			System.out.println("Au cours de l'ère moderne, le nombre de planètes n'a jamais été officiellement de : 44");
		}
		
		else {
			
		System.out.println("Il y a quelques années cependant,elles étaient au nombre de :");
		nbrePlanetes++;
		
		}
		
	}

}
