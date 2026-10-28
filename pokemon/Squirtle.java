package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public class Squirtle extends Pokemon {
  
  public Squirtle(String name, int level) {
    super(name, level);

    this.setType(Type.WATER);
    this.setStats(44, 48, 65, 50, 64, 43);
    this.setMove(new PoisonPowder(), new DoubleTeam());
  }
}
