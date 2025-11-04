package personnages;

public class Romains {
	private String nom;
	private int force;

	public Romains(String nom, int force) {
	    this.nom = nom;
	    this.force = force;
	    if (!isInvariantVerified()) {
	        System.out.println("Attention : force invalide à la création !");
	    }
	}


	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
	    if (forceCoup <= 0) {
	        throw new IllegalArgumentException("La force du coup reçu doit être positive !");
	    }

	    int forceAvant = force;
	    force -= forceCoup;

	    if (force < 1) {
	        force = 0;
	        parler("J'abandonne !");
	    } else {
	        parler("Aïe");
	    }

	    if (!isInvariantVerified()) {
	        System.out.println("Invariant violé : force négative !");
	    }

	    if (force > forceAvant) {
	        throw new IllegalStateException("Postcondition violée : la force d'un Romain n'a pas diminué !");
	    }
	}


	private boolean isInvariantVerified() {
	    return force >= 0;
	}
	public static void main(String[] args) {
	    Romains minus = new Romains("Minus", 6);
	    System.out.println("Force de Minus après création : " + minus.force);
	}


}

