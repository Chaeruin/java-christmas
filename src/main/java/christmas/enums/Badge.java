package christmas.enums;

public enum Badge {
    STAR_BADGE(5000),
    TREE_BADGE(10_000),
    SANTA_BADGE(20_000);

    private int standard;

    Badge(int standard) {
        this.standard = standard;
    }

    public int getStandard() {
        return this.standard;
    }
}
