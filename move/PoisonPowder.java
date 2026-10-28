package move;

import ru.ifmo.se.pokemon.*;

public final class PoisonPowder extends StatusMove {

    public PoisonPowder() {
        super(Type.POISON, 0, 75);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.poison(p);
    } 

    @Override 
    protected String describe() {
        return "использует атаку Poison Powder";
    }
}
