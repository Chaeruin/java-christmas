package christmas.utils;

import christmas.domain.Menu;
import christmas.dto.MenuStatus;
import java.util.List;

public class Finder {

    public static Menu findMenuFromOrder(List<Menu> menu, String name) {
        for (Menu m : menu) {
            if (MenuStatus.of(m).name().equals(name)) {
                return m;
            }
        }
        return null;
    }
}
