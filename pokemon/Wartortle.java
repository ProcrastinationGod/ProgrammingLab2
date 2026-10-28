package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public class Wartortle extends Squirtle {
    
    public Wartortle(String name, int level) {
        super(name, level);

        this.setType(Type.WATER);
        this.setStats(59, 63, 80, 65, 80, 58);
        this.setMove(new PoisonPowder(), new DoubleTeam(), new Psystrike());
    }
}