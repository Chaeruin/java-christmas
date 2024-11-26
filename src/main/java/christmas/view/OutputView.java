package christmas.view;

import christmas.domain.Benefit;
import christmas.domain.Day;
import christmas.domain.Order;
import christmas.enums.Badge;
import java.text.DecimalFormat;
import java.util.List;

public class OutputView {
    public void printStart() {
        System.out.println("안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.");
    }

    public void printEnter() {
        System.out.println();
    }

    public void printDayBenefits(Day day) {
        System.out.println("12월 " + day.getDate() + "일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!");
        printEnter();
    }

    public void printOrder(List<Order> order, int prevPrice) {
        System.out.println("<주문 메뉴>");
        for (Order ord : order) {
            System.out.println(ord.getMenu().getName() + " " + ord.getCount() + "개");
        }
        printEnter();
        DecimalFormat df = new DecimalFormat();
        System.out.println("<할인 전 총주문 금액>");
        System.out.println(df.format(prevPrice) + "원");
        printEnter();
    }


    public void printBenefits(List<Benefit> benefits, int benefitPrice) {
        // 증정 메뉴, 혜택 내역, 총 혜택 금액
        DecimalFormat df = new DecimalFormat();
        if (benefits.size() != 0 && benefits.get(benefits.size() - 1) != null) {
            System.out.print("<증정 메뉴>\n샴페인 1개\n");
        }
        printEnter();
        System.out.println("<혜택 내역>");
        if (benefits.size() == 0) {
            System.out.println("없음");
        }
        for (Benefit benefit : benefits) {
            System.out.println(
                    benefit.getBenefitType().getDiscountName() + ": -" + df.format(benefit.getBenefitPrice()) + "원");
        }
        printEnter();
        System.out.println("<총혜택 금액>");
        System.out.println(df.format(-benefitPrice) + "원");
        printEnter();
    }

    public void printExpectedPriceAndBadge(int totalPrice, Badge badge) {
        // 할인 후 예상 결제 금액, 12월 이벤트 배지
        DecimalFormat df = new DecimalFormat();
        System.out.println("<할인 후 예상 결제 금액>");
        System.out.println(df.format(totalPrice) + "원");
        printEnter();
        System.out.println("<12월 이벤트 배지>");
        if (badge == null) {
            System.out.println("없음");
        } else {
            System.out.println(badge.getName());
        }
    }

}
