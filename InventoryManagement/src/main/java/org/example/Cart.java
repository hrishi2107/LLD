package org.example;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map<int,int> categoryIdvsCount;
    public Cart(){
        categoryIdvsCount = new HashMap<int,int>();
    }
    public void addItems(int categoryId, int count)
    {
        if(this.categoryIdvsCount.containsKey(categoryId))
        {
            int currentCount = this.categoryIdvsCount.get(categoryId);
            this.categoryIdvsCount.put(categoryId,currentCount+count);
        }
        else
        {
            this.categoryIdvsCount.put(categoryId,count);
        }
    }
    public void removeItem(int categoryId, int count)
    {
        int currentCount = this.categoryIdvsCount.get(categoryId);
        this.categoryIdvsCount.put(categoryId,currentCount-count);
    }

    public void emptyCart()
    {
        this.categoryIdvsCount.clear();
    }
}
