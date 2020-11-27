package ua.edu.ucu.smartarr;

import java.util.Arrays;
import java.util.HashSet;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {
    HashSet hashSet;

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
        this.hashSet = new HashSet(Arrays.asList(smartArray.toArray()));
    }


    @Override
    public Object[] toArray() {
        return hashSet.toArray();
    }

    @Override
    public String operationDescription() {
        return "removes duplicates from SmartArray";
    }

    @Override
    public int size() {
        return hashSet.size();
    }
}
