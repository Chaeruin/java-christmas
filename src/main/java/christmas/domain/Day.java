package christmas.domain;

import christmas.enums.ErrorMessage;
import christmas.enums.Star;

public class Day {
    private int date;
    boolean isWeekEnd;
    Star starDate;

    public Day(int date) {
        validateDay(date);
        this.date = date;
        parseIsWeekEnd(date);
        parseStarDate(date);
    }

    void validateDay(int date) {
        if (date < 1 || date > 31) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_DATE_NUMBER.getErrorMessage());
        }
    }

    void parseIsWeekEnd(int date) {
        if (date % 7 == 1 || date % 7 == 2) {
            this.isWeekEnd = true;
        } else {
            this.isWeekEnd = false;
        }
    }

    void parseStarDate(int date) {
        if (date % 7 == 3 || date == 25) {
            this.starDate = Star.STAR_DATE;
        } else {
            this.starDate = Star.NOT_STAR_DATE;
        }
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
