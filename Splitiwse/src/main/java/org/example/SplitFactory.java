package org.example;

public class SplitFactory {
    public ExpenseSplit getSplitObject(SplitType type)
    {
        if(type == SplitType.EQUAL)
            return new EqualSplit();
        else if(type == SplitType.UNEQUAL)
            return new UnequalSplit();
        else if(type == SplitType.PERCENTAGE)
            return new PercentageSplit();
        return null;
    }
}
