/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112_question_2_exam;

/**
 *
 * @author ST10345327
 */



// Interface containing the required calculation methods.
interface IProductCalculations {

    double GetVat();

    double GetCommission();

    double GetTotal();
}

// Class implements the interface.
public class ProductCalculations implements IProductCalculations {

    // Stores the product price.
    private double price;

    // Constructor receives the product price.
    public ProductCalculations(double price) {
        this.price = price;
    }

    // Calculates VAT at 15%.
    @Override
    public double GetVat() {
        return price * 0.15;
    }

    // Calculates commission at 5%.
    @Override
    public double GetCommission() {
        return price * 0.05;
    }

    // Calculates total sales amount.
    @Override
    public double GetTotal() {
        return price + GetVat() + GetCommission();
    }
}
