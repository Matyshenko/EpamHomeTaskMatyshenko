package util.cordinateraeder;

import util.arrayvalidator.DataValidator;

import java.io.File;

public interface DataReader {
    String readData(File file, DataValidator dataValidator);
}
