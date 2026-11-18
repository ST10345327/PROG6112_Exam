/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112_exam;

/**
 *
 * @author ST10345327
 */

public class Product implements IProduct {

    // Array containing the mattress product names.
    private String[] products = {
        "Cozy Nights Monarch",
        "Restonic Barbados",
        "Sealy Phuket"
    };

    // 2D array containing sales for three months.
    // Rows represent products and columns represent months.
    private int[][] sales = {
        {25, 18, 20},
        {15, 10, 12},
        {18, 15, 20}
    };

    // Calculates the total number of products sold.
    @Override
    public int GetTotalSold() {

        int total = 0;

        // Loop through all products.
        for (int i = 0; i < sales.length; i++) {

            // Loop through all three months.
            for (int j = 0; j < sales[i].length; j++) {

                total += sales[i][j];
            }
        }

        return total;
    }

    // Calculates the average number of products sold.
    @Override
    public double GetAverageProductSold() {

        int total = GetTotalSold();

        // Calculate the total number of monthly sales entries.
        int numberOfSales = sales.length * sales[0].length;

        return (double) total / numberOfSales;
    }

    // Determines the most popular product using total sales.
    @Override
    public String GetMostPopularProduct() {

        int highestSales = 0;
        int popularIndex = 0;

        // Check the total sales of each product.
        for (int i = 0; i < sales.length; i++) {

            int productTotal = 0;

            // Calculate the current product's total sales.
            for (int j = 0; j < sales[i].length; j++) {

                productTotal += sales[i][j];
            }

            // Check if the current product has the highest total.
            if (productTotal > highestSales) {

                highestSales = productTotal;
                popularIndex = i;
            }
        }

        // Return the product name and its total sales.
        return products[popularIndex] + " (" + highestSales + ")";
    }
}
