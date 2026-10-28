package move;

import ru.ifmo.se.pokemon.*;

public final class FakeOut extends PhysicalMove {
    public FakeOut() {
        super(Type.NORMAL, 40, 100, 3, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.flinch(p);
    }

    @Override 
    protected String describe() {
        return "использует атаку Fake Out";
    }
}
