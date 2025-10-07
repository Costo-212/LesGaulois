package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romains;
import personnages.Druide;

public class TestGaulois {
    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Astérix", 8);
        Gaulois obelix = new Gaulois("Obélix", 16);
        Romains minus = new Romains("Minus", 6);
        Romains brutus = new Romains("Brutus", 14);
        Druide panoramix = new Druide("Panoramix", 2);

        System.out.println("Le Gaulois " + asterix + " : \"Bonjour Obélix.\"");
        System.out.println("Le Gaulois " + obelix + " : \"Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?\"");
        System.out.println("Le Gaulois " + asterix + " : \"Oui très bonne idée.\"");

        System.out.println("Dans la forêt " + asterix + " et " + obelix + " tombent nez à nez sur le romain " + minus + ".");

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