package move;

import ru.ifmo.se.pokemon.*;

public final class Embargo extends StatusMove {
    public Embargo() {
        super(Type.DARK, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect embargoEffect = new Effect().turns(5);

        p.addEffect(embargoEffect);
    }

    @Override
    protected String describe() {
        return "использует атаку Embargo";
    }
}
