package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {

    private MyPredicate pr;

    public FilterDecorator(SmartArray sa, MyPredicate pr) {
        super(sa);
        this.pr = pr;

        int counter = 0;
        for (Object val: sa.toArray()) {
            if (pr.test(val)) {
                counter++;
            }
        }
        Object[] newValues = new Object[counter];

        int i = 0;
        for (Object val: sa.toArray()) {
            if (pr.test(val)) {
                newValues[i] = val;
                i++;
            }
        }

        this.smartArray = new BaseArray(newValues);
    }

    @Override
    public Object[] toArray() {
        return smartArray.toArray();
    }

    @Override
    public String operationDescription() {
        return "filters SmartArray according to given predicate";
    }

    @Override
    public int size() {
        return smartArray.size();
    }
}
