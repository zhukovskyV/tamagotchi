package world.ucode.peppes;

public enum PeppeType {
    BADMAN("BadMan"),
    CLOWN("Clown");

    private final String name;
    PeppeType(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
