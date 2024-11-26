package christmas.enums;

public enum BenefitType {

    D_DAY_DISCOUNT("크리스마스 디데이 할인", 1000),
    WEEKDAY_DISCOUNT("평일 할인", 2023),
    WEEKEND_DISCOUNT("주말 할인", 2023),
    STAR_DATE_DISCOUNT("특별 할인", 1000),
    GIFT_PRESENT("증정 이벤트", 25000);


    private String discountName;
    private int discountPrice;

    BenefitType(String discountName, int discountPrice) {
        this.discountName = discountName;
        this.discountPrice = discountPrice;
    }

    public String getDiscountName() {
        return this.discountName;
    }

    public int getDiscountPrice() {
        return this.discountPrice;
    }
}
