package personnages;

public class Gaulois {
    private String nom;
    private int force;
    private int effetPotion = 1;

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

    public void frapper(Romains romain) {
        System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
        int forceCoup = (force * effetPotion) / 3;
        romain.recevoirCoup(forceCoup);
        if (effetPotion > 1) {
            effetPotion--;
        }
    }

    public void boirePotion(int forcePotion) {
        effetPotion = forcePotion;
        parler("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée.");
    }

    public String toString() {
        return nom;
    }

    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Astérix", 8);
        System.out.println(asterix);
    }
}