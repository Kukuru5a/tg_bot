package project.bot;

import project.bot.model.BotController;

public class Main {
    public static void main(String[] args) {
        var controller = new BotController();


        var response = controller.getResponse1();
        if (response.isOk()) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }

    }
}

// Далее надо реализовать сценарии поведения бота на запросы
// SQL повторить первые страницы методички
// Spring начать методичку