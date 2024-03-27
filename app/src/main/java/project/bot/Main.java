package project.bot;

import project.bot.model.BotStarter;

public class Main {
    public static void main(String[] args) {
        var bot = new BotStarter();


        var response = bot.getResponse1();
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