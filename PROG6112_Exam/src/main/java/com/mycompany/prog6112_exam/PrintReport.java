/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112_exam;

/**
 *
 * @author Student
 */

public class PrintReport {

    // Create a Product object to access calculation methods.
    private Product product = new Product();

    // Prints the total product sales.
    public void PrintTotalProductSales() {

        System.out.println("TOTAL PRODUCT SALES: "
                + product.GetTotalSold());
    }

    // Prints the average product sales.
    public void PrintAverageProductSales() {

        System.out.println("AVERAGE PRODUCT SALES: "
                + product.GetAverageProductSold());
    }

    // Prints the most popular product.
    public void PrintMostPopularProductSale() {

        System.out.println("MOST POPULAR PRODUCT: "
                + product.GetMostPopularProduct());
    }

    // Prints the complete sales report.
    public void PrintReport() {

        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println();

        System.out.println("***************************************");

        PrintTotalProductSales();
        PrintAverageProductSales();
        PrintMostPopularProductSale();
    }
}
