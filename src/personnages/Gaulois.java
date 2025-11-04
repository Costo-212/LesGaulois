import java.util.logging.Logger;
package personnages;

public class Gaulois {
    private static final Logger logger = Logger.getLogger(Gaulois.class.getName());
    private String nom;
//    private int force;
    
    private Village village;
    private int force;
     //TP3
    private Equipement[] trophees = new Equipement[100]; //TP3

    public Gaulois(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public void setVillage(Village village) {
        this.village = village;
    }

    public void parler(String texte) {
        logger.info(prendreParole() + "\"" + texte + "\"");
    }

//    private String prendreParole() {
//        return "Le gaulois " + nom + " : ";
//    }

    public int getForce() {
        return force;
    }

//    public void frapper(Romains romain) {
//        System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
//        int forceCoup = (force * effetPotion) / 3;
//        romain.recevoirCoup(forceCoup);
//        if (effetPotion > 1) {
//            effetPotion--;
//        }
//    }

    public void boirePotion(int forcePotion) {

        parler("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée.");
    }

    public void sePresenter() {
    	String message;
    	message = "Bonjour, je m'apelle ";
    	if (village == null) {
        	

            parler(message + nom + ". Je voyage de villages en villages.");
        } else if (village.getChef() == this) {
            parler(message + nom + ". Je suis le chef du village " + village.getNom() + ".");
        } else {
            parler(message + nom + ". J'habite le village " + village.getNom() + ".");
        }
    }


    public String toString() {
        return nom;
    }

    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Astérix", 8);
        System.out.println(asterix);
    }
    //TP3
    private String prendreParole() {
    	return "Le gaulois " + nom + " : ";
    	return texte;
    	}
    public void frapper(Romain romain) {
        logger.info(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom() + ".");

        for (int i = 0; trophees != null && i < trophees.length; i++, nb_trophees++) {
            this.trophees[nb_trophees] = trophees[i];
        }
    }
    
}