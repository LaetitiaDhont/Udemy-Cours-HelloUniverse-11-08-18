package cours1;

public class VaisseauDeGuerre extends Vaisseau {

	// Mes méthodes

	void attaque(Vaisseau cible, String arme, int dureeAttaque) {
		System.out.println("Un vaisseau de type : " + this.type + " attaque un vaisseau de type : " + cible.type
				+ " en utilisant l'arme " + arme + " pendant " + dureeAttaque + " minutes.");
		cible.resistanceDuBouclier = 0;
		cible.blindage = cible.blindage / 2;
	}
}
