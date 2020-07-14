package geowars;

public enum WeaponType {
    SINGLE,
    DOUBLE,
    TRIPLE,
    RICOCHET,
    MIRROR;

    public boolean isBetterThan(WeaponType other) {
        return this.ordinal() > other.ordinal();
    }

    public static WeaponType fromMultiplier(int multiplier) {
        if (multiplier > 100) return MIRROR;
        if (multiplier > 10) return RICOCHET;
        if (multiplier > 5) return TRIPLE;
        if (multiplier > 2) return DOUBLE;

        return SINGLE;
    }
}
