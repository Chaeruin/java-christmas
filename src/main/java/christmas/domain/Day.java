package christmas.domain;

import christmas.enums.Star;

public class Day {
    private int date;
    private boolean isWeekEnd;
    private Star starDate;

    public Day(int date, boolean isWeekEnd, Star starDate) {
        this.date = date;
        this.isWeekEnd = isWeekEnd;
        this.starDate = starDate;
    }

    public int getDate() {
        return this.date;
    }

    public boolean getIsWeekEnd() {
        return this.isWeekEnd;
    }

    public Star getStarDate() {
        return this.starDate;
    }

}
