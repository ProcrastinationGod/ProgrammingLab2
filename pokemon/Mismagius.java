package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public final class Mismagius extends Pokemon {

    public Mismagius(String name, int level) {
      super(name, level);

      this.setType(Type.GHOST);
      this.setStats(60, 60, 60, 105, 105, 105);
      this.setMove(new Embargo(), new PoisonSting(), new SignalBeam(), new Swagger());
    }
}
