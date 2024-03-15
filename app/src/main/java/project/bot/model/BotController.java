package project.bot.model;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.request.ParseMode;
import com.pengrad.telegrambot.request.GetChat;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.GetChatResponse;
import com.pengrad.telegrambot.response.SendResponse;
import lombok.Data;

@Data
public class BotController {
    private final String botToken = "7115793378:AAGz0Ce-inF1o9mk9w1UagOc6yfQ74vlnfo";
    private final String channelId = "@my_channel_for_bot";
    private final long chatId = -1002070731422L;

    TelegramBot bot = new TelegramBot(botToken);
    GetChat getChat = new GetChat(channelId);
    GetChatResponse response = bot.execute(getChat);

    String messageText = "HelloWorld";
    SendMessage request = new SendMessage(chatId, messageText).parseMode(ParseMode.HTML);
    SendResponse response1 = bot.execute(request);
}
