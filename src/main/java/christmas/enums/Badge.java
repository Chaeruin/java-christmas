package christmas.enums;

public enum Badge {
    STAR_BADGE("별", 5000),
    TREE_BADGE("트리", 10_000),
    SANTA_BADGE("산타", 20_000);

    private String name;
    private int standard;

    Badge(String name, int standard) {
        this.name = name;
        this.standard = standard;
    }

    public String getName() {
        return this.name;
    }

}
