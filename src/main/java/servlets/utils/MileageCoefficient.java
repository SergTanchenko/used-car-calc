package servlets.utils;

public class MileageCoefficient {
    private static final int NORMATIVE_ANNUAL_AVERAGE_MILEAGE = 27;

    public static double getCoefficient(Double mileage, Double operatingPeriod) {
        double actualAnnualAverageMileage = mileage / operatingPeriod;

        if (operatingPeriod < 1) {
            return 0;
        } else {
            return calculateCoeff(actualAnnualAverageMileage);
        }
    }

    private static double calculateCoeff(Double actualMileage) {
        double diffMileage = NORMATIVE_ANNUAL_AVERAGE_MILEAGE - actualMileage;

        if (diffMileage >= 0 && diffMileage < 2) {
            return 0;
        }

        if (actualMileage < NORMATIVE_ANNUAL_AVERAGE_MILEAGE) {
            if (diffMileage >= 2 && diffMileage < 5) {
                return 1;
            } else if (diffMileage >= 5 && diffMileage < 8) {
                return 3;
            } else if (diffMileage >= 8 && diffMileage < 10) {
                return 5;
            } else if (diffMileage >= 10 && diffMileage < 12) {
                return 6;
            } else if (diffMileage >= 12 && diffMileage < 14) {
                return 6.5;
            } else if (diffMileage >= 14 && diffMileage < 16) {
                return 7;
            } else if (diffMileage >= 16 && diffMileage < 18) {
                return 7.5;
            } else if (diffMileage >= 18 && diffMileage < 20) {
                return 8;
            } else if (diffMileage >= 20 && diffMileage < 22) {
                return 8.5;
            } else if (diffMileage >= 22) {
                return 9;
            }
        } else {
            if (diffMileage >= 2 && diffMileage < 5) {
                return 0.5;
            } else if (diffMileage >= 5 && diffMileage < 8) {
                return 1.5;
            } else if (diffMileage >= 8 && diffMileage < 10) {
                return 3;
            } else if (diffMileage >= 10 && diffMileage < 12) {
                return 4.5;
            } else if (diffMileage >= 12 && diffMileage < 14) {
                return 5;
            } else if (diffMileage >= 14 && diffMileage < 16) {
                return 5.5;
            } else if (diffMileage >= 16 && diffMileage < 18) {
                return 9;
            } else if (diffMileage >= 18 && diffMileage < 20) {
                return 6.5;
            } else if (diffMileage >= 20 && diffMileage < 22) {
                return 7;
            } else if (diffMileage >= 22) {
                return 7.5;
            }
        }
    }
}
