package test;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import util.arrayvalidator.ArrayDataValidator;
import util.arrayvalidator.DataValidator;

import java.io.IOException;

public class ArrayDataValidatorTest {

    @DataProvider(name = "validData")
    public Object[][] getValidData() {
        return new Object[][]{
                {"4.5 554.6 48.7"},
                {"234.4 2343.23 54.2548"},
                {"12.21 234.56 43.01"},
                {"4.5 566.5 6.7 6.6"},
                {"21.2 212.15 25521.00 16.1"},
                {"0.555 14535.11 36.1 2.5"},
        };
    }

    @DataProvider(name = "invalidData")
    public Object[][] getInvalidData() {
        return new Object[][]{
                {"4f.5 5f54.6f 4s8.7"},
                {"23f4.4f 2343.23432s4324324 54s.2s548"},
                {"12f.21 23w4.56e 43.0w1"},
        };
    }

    @Test(dataProvider = "validData")
    public void testValidateData(Object[] objects) {
        DataValidator dataValidator = new ArrayDataValidator();
        try {
            Assert.assertTrue(dataValidator.validateData((String) objects[0]));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(dataProvider = "invalidData")
    public void testInValidData(Object[] objects) {
        DataValidator dataValidator = new ArrayDataValidator();
        try {
            Assert.assertFalse(dataValidator.validateData((String) objects[0]));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}