package project.bot.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
public class MessageBox {
    private String message;

    private static final String GREETIN_MORNINg = "Good Morning!";
    private static final String GREETIN_NOON = "Good Afternoon!";
    private static final String GREETIN_EVENING = "Good Evening!";

    public static String greeting() {
        String result = "";
        var time = LocalTime.now();
        if (time.isBefore(LocalTime.NOON) && time.isAfter(LocalTime.of(06,00))) {
            result = GREETIN_MORNINg;
        } else if (time.isAfter(LocalTime.NOON) && time.isBefore(LocalTime.of(18,00))) {
            result = GREETIN_NOON;
        } else if (time.isBefore(LocalTime.MIDNIGHT) && time.isAfter(LocalTime.of(18,00))) {
            result = GREETIN_EVENING;
        } else {
            result = "Good Night!";
        }
        return result;
    }



}
