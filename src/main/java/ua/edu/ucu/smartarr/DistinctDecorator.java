package ua.edu.ucu.smartarr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
        ArrayList<Object> newValues = new ArrayList<>();

        for (Object val: smartArray.toArray()) {
            boolean check = true;
            for (Object check_val: newValues) {
                if (check_val.toString().equals(val.toString())) {
                    check = false;
                    break;
                }
            }
            if (check) {
                newValues.add(val);
            }
        }
        this.smartArray = new BaseArray(newValues.toArray());
    }


    @Override
    public Object[] toArray() {
        return smartArray.toArray();
    }

    @Override
    public String operationDescription() {
        return "removes duplicates from SmartArray";
    }

    @Override
    public int size() {
        return smartArray.size();
    }
}
