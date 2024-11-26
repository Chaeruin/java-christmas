package christmas.service;

import christmas.domain.Order;
import christmas.enums.ErrorMessage;
import christmas.enums.MenuType;
import java.util.List;

public class OrderService {

    public void exceedMenuCount(List<Order> orderList) {
        int sumCount = 0;
        for (Order order : orderList) {
            sumCount += order.getCount();
        }
        if (sumCount > 20) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_ORDER.getErrorMessage());
        }
    }

    public boolean isOnlyDrinkOrder(List<Order> orderList) {
        for (Order order : orderList) {
            if (order.getMenu().getMenuType() != MenuType.DRINK) {
                return false;
            }
        }
        throw new IllegalArgumentException(ErrorMessage.INVALID_ORDER.getErrorMessage());
    }

    public int totalOrderPrice(List<Order> orderList) {
        int sumPrice = 0;
        for (Order order : orderList) {
            sumPrice += order.getCount() * order.getMenu().getPrice();
        }
        return sumPrice;
    }
}
