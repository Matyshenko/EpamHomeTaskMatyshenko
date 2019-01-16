package util.arrayvalidator;

import java.io.IOException;

public interface DataValidator {
    boolean validateData(String uncheckedData) throws IOException;
}
