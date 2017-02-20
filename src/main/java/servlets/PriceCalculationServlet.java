package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PriceCalculationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("mainView.jsp");

        dispatcher.forward(req, resp);
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
