/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ST10345327
 */

package productsalesapplication;

import com.mycompany.prog6112_exam.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    // Create an object of the Product class.
    Product product = new Product();

    // UNIT TEST 1
    // Test name: GetTotalProductSales_WithValidatedData_ReturnsCorrectValue
    // Purpose: Verify that the total products sold is 153.
    @Test
    public void GetTotalProductSales_WithValidatedData_ReturnsCorrectValue() {

        // Call the method to calculate total sales.
        int actualResult = product.GetTotalSold();

        // Expected total sales from the test data.
        int expectedResult = 153;

        // Compare expected and actual results.
        assertEquals(expectedResult, actualResult);
    }

    // UNIT TEST 2
    // Test name: GetAverageSales_WithValidatedData_ReturnsCorrectValue
    // Purpose: Verify that the average products sold is 17.
    @Test
    public void GetAverageSales_WithValidatedData_ReturnsCorrectValue() {

        // Call the method to calculate average sales.
        double actualResult = product.GetAverageProductSold();

        // Expected average sales.
        double expectedResult = 17.0;

        // Compare expected and actual results.
        assertEquals(expectedResult, actualResult, 0.001);
    }
}
