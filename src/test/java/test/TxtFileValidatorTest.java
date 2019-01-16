package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import util.filevalidator.FileValidator;
import util.filevalidator.TxtFileValidator;

import java.io.File;

public class TxtFileValidatorTest {
    static FileValidator fileValidator = new TxtFileValidator();
    static File file = new File("inputFile.txt");
    static File notFound = new File("C:\\Prog\\inputFile.txt");
    static File errorExpantion = new File("inputFile.doc");


    @Test
    public void testValidateValidFile() throws Exception {
        Assert.assertTrue(fileValidator.validateFile(file));

    }

    @Test
    public void testValidateInvalidFile() throws Exception {
        Assert.assertFalse(fileValidator.validateFile(notFound));
        Assert.assertFalse(fileValidator.validateFile(errorExpantion));
    }
}