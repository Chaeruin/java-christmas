package christmas.domain;

import christmas.enums.BenefitType;

public class Benefit {
    private final BenefitType benefitType;
    private final Day day;

    private final int benefitPrice;

    public Benefit(BenefitType benefitType, Day day, int benefitPrice) {
        this.benefitType = benefitType;
        this.day = day;
        this.benefitPrice = benefitPrice;
    }

    public BenefitType getBenefitType() {
        return this.benefitType;
    }

    public int getBenefitPrice() {
        return this.benefitPrice;
    }

}
