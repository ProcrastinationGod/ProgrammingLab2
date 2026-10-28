package move;

import ru.ifmo.se.pokemon.*;

public final class Swagger extends StatusMove {
  public Swagger() {
    super(Type.NORMAL, 0, 90);
  }

  @Override
  protected void applyOppEffects(Pokemon p) {
    Effect.confuse(p);
    p.setMod(Stat.ATTACK, 2);
  }

  @Override
  protected String describe() {
    return "использует атаку Swagger";
  }
}
