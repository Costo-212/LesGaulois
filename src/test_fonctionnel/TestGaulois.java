package test_fonctionnel;

import personnages.Gaulois;  

public class TestGaulois {
    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Astérix", 8);
        
        Gaulois obelix = new Gaulois("Obélix", 16);
        
        System.out.println("Nom: " + asterix.getNom() + ", Force: " + asterix.getForce());
        System.out.println("Nom: " + obelix.getNom() + ", Force: " + obelix.getForce());
        
        asterix.parler("Bonjour Obélix.");
        obelix.parler("Bonjour Astérix. Ça te dirait d'aller chasser des sangliers ?");
        asterix.parler("Oui très bonne idée.");
    }
    
}
