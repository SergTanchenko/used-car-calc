package servlets.utils;

import org.apache.commons.lang3.StringEscapeUtils;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Formatter {

    public static String twoDigitsFormatter(Double value) {
        DecimalFormatSymbols decimalFormatSymbol = new DecimalFormatSymbols(Locale.getDefault());
        decimalFormatSymbol.setGroupingSeparator('\'');

        DecimalFormat df2 = new DecimalFormat("###,##0.00", decimalFormatSymbol);
        df2.setRoundingMode(RoundingMode.UP);
        return StringEscapeUtils.escapeXml10(df2.format(value));
    }
}
