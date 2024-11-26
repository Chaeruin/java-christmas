package christmas.enums;

public enum Star {

    STAR_DATE(true),
    NOT_STAR_DATE(false);


    private boolean isStarDate;

    Star(boolean isStarDate) {
        this.isStarDate = isStarDate;
    }

    public boolean getIsStarDate() {
        return this.isStarDate;
    }
}
