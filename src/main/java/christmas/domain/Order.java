package christmas.domain;

import christmas.enums.ErrorMessage;

public class Order {
    private Menu menu;
    private int count;

    public Order(Menu menu, int count) {
        validCount(count);
        this.count = count;
        this.menu = menu;
    }

    void validCount(int count) {
        if (count < 1) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_ORDER.getErrorMessage());
        }
    }

    public Menu getMenu() {
        return this.menu;
    }

    public int getCount() {
        return this.count;
    }
}
