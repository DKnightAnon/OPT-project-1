package Commands;

import java.util.ArrayList;

public class TextColors {

    public static ArrayList<String> TextColors = new ArrayList<>();

    public static void initialize() {
        TextColors.add(Text.ANSI_BLACK);
        TextColors.add(Text.ANSI_RED);
        TextColors.add(Text.ANSI_GREEN);
        TextColors.add(Text.ANSI_YELLOW);
        TextColors.add(Text.ANSI_BLUE);
        TextColors.add(Text.ANSI_PURPLE);
        TextColors.add(Text.ANSI_CYAN);
        TextColors.add(Text.ANSI_WHITE);
    }

    public class Text {
        public static String ANSI_RESET = "\u001B[0m";
        public static String ANSI_BLACK = "\u001B[30m";
        public static String ANSI_RED = "\u001B[31m";
        public static String ANSI_GREEN = "\u001B[32m";
        public static String ANSI_YELLOW = "\u001B[33m";
        public static String ANSI_BLUE = "\u001B[34m";
        public static String ANSI_PURPLE = "\u001B[35m";
        public static String ANSI_CYAN = "\u001B[36m";
        public static String ANSI_WHITE = "\u001B[37m";
    }

    public class TextBackground {
        public static String ANSI_RESET = "\u001B[0m";
        public static String ANSI_BLACK = "\u001B[40m";
        public static String ANSI_RED = "\u001B[41m";
        public static String ANSI_GREEN = "\u001B[42m";
        public static String ANSI_YELLOW = "\u001B[43m";
        public static String ANSI_BLUE = "\u001B[44m";
        public static String ANSI_PURPLE = "\u001B[45m";
        public static String ANSI_CYAN = "\u001B[46m";
        public static String ANSI_WHITE = "\u001B[47m";

    }
}
