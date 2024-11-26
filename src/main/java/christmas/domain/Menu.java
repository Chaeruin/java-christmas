package christmas.domain;

import christmas.enums.MenuType;

public class Menu {
    private final String name;
    private final int price;
    private final MenuType menuType;

    public Menu(String name, int price, MenuType menuType) {
        this.name = name;
        this.price = price;
        this.menuType = menuType;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public MenuType getMenuType() {
        return this.menuType;
    }
}
