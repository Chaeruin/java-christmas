package christmas.dto;

import christmas.domain.Day;
import christmas.enums.Star;

public record DayStatus(
        int date,
        boolean isWeekEnd,
        Star starDate
) {
    public static DayStatus of(final Day day) {
        return new DayStatus(
                day.getDate(),
                day.getIsWeekEnd(),
                day.getStarDate()
        );
    }
}
