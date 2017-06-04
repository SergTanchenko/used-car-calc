package servlets;

import servlets.utils.MileageCoefficient;
import servlets.utils.OperatingPeriodCoefficient;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

import static servlets.PriceCalculationServlet.Field.*;

public class PriceCalculationServlet extends HttpServlet {

    public static final String CAR_PRICE_ATTRIBUTE = "carPrice";

    private Map<String, String[]> urlParams;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        urlParams = req.getParameterMap();

        if (urlParams.size() == Field.values().length && allParamsValid(urlParams)) {
            Double newCarPrice = Double.valueOf(urlParams.get(NEW_CAR_PRICE.toString())[0]);
            Double operatingPeriod = Double.valueOf(urlParams.get(OPERATING_PERIOD.toString())[0]);
            Double mileage = Double.valueOf(urlParams.get(MILEAGE.toString())[0]);
            req.setAttribute(CAR_PRICE_ATTRIBUTE, calculatePrice(newCarPrice, operatingPeriod, mileage));
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("mainView.jsp");
        dispatcher.forward(req, resp);
    }

    private boolean allParamsValid(Map<String, String[]> urlParams) {
        boolean result = urlParams.containsKey(NEW_CAR_PRICE.toString())
                && urlParams.containsKey(OPERATING_PERIOD.toString())
                && urlParams.containsKey(MILEAGE.toString());

        try {
            Double.valueOf(urlParams.get(NEW_CAR_PRICE.toString())[0]);
            Double.valueOf(urlParams.get(OPERATING_PERIOD.toString())[0]);
            Double.valueOf(urlParams.get(MILEAGE.toString())[0]);
        } catch (NumberFormatException e) {
            result = false;
        }
        return result;
    }


    /**
     * Сср = Цн х (Г / 100) х (1 ± (Гк / 100)
     * Цн - newCarPrice
     * Г - operatingPeriodCoeff
     * Гк - mileageCoeff
     */
    private double calculatePrice(Double newCarPrice, Double operatingPeriod, Double mileage) {
        double result;
        int operatingPeriodCoeff = OperatingPeriodCoefficient.getCoefficient(operatingPeriod);
        double mileageCoeff = MileageCoefficient.getCoefficient(mileage, operatingPeriod);

        result = newCarPrice * operatingPeriodCoeff / 100 * (1 + mileageCoeff / 100);

        return result;
    }

    public enum Field {
        NEW_CAR_PRICE("newCarPrice"), OPERATING_PERIOD("operatingPeriod"), MILEAGE("mileage");

        private final String fieldName;

        Field(String fieldName) {
            this.fieldName = fieldName;
        }

        @Override
        public String toString() {
            return fieldName;
        }
    }
}
