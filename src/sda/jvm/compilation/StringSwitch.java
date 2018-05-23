package sda.jvm.compilation;

import java.time.LocalDateTime;

public class StringSwitch {

    public static void main(String[] args) {
        // String dayOfWeek = LocalDateTime.now().getDayOfWeek().getDisplayName(TextStyle.FULL, java.util.Locale.getDefault());
        String dayOfWeek = LocalDateTime.now().getDayOfWeek().name();
        dayOfWeek (dayOfWeek);
    }

    private static void dayOfWeek (String dayOfWeek) {
        switch (dayOfWeek) {
            case "MONDAY":
                System.out.println("1");
                break;
            case "TUESDAY":
                System.out.println("2");
                break;
            case "WEDNESDAY":
                System.out.println("3");
                break;
            case "THURSDAY":
                System.out.println("4");
            case "FRIDAY":
                System.out.println("5");
                break;
            case "SATURDAY":
                System.out.println("6");
                break;
            case "SUNDAY":
                System.out.println("7");
                break;

            default:
                System.out.println("-1");
        }
    }
}
