package personnages;

public class Gaulois {
	private String nom;
	private int force;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	public int getForce() {
		return force;
	}
	public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Astérix", 8);
        System.out.println(asterix);  // Affiche le nom complet de la classe + @ + adresse mémoire en hexadécimal
    }
}