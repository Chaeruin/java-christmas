package christmas.controller;

import christmas.domain.Day;
import christmas.domain.Menu;
import christmas.enums.MenuType;
import java.util.LinkedList;
import java.util.List;

public class InitController {

    public List<Menu> initMenu() {
        List<Menu> menu = new LinkedList<>();
        addAppetizer(menu);
        addMain(menu);
        addDessert(menu);
        addDrink(menu);
        return menu;
    }

    public void addAppetizer(List<Menu> menu) {
        menu.add(new Menu("양송이수프", 6000, MenuType.APPETIZER));
        menu.add(new Menu("타파스", 5500, MenuType.APPETIZER));
        menu.add(new Menu("시저샐러드", 8000, MenuType.APPETIZER));
    }

    public void addMain(List<Menu> menu) {
        menu.add(new Menu("티본스테이크", 55000, MenuType.MAIN));
        menu.add(new Menu("바비큐립", 54000, MenuType.MAIN));
        menu.add(new Menu("해산물파스타", 35000, MenuType.MAIN));
        menu.add(new Menu("크리스마스파스타", 25000, MenuType.MAIN));
    }

    public void addDessert(List<Menu> menu) {
        menu.add(new Menu("초코케이크", 15000, MenuType.DESSERT));
        menu.add(new Menu("아이스크림", 5000, MenuType.DESSERT));
    }

    public void addDrink(List<Menu> menu) {
        menu.add(new Menu("제로콜라", 3000, MenuType.DRINK));
        menu.add(new Menu("레드와인", 60000, MenuType.DRINK));
        menu.add(new Menu("샴페인", 25000, MenuType.DRINK));
    }


    public List<Day> initDay() {
        List<Day> days = new LinkedList<>();
        for (int i = 1; i <= 31; i++) {
            days.add(new Day(i));
        }
        return days;
    }
}
