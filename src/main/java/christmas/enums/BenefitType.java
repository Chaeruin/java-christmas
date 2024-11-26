package christmas.enums;

public enum BenefitType {

    D_DAY_DISCOUNT(1000),
    WEEKDAY_DISCOUNT(2023),
    WEEKEND_DISCOUNT(2023),
    STAR_DATE_DISCOUNT(1000),
    GIFT_PRESENT(25000);


    private int discountPrice;

    BenefitType(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    public int getDiscountPrice() {
        return this.discountPrice;
    }
}
