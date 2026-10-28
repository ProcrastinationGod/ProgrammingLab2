import pokemon.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon squirtle = new Squirtle("Сквиртл", 1);
        Pokemon wartortle = new Wartortle("Вартортл", 16);
        Pokemon blastoise = new Blastoise("Бластойз", 36);
        
        Pokemon mismagius = new Mismagius("Мисмагиус", 1);
        Pokemon lapras = new Lapras("Лапрас", 1);
        Pokemon ditto = new Ditto("Дитто", 1);

        b.addAlly(squirtle);
        b.addAlly(wartortle);
        b.addAlly(blastoise);

        b.addFoe(mismagius);
        b.addFoe(lapras);
        b.addFoe(ditto);

        b.go();
    }
}