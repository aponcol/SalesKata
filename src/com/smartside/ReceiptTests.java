package com.smartside;

import org.junit.Assert;
import org.junit.Test;

public class ReceiptTests
{

    @Test
    public void Empty_Basket_Total()
    {
        Receipt receipt = new Receipt();

        Assert.assertEquals(0.00, receipt.getTotal(), 0.00);
    }

    @Test
    public void One_Basic_Item_In_Basket_Total()
    {
        Receipt receipt = new Receipt();

        receipt.addItemLine(new ItemLine(1, "music CD", 14.99));

        Assert.assertEquals(16.49, receipt.getTotal(), 0.00);
    }

    @Test
    public void Another_Basic_Item_In_Basket_Total()
    {
        Receipt receipt = new Receipt();

        receipt.addItemLine(new ItemLine(1, "bottle of perfume", 18.99));

        Assert.assertEquals(20.89, receipt.getTotal(), 0.00);
    }

    @Test
    public void Two_Basic_Items_In_Basket_Total()
    {
        Receipt receipt = new Receipt();

        receipt.addItemLine(new ItemLine(2, "music CD", 14.99));

        Assert.assertEquals(32.98, receipt.getTotal(), 0.00);
    }


}
