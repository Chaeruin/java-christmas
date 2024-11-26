package christmas.controller;

import christmas.domain.Benefit;
import christmas.domain.Day;
import christmas.domain.Order;
import christmas.service.BadgeService;
import christmas.service.BenefitService;
import christmas.service.OrderService;
import christmas.utils.InputParser;
import christmas.view.InputView;
import christmas.view.OutputView;
import java.util.List;

public class ChristmasController {

    final InputView inputView;
    final OutputView outputView;
    final OrderService orderService;
    final BenefitService benefitService;
    final BadgeService badgeService;

    final InitController initController;


    public ChristmasController(InputView inputView, OutputView outputView, OrderService orderService,
                               BenefitService benefitService, BadgeService badgeService,
                               InitController initController) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.orderService = orderService;
        this.benefitService = benefitService;
        this.badgeService = badgeService;
        this.initController = initController;
    }

    public void run() {
        init();

    }

    public void init() {
        initController.initMenu();
        initController.initDay();
    }

    public int totalExpectedPrice(List<Order> orderList, List<Benefit> benefits) {
        return orderService.totalOrderPrice(orderList) - benefitService.totalBenefitPrice(benefits);
    }

    public Day inputDayHandler() {
        Day day = null;
        while (day == null) {
            try {
                day = InputParser.parseDay(inputView.getExpectedDate());
                return day;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return day;
    }

    public List<Order> inputOderListHandler() {
        List<Order> orderList = null;
        while (orderList == null) {
            try {
                orderList = InputParser.parseOrder(inputView.getOrder(), initController.initMenu());
                return orderList;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return orderList;
    }
}
