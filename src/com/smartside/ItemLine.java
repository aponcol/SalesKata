package com.smartside;

public class ItemLine
{
    private static final int DECIMAL_PLACES_TO_ROUND = 2;
    private static final double BASIC_SALES_TAX_RATE = 0.1;

    private int quantity;
    private String name;
    private double price;

    public ItemLine( int quantity, String name, double price) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }

    public double getTotal() {
        return round(getPriceWithSalesTax());
    }

    private double getPriceWithSalesTax()
    {
        return price * quantity * (1 + BASIC_SALES_TAX_RATE);
    }

    private double round(double value) {
        long factor = (long) Math.pow(10, DECIMAL_PLACES_TO_ROUND);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
