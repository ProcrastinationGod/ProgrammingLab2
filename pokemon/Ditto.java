package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public final class Ditto extends Pokemon {
    
  public Ditto(String name, int level) {
    super(name, level);
    
    this.setType(Type.NORMAL);
    this.setStats(48, 48, 48, 48, 48, 48);
    this.setMove(new DoubleTeam(), new FakeOut(), new Overheat(), new SandAttack());
  }
}
