package util.arrayvalidator;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayDataValidator implements DataValidator {
    private static final String REGEX_PATTERN = "^((\\d+)\\.\\d+ ?)++$";

    public boolean validateData(String uncheckedData) throws IOException {

        Pattern pattern = Pattern.compile(REGEX_PATTERN);
        Matcher matcher = pattern.matcher(uncheckedData);
        if (matcher.find()) {
            return true;
        }
        return false;
    }
}
