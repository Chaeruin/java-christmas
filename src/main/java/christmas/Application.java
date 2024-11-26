package christmas;

import christmas.controller.ChristmasController;
import christmas.controller.InitController;
import christmas.service.BadgeService;
import christmas.service.BenefitService;
import christmas.service.OrderService;
import christmas.view.InputView;
import christmas.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        OrderService orderService = new OrderService();
        BenefitService benefitService = new BenefitService();
        BadgeService badgeService = new BadgeService();
        InitController initController = new InitController();

        ChristmasController christmasController = new ChristmasController(inputView, outputView, orderService,
                benefitService, badgeService, initController);

        christmasController.run();
    }
}
