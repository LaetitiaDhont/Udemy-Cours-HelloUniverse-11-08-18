package cours1;

// Création de ma classe 

public class PlaneteTellurique extends Planete implements Habitable {
	
	// Utilisation du mot clé super 
	
	PlaneteTellurique(String nom) {
		super(nom);
	}

	public Vaisseau acceuillirVisiteurs(Vaisseau vaisseau) {
		totalVisiteurs = totalVisiteurs + vaisseau.nbrePassagers;

		// Si la valeur de ma variable de type Vaisseau vaisseauActuellementAcoste est
		// null alors ce la signifie qu'il y a aucun vaisseau.
		
		if (vaisseau instanceof VaisseauDeGuerre) {
			((VaisseauDeGuerre) vaisseau).desactiverArmes();
		}

		if (vaisseauActuellementAcoste == null)

		{
			System.out.println("Aucun vaisseau ne s'en va.");
		}

		// Sinon, il y a un vaisseau !

		else {
			System.out.println("Un vaisseau de type " + vaisseauActuellementAcoste.type + " doit s'en aller.");
		}

		Vaisseau vaisseauPrecedent = vaisseauActuellementAcoste;
		vaisseauActuellementAcoste = vaisseau;
		return vaisseauPrecedent;

		
		
		
		
	}
}
