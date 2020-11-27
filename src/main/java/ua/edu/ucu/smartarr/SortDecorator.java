package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {
    MyComparator cmp;

    public SortDecorator(SmartArray sa, MyComparator cmp) {
        super(sa);
        this.cmp = cmp;
        Object[] newValues = sa.toArray();
        Arrays.sort(newValues, cmp);
        this.smartArray = new BaseArray(newValues);
    }

    @Override
    public Object[] toArray() {
        return smartArray.toArray();
    }

    @Override
    public String operationDescription() {
        return "sorts SmartArray in ascending order";
    }

    @Override
    public int size() {
        return smartArray.size();
    }
}
