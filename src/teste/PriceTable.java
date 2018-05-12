package teste;

import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PriceTable {
    private String client;
    private double weekdayPrices;
    private double weekendRates;

    public PriceTable(String client, double weekdayPrices, double weekendRates) {
        this.client = client;
        this.weekdayPrices = weekdayPrices;
        this.weekendRates = weekendRates;
    }

    public String getClient() {
        return client;
    }

    public double getWeekdayPrices() {
        return weekdayPrices;
    }

    public double getWeekendRates() {
        return weekendRates;
    }

    public void setWeekdayPrices(double weekdayPrices) {
        this.weekdayPrices = weekdayPrices;
    }

    public void setWeekendRates(double weekendRates) {
        this.weekendRates = weekendRates;
    }  
}
