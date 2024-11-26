package christmas.dto;

import christmas.domain.Menu;

public record MenuStatus(
        String name,
        int price
) {
    public static MenuStatus of(final Menu menu) {
        return new MenuStatus(
                menu.getName(),
                menu.getPrice()
        );
    }
}
