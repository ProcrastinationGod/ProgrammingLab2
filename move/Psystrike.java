package move;

import ru.ifmo.se.pokemon.*;

public final class Psystrike extends SpecialMove {
    
    public Psystrike() {
        super(Type.PSYCHIC, 100, 100);
    }

    @Override
    protected String describe() {
        return "использует атаку Psystrike";
    }
}