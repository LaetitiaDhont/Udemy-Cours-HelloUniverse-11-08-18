package cours1;

public class VaisseauCivil extends Vaisseau {

	VaisseauCivil(TypeVaisseau type) {
		if (type == TypeVaisseau.cargo) {
			tonnageMax = 500;
		}

		else if (type == TypeVaisseau.vaisseauMonde ) {
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
