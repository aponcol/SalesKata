package com.smartside;

import java.util.ArrayList;

public class Receipt
{
    private Basket basket;
    private double total = 0.0;

    public Receipt(Basket basket) {
        this.basket = basket;
    }

    public double getTotal() {

        ArrayList<ItemLine> itemLines = basket.getItemLines();

        for (ItemLine itemLine : itemLines) {
            total += itemLine.getTotal();
        }

        return total;

    }
}
