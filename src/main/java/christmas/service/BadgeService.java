package christmas.service;

import christmas.enums.Badge;

public class BadgeService {

    public Badge giveBadge(int benefitPrice) {
        if (benefitPrice >= 5000 && benefitPrice < 10000) {
            return Badge.STAR_BADGE;
        } else if (benefitPrice >= 10000 && benefitPrice < 20000) {
            return Badge.TREE_BADGE;
        } else if (benefitPrice >= 20000) {
            return Badge.SANTA_BADGE;
        }
        return null;
    }
}
