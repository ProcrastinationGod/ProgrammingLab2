package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public final class Lapras extends Pokemon {
    
    public Lapras(String name, int level) {
        super(name, level);

        this.setType(Type.WATER, Type.ICE);
        this.setStats(130, 85, 80, 85, 95, 60);
        this.setMove(new DoubleTeam(), new FakeOut(), new Overheat());
    }
}
