package christmas.service;

import christmas.domain.Benefit;
import christmas.domain.Day;
import christmas.domain.Order;
import christmas.enums.BenefitType;
import christmas.enums.MenuType;
import java.util.LinkedList;
import java.util.List;

public class BenefitService {
    public boolean isOverStandard(List<Order> orderList) {
        int sumPrice = 0;
        for (Order order : orderList) {
            sumPrice += order.getCount() * order.getMenu().getPrice();
        }
        if (sumPrice < 10_000) {
            return false;
        }
        return true;
    }

    public Benefit dDayDiscountBenefit(Day day) {
        return new Benefit(BenefitType.D_DAY_DISCOUNT, day, 1000 * (day.getDate() - 1));
    }

    public Benefit weekDayDiscountBenefit(List<Order> orderList, Day day) {
        int benefitPrice = 0;
        for (Order order : orderList) {
            if (order.getMenu().getMenuType() == MenuType.DESSERT) {
                benefitPrice += BenefitType.WEEKDAY_DISCOUNT.getDiscountPrice() * order.getCount();
            }
        }
        return new Benefit(BenefitType.WEEKDAY_DISCOUNT, day, benefitPrice);
    }

    public Benefit weekEndDiscountBenefit(List<Order> orderList, Day day) {
        int benefitPrice = 0;
        for (Order order : orderList) {
            if (order.getMenu().getMenuType() == MenuType.MAIN) {
                benefitPrice += BenefitType.WEEKEND_DISCOUNT.getDiscountPrice() * order.getCount();
            }
        }
        return new Benefit(BenefitType.WEEKEND_DISCOUNT, day, benefitPrice);
    }

    public Benefit starDayDiscountBenefit(Day day) {
        return new Benefit(BenefitType.STAR_DATE_DISCOUNT, day, 1000);
    }

    public Benefit giftPresentationBenefit(List<Order> orderList, Day day) {
        int sumPrice = 0;
        for (Order order : orderList) {
            sumPrice += order.getCount() * order.getMenu().getPrice();
        }
        if (sumPrice > 120_000) {
            return new Benefit(BenefitType.GIFT_PRESENT, day, BenefitType.GIFT_PRESENT.getDiscountPrice());
        }
        return null;
    }

    public List<Benefit> settingBenefits(Day day, List<Order> orderList) {
        List<Benefit> benefits = new LinkedList<>();
        if (isOverStandard(orderList)) {
            benefits.add(dDayDiscountBenefit(day));
            if (day.getIsWeekEnd()) {
                benefits.add(weekEndDiscountBenefit(orderList, day));
            } else {
                benefits.add(weekDayDiscountBenefit(orderList, day));
            }
            if (day.getStarDate().getIsStarDate()) {
                benefits.add(starDayDiscountBenefit(day));
            }
            benefits.add(giftPresentationBenefit(orderList, day));
        }
        return benefits;
    }

    public int totalBenefitPrice(List<Benefit> benefits) {
        int sumPrice = 0;
        for (Benefit benefit : benefits) {
            sumPrice += benefit.getBenefitPrice();
        }
        return sumPrice;
    }
}
