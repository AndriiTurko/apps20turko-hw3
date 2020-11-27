package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray {
    private Object[] values;

    public BaseArray(Object[] values) {
        this.values = values.clone();
    }

    @Override
    public Object[] toArray() {
        return values.clone();
    }

    @Override
    public String operationDescription() {
        return "no decorators";
    }

    @Override
    public int size() {
        return values.length;
    }
}
