package com.smartside;

public class ItemLine
{
    private int quantity;
    private String name;
    private double price;

    public ItemLine( int quantity, String name, double price) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }

    public double getTotal() {
        return round(price * 1.1, 2);
    }

    private double round(double value, int places) {
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
