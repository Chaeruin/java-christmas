package christmas.dto;

import christmas.domain.Menu;
import christmas.domain.Order;

public record OrderStatus(
        Menu menu,
        int count
) {
    public static OrderStatus of(final Order order) {
        return new OrderStatus(
                order.getMenu(),
                order.getCount()
        );
    }
}
