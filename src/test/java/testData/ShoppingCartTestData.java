package testData;

import org.testng.annotations.DataProvider;

public class ShoppingCartTestData {

    @DataProvider(name="shoppingData")
    static Object[][] shoppingData(){
        Object[][] testData = new Object[1][1];
        testData[0][0]="ZARA COAT 3";
        return testData;
    }
}
