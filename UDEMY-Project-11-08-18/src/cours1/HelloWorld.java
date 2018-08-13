package cours1;

public class HelloWorld {
	
	// Déclaration de la première variable
	// Remplacer les prints par la classe String
	// Ajouter les opérateurs d'incrémentation
	// Utilisation de la concaténation
	// Première instruction conditionnelle
	// Ajout du else
	
	public static void main(String[] args) {
		String premiereNouvelle ="Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de:";
		int nbrePlanetes = 8;
		if (nbrePlanetes == 8) {
		System.out.println(premiereNouvelle + nbrePlanetes);
		}
		
		else {
		String deuxiemeNouvelle = "Il y a quelques années cependant,elles étaient au nombre de :";
		nbrePlanetes++;
		System.out.println(deuxiemeNouvelle + nbrePlanetes);
		}
	}

}
