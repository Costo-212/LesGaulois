package personnages;

public class Village {
    private String nom;
    private Gaulois[] villageois;
    private int nbVillageois = 0;
    private Gaulois chef;

    public Village(String nom, int nbVillageoisMaximum, Gaulois chef) {
        if (chef == null) {
            throw new IllegalArgumentException("Le chef du village ne peut pas être null.");
        }	
        this.nom = nom;
        this.villageois = new Gaulois[nbVillageoisMaximum];
        this.chef = chef;
    }

    public String getNom() {
        return nom;
    }

    public Gaulois getChef() {
        return chef;
    }

    public void ajouterVillageois(Gaulois gaulois) {
        if (nbVillageois < villageois.length) {
            villageois[nbVillageois] = gaulois;
            nbVillageois++;
            gaulois.setVillage(this);
        } else {
            System.out.println("Le village de " + nom + " est déjà plein !");
        }
    }

    public Gaulois trouverVillageois(int numVillageois) {
        if (numVillageois >= 1 && numVillageois <= nbVillageois) {
            return villageois[numVillageois - 1]; 
        } else {
            System.out.println("Il n’y a pas autant d'habitants dans notre village !");
            return null;
        }
    }


    public void afficherVillage() {
        System.out.println("Village de " + nom + " dirigé par " + chef.getNom());
        System.out.println("Villageois :");
        for (int i = 0; i < nbVillageois; i++) {
            System.out.println("- " + villageois[i].getNom());
        }
    }
    public static void main(String[] args) {
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
        Village village = new Village("Village des Irréductibles", 30, abraracourcix);
        Gaulois asterix = new Gaulois("Astérix", 8);
        village.ajouterVillageois(asterix);
        Gaulois obelix = new Gaulois("Obélix", 25);
        village.ajouterVillageois(obelix);
        village.afficherVillageois();
        Gaulois doublePolemix = new Gaulois("Doublepolémix", 4);
        abraracourcix.sePresenter();
        asterix.sePresenter();
        doublePolemix.sePresenter();
    }

    public void afficherVillageois() {
        System.out.println("Dans le village \"" + nom + "\" du chef " + chef.getNom());
        System.out.println("vivent les légendaires gaulois :");
        for (int i = 0; i < nbVillageois; i++) {
            System.out.println("- " + villageois[i].getNom());
        }
    }

}
