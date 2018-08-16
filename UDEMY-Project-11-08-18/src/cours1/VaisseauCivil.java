package cours1;

public class VaisseauCivil extends Vaisseau {

	
	VaisseauCivil(String type) {
		if (type.equals("CARGO")) {
			tonnageMax = 500;
		}

		else if (type.equals("VAISSEAU-MONDE")) {
			tonnageMax = 2000;
		}

		
	}
	
	int emporterCargaison(int cargaison) {
		int tonnageRestant = tonnageMax - tonnageActuel;
		if (cargaison > tonnageRestant) {
			tonnageActuel = tonnageMax;
			return cargaison - tonnageRestant;
		}
		
		else {
			// similar to tonnageActuel = tonnageActuel + cargaison;
			tonnageActuel += cargaison;
			return 0;
		}

		
	}

}
