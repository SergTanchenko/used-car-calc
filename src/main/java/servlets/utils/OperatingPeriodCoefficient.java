package servlets.utils;

import java.util.HashMap;
import java.util.Map;

public class OperatingPeriodCoefficient {
    private static Map<Integer, Integer> values;

    static {
        values = new HashMap<>();
        values.put(0, 74);
        values.put(1, 62);
        values.put(2, 50);
        values.put(3, 45);
        values.put(4, 42);
        values.put(5, 39);
        values.put(6, 36);
        values.put(7, 33);
        values.put(8, 31);
        values.put(9, 29);
        values.put(10, 27);
        values.put(11, 25);
    }

    public static int getCoefficient(Double operatingPeriod) {
        return getCoefficient(operatingPeriod.intValue());
    }


    public static int getCoefficient(int operatingPeriod) {
        return values.get(operatingPeriod);
    }
}


