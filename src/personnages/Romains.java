package personnages;
import objets.Equipement;

public class Romains {
    private String nom;
    private int force;
    private Equipement[] equipements = new Equipement[2]; 
    private int nbEquipement = 0;

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

    public void sEquiper(Equipement equipement) {
        switch (nbEquipement) {
            case 0:
                ajouterEquipement(equipement);
                break;
            case 1:
                if (equipements[0] == equipement) {
                    System.out.println("Le soldat " + nom + " possède déjà un " + equipement + ".");
                } else {
                    ajouterEquipement(equipement);
                }
                break;
            case 2:
                System.out.println("Le soldat " + nom + " est déjà bien protégé !");
                break;
        }
    }

    private void ajouterEquipement(Equipement equipement) {
        equipements[nbEquipement] = equipement;
        nbEquipement++;
        System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
    }

    public static void main(String[] args) {
        Romains minus = new Romains("Minus", 6);
        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.BOUCLIER);
        minus.sEquiper(Equipement.CASQUE);
    }
}

