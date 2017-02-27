package servlets.utils;

import java.util.TreeMap;

public class OperatingPeriodCoefficient {
    public static final int LOWEST_COEFFICIENT = 4;

    private static final int CAR_COEFF_MULTIPLIER = 1;
    private static final int MOTOCYCLE_COEFF_MULTIPLIER = 2;

    /**
     * key - operation period in years
     * value - coefficient
     */
    private static TreeMap<Integer, Integer> values;

    static {
        values = new TreeMap<>();
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


    private static int getCoefficient(int operatingPeriod) {
        if (operatingPeriod < 0) {
            return values.get(0);
        } else {
            int countOfYears = values.size();
            if (operatingPeriod > countOfYears) {
                int calculatedCoeff = values.lastEntry().getValue()
                        - (operatingPeriod - countOfYears) * CAR_COEFF_MULTIPLIER;
                if (calculatedCoeff >= LOWEST_COEFFICIENT) {
                    return calculatedCoeff;
                } else {
                    return LOWEST_COEFFICIENT;
                }
            }
        }
        return values.get(operatingPeriod);
    }
}


