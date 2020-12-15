package world.ucode.peppes;

import java.security.PublicKey;

public enum PeppesInteraction {
    PLAY("Play"),
    FEED("Eat"),
    GIVE_WATER("Drink"),
    GIVE_DRUGS("Drugs"),
    CLEAN_UP("Shower");

    private final String name;
    PeppesInteraction(final String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
