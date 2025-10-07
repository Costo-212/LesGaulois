package personnages;

public class Village {
    private String nom;
    private Gaulois[] villageois;
    private int nbVillageois = 0;
    private Gaulois chef;

    public Village(String nom, int nbVillageoisMaximum) {
        this.nom = nom;
        this.villageois = new Gaulois[nbVillageoisMaximum];
    }

    public String getNom() {
        return nom;
    }

    public Gaulois getChef() {
        return chef;
    }

    public void setChef(Gaulois chef) {
        this.chef = chef;
    }

    public void ajouterVillageois(Gaulois gaulois) {
        if (nbVillageois < villageois.length) {
            villageois[nbVillageois] = gaulois;
            nbVillageois++;
        }
    }

    public Gaulois trouverVillageois(int numVillageois) {
        if (numVillageois >= 0 && numVillageois < nbVillageois) {
            return villageois[numVillageois];
        }
        return null;
    }

    public void afficherVillage() {
        System.out.println("Village de " + nom + " dirigé par " + chef.getNom());
        System.out.println("Villageois :");
        for (int i = 0; i < nbVillageois; i++) {
            System.out.println("- " + villageois[i].getNom());
        }
    }
}