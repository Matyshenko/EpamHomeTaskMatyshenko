package util.cordinateraeder;

import util.arrayvalidator.DataValidator;

import java.io.*;

public class FileDataReader implements DataReader {

    public String readData(File file, DataValidator dataValidator) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        String dataForArray = "";
        try {
            while (bufferedReader.ready()) {
                String uncheckedData = bufferedReader.readLine();

                if (dataValidator.validateData(uncheckedData)) {
                    return uncheckedData;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return dataForArray;
    }
}
