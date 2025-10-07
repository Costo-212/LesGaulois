package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romains;
import personnages.Druide;

public class TestGaulois {
    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Ast�rix", 8);
        Gaulois obelix = new Gaulois("Ob�lix", 16);
        Romains minus = new Romains("Minus", 6);
        Romains brutus = new Romains("Brutus", 14);
        Druide panoramix = new Druide("Panoramix", 2);

        System.out.println("Le Gaulois " + asterix + " : \"Bonjour Ob�lix.\"");
        System.out.println("Le Gaulois " + obelix + " : \"Bonjour Ast�rix. Ca te dirais d'aller chasser des sangliers ?\"");
        System.out.println("Le Gaulois " + asterix + " : \"Oui tr�s bonne id�e.\"");

        System.out.println("Dans la for�t " + asterix + " et " + obelix + " tombent nez � nez sur le romain " + minus + ".");

        for (int i = 0; i < 3; i++) {
            asterix.frapper(minus);
        }

        panoramix.fabriquerPotion(4, 3);
        panoramix.booster(obelix);
        panoramix.booster(asterix);

        for (int i = 0; i < 3; i++) {
            asterix.frapper(brutus);
        }
    }
}