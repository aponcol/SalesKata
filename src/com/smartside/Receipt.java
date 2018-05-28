package com.smartside;

import java.util.ArrayList;

public class Receipt
{
    public Receipt() {}

    private double              total     = 0.0;
    private ArrayList<ItemLine> itemLines = new ArrayList<>();

    public void addItemLine( ItemLine itemLine )
    {
        itemLines.add(itemLine);
    }

    public double getTotal()
    {

        for (ItemLine itemLine : itemLines)
        {
            total += itemLine.getTotal();
        }

        return total;

    }
}
