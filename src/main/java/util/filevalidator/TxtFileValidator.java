package util.filevalidator;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TxtFileValidator implements FileValidator {
    public boolean validateFile(File file) {
        boolean isValid = false;
        if (file.exists()) {
            String FILE_NAME = "\\.txt$";
            String fileName = file.getName();
            Pattern pattern = Pattern.compile(FILE_NAME);
            Matcher matcher = pattern.matcher(fileName);
            if (matcher.find()) {
                isValid = true;
                return isValid;
            }
        }
        return isValid;
    }


}
