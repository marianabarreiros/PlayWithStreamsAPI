package teste;

import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PriceTable {
    private Map<String, Set<Double>> priceTable = new LinkedHashMap<>();
    private double weekdayPrices;
    private double weekendRates;

    public PriceTable(String client, double weekdayPrices, double weekendRates) {
        this.weekdayPrices = weekdayPrices;
        this.weekendRates = weekendRates;
        createPriceTable(client, Arrays.asList(this.weekdayPrices,this.weekendRates));
    }
    
    private Map<String, Set<Double>> createPriceTable(String client, Set<Double> values) {    
        return Collections.unmodifiableMap(Stream.of(
                new SimpleEntry<>(client, values))
                .collect(Collectors.toMap((e) -> e.getKey(), (e) -> e.getValue())));
    }

    public Map<String, Set<Double>> getPriceTable() {
        return priceTable;
    }
}
