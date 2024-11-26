package christmas.view;

import christmas.domain.Benefit;
import christmas.domain.Day;
import christmas.domain.Order;
import christmas.enums.Badge;
import java.util.List;

public class OutputView {
    public void printStart() {
        System.out.println("안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.");
    }

    public void printEnter() {
        System.out.println();
    }

    public void printAllBenefits(Day day) {
        System.out.println("12월 " + day.getDate() + "일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!");
    }

    public void printOrder(List<Order> order, int prevPrice) {
        System.out.println("<주문 메뉴>");

        // 할인 전 총 주문 금액 반환 및 프린트
    }


    public void printBenefits(List<Benefit> benefits, int benefitPrice) {
        // 증정 메뉴, 혜택 내역, 총 혜택 금액
    }

    public void printExpectedPriceAndBadge(int totalPrice, Badge badge) {
        // 할인 후 예상 결제 금액, 12월 이벤트 배지
    }

}
