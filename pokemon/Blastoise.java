package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public final class Blastoise extends Wartortle {

    public Blastoise(String name, int level) {
        super(name, level);

        this.setType(Type.WATER);
        this.setStats(79, 83, 100, 85, 105, 78);
        this.setMove(new PoisonPowder(), new DoubleTeam(), new Psystrike(), new FireBlast());
    }
}