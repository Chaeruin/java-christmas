package christmas.domain;

public class Order {
    private Menu menu;
    private int count;

    public Order(Menu menu, int count) {
        this.count = count;
        this.menu = menu;
    }
    
}
