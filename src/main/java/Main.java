import model.sorting.SortingArray;
import model.sorting.SortingDoubleArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import util.cordinateraeder.DataReader;
import util.cordinateraeder.FileDataReader;
import util.spliter.DataSpliter;
import util.spliter.DoubleDataSpliter;
import util.arrayvalidator.ArrayDataValidator;
import util.arrayvalidator.DataValidator;
import util.filevalidator.FileValidator;
import util.filevalidator.TxtFileValidator;

import java.io.File;
import java.util.Arrays;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        File file = new File("inputFile.txt");
        FileValidator fileValidator = new TxtFileValidator();
        fileValidator.validateFile(file);

        DataReader dataReader = new FileDataReader();
        DataValidator dataValidator = new ArrayDataValidator();

        String dataForArray = "";
        try {
            dataForArray = dataReader.readData(file, dataValidator);

        } catch (NumberFormatException e) {
            e.getMessage();
            logger.info("Error. Wrong format.");
        }
        System.out.println("Origin string: " + dataForArray);
        DataSpliter dataSpliter = new DoubleDataSpliter();
        double[] arrayOfDoubles = dataSpliter.spliter(dataForArray);

        SortingArray arraySort = new SortingDoubleArray();
        arraySort.ascendingSort(arrayOfDoubles);
        System.out.println("Ascending sort: " + Arrays.toString(arrayOfDoubles));

        arraySort.descendingSort(arrayOfDoubles);
        System.out.println("Descending sort: " + Arrays.toString(arrayOfDoubles));

        double minValue = new SortingDoubleArray().minArrayValue(arrayOfDoubles);
        System.out.println("Minimal value of array: " + minValue);

        double maxValue = new SortingDoubleArray().maxArrayValue(arrayOfDoubles);
        System.out.println("Minimal value of array: " + maxValue);

        double sumOfArray = new SortingDoubleArray().summOfArrayNumber(arrayOfDoubles);
        System.out.println("Summ of array numbers: " + sumOfArray);

        double averageNumber = new SortingDoubleArray().averageNumberOfArray(arrayOfDoubles);
        System.out.println("Average number of array: " + averageNumber);

        arraySort.replaceElement(arrayOfDoubles);
        System.out.println("New array: " + Arrays.toString(arrayOfDoubles));
    }
}
