package by.chybisau.secondtask.validator;

import java.util.regex.Pattern;

/**
 * Created by Maksim Chybisau on 15/05/19.
 * @version 0.0.1
 */

public class StringValidator {

    private static final String REGEX_FOR_WORD = "([\\d ]+)";
    private static final String REGEX_FOR_PLANE = "([\\w ]+)";
    private static final String REGEX_FOR_MODEL = "([\\w- ]+)";
    private static final String REGEX_FOR_PRODUCER = "+(BOEING|AIRBUS|AN)";
    private static final String COMMA = ", ";

    public static boolean validate(String stringOfDates) {
        return Pattern.matches(REGEX_FOR_PLANE + COMMA,
              stringOfDates.toUpperCase());
    }
}
