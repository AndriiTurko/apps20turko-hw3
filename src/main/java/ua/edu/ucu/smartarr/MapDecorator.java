package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator{
    MyFunction func;

    public MapDecorator(SmartArray sa, MyFunction func) {
        super(sa);
        this.func = func;
        Object[] newValues = new Object[sa.toArray().length];
        int i = 0;
        for (Object val: sa.toArray()) {
            newValues[i] = func.apply(val);
            i++;
        }
        this.smartArray = new BaseArray(newValues);
    }

    @Override
    public Object[] toArray() {
        return smartArray.toArray();
    }

    @Override
    public String operationDescription() {
        return "maps every element in SmartArray using  MyFunction";
    }

    @Override
    public int size() {
        return smartArray.size();
    }
}
