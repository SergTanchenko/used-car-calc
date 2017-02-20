package servlets.utils;

public class MileageCoefficient {
    private static final int NORMATIVE_ANNUAL_AVERAGE_MILEAGE = 27;

    public static double getCoefficient(Double mileage, Double operatingPeriod) {
        return operatingPeriod < 1 && mileage < NORMATIVE_ANNUAL_AVERAGE_MILEAGE ? 0 : calculateCoeff(mileage, operatingPeriod);
    }

    private static double calculateCoeff(Double mileage, Double operatingPeriod) {
        double actualAnnualAverageMileage = mileage / operatingPeriod;
        double diffNormativeActualMileage = NORMATIVE_ANNUAL_AVERAGE_MILEAGE - actualAnnualAverageMileage;
        if (actualAnnualAverageMileage < NORMATIVE_ANNUAL_AVERAGE_MILEAGE) {
            if (diffNormativeActualMileage >= 2 && diffNormativeActualMileage < 5) {
                return 1;
            } else if (diffNormativeActualMileage >= 5 && diffNormativeActualMileage < 8) {
                return 3;
            } else if (diffNormativeActualMileage >= 8 && diffNormativeActualMileage < 10) {
                return 5;
            } else if (diffNormativeActualMileage >= 10 && diffNormativeActualMileage < 12) {
                return 6;
            } else if (diffNormativeActualMileage >= 12 && diffNormativeActualMileage < 14) {
                return 6.5;
            }  else if (diffNormativeActualMileage >= 14 && diffNormativeActualMileage < 16) {
                return 7;
            }  else if (diffNormativeActualMileage >= 16 && diffNormativeActualMileage < 18) {
                return 7.5;
            }  else if (diffNormativeActualMileage >= 18 && diffNormativeActualMileage < 20) {
                return 8;
            }  else if (diffNormativeActualMileage >= 20 && diffNormativeActualMileage < 22) {
                return 8.5;
            }  else if (diffNormativeActualMileage >= 22) {
                return 9;
            }
        } else {
            if (diffNormativeActualMileage >= 2 && diffNormativeActualMileage < 5) {
                return 0.5;
            } else if (diffNormativeActualMileage >= 5 && diffNormativeActualMileage < 8) {
                return 1.5;
            } else if (diffNormativeActualMileage >= 8 && diffNormativeActualMileage < 10) {
                return 3;
            } else if (diffNormativeActualMileage >= 10 && diffNormativeActualMileage < 12) {
                return 4.5;
            } else if (diffNormativeActualMileage >= 12 && diffNormativeActualMileage < 14) {
                return 5;
            }  else if (diffNormativeActualMileage >= 14 && diffNormativeActualMileage < 16) {
                return 5.5;
            }  else if (diffNormativeActualMileage >= 16 && diffNormativeActualMileage < 18) {
                return 9;
            }  else if (diffNormativeActualMileage >= 18 && diffNormativeActualMileage < 20) {
                return 6.5;
            }  else if (diffNormativeActualMileage >= 20 && diffNormativeActualMileage < 22) {
                return 7;
            }  else if (diffNormativeActualMileage >= 22) {
                return 7.5;
            }
        }
        return 0;
    }
}
