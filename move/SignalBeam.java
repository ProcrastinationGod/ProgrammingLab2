package move;

import ru.ifmo.se.pokemon.*;

public final class SignalBeam extends SpecialMove {
    public SignalBeam() {
        super(Type.BUG, 75, 100);
    }

    @Override 
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            Effect.confuse(p);
        }
    }

     @Override
    protected String describe() {
        return "использует атаку Signal Beam";
    }
}
