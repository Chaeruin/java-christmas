package christmas.utils;

import christmas.domain.Day;
import christmas.domain.Menu;
import christmas.domain.Order;
import christmas.enums.ErrorMessage;
import java.util.LinkedList;
import java.util.List;

public class InputParser {

    public Day parseDay(String input) {
        if (InputValidator.isValidIntDate(input)) {
            return new Day(Integer.parseInt(input));
        }
        return null;
    }

    public List<Order> parseOrder(String input, List<Menu> menu) {
        List<Order> orderList = new LinkedList<>();
        if (InputValidator.isValidOrderInput(input) && InputValidator.isNotDuplicateMenu(input)) {
            String[] inputParse = input.replaceAll("-", ",").split(",");
            for (int i = 0; i < inputParse.length; i += 2) {
                setOrderList(orderList, menu, inputParse[i], inputParse[i + 1]);
            }
        }
        return orderList;
    }

    public void setOrderList(List<Order> orderList, List<Menu> menu, String name, String count) {
        Menu findMenu = Finder.findMenuFromOrder(menu, name);
        if (findMenu == null) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_ORDER.getErrorMessage());
        }
        orderList.add(new Order(findMenu, Integer.parseInt(count)));
    }
}
