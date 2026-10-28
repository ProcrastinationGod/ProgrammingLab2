package move;

import ru.ifmo.se.pokemon.*;

public final class SandAttack extends StatusMove {
    
    public SandAttack() {
        super(Type.GROUND, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ACCURACY, -1);
    }

    @Override
    protected String describe() {
        return "использует атаку Sand Attack";
    }
}
