package com.smartside;

import java.util.ArrayList;

public class Basket
{
    private ArrayList<ItemLine> itemLines = new ArrayList<>();

    public void addItemLine( ItemLine itemLine ) {
        itemLines.add(itemLine);
    }

    public ArrayList<ItemLine> getItemLines() {
        return itemLines;
    }
}
