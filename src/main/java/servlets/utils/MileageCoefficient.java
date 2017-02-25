package servlets.utils;

public class MileageCoefficient {
    private static final int NORMATIVE_ANNUAL_AVERAGE_MILEAGE = 27;
    private static final double[] LESS_THAN_MILEAGE_COEFF_ARRAY = new double[]{1, 3, 5, 6, 6.5, 7, 7.5, 8, 8.5, 9};
    private static final double[] MORE_THAN_MILEAGE_COEFF_ARRAY = new double[]{0.5, 1.5, 3, 4.5, 5, 5.5, 6, 6.5, 7, 7.5};

    public static double getCoefficient(Double actualMileage, Double operatingPeriod) {
        double actualAnnualAverageMileage = actualMileage / operatingPeriod;

        if (operatingPeriod < 1) {
            return 0;
        } else {
            return calculateCoeff(actualAnnualAverageMileage);
        }
    }

    private static double calculateCoeff(Double actualAnnualAverageMileage) {
        double diffAnnualMileage = NORMATIVE_ANNUAL_AVERAGE_MILEAGE - actualAnnualAverageMileage;

        double absDiffAnnualMileage = Math.abs(diffAnnualMileage);
        if (absDiffAnnualMileage < 2) {
            return 0;
        }

        if (actualAnnualAverageMileage < NORMATIVE_ANNUAL_AVERAGE_MILEAGE) {
            return getCoeff(absDiffAnnualMileage, LESS_THAN_MILEAGE_COEFF_ARRAY);
        } else {
            return getCoeff(absDiffAnnualMileage, MORE_THAN_MILEAGE_COEFF_ARRAY);
        }
    }

    private static double getCoeff(double absDiffAnnualMileage, double[] coeffArray) {
        if (absDiffAnnualMileage >= 2 && absDiffAnnualMileage < 5) {
            return coeffArray[0];
        } else if (absDiffAnnualMileage >= 5 && absDiffAnnualMileage < 8) {
            return coeffArray[1];
        } else if (absDiffAnnualMileage >= 8 && absDiffAnnualMileage < 10) {
            return coeffArray[2];
        } else if (absDiffAnnualMileage >= 10 && absDiffAnnualMileage < 12) {
            return coeffArray[3];
        } else if (absDiffAnnualMileage >= 12 && absDiffAnnualMileage < 14) {
            return coeffArray[4];
        } else if (absDiffAnnualMileage >= 14 && absDiffAnnualMileage < 16) {
            return coeffArray[5];
        } else if (absDiffAnnualMileage >= 16 && absDiffAnnualMileage < 18) {
            return coeffArray[6];
        } else if (absDiffAnnualMileage >= 18 && absDiffAnnualMileage < 20) {
            return coeffArray[7];
        } else if (absDiffAnnualMileage >= 20 && absDiffAnnualMileage < 22) {
            return coeffArray[8];
        } else {
            return coeffArray[9];
        }
    }
}
