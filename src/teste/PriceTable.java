package teste;

import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PriceTable {
    private Map<String, List<Double>> priceTable = new LinkedHashMap<>();
    private double weekdayPrices;
    private double weekendRates;

    public PriceTable(String client, double weekdayPrices, double weekendRates) {
        this.weekdayPrices = weekdayPrices;
        this.weekendRates = weekendRates;
        List<Double> values = Arrays.asList(this.weekdayPrices,this.weekendRates);
        createPriceTable(client, values);
    }
    
    private Map<String, List<Double>> createPriceTable(String client, List<Double> values) {    
        return priceTable = Collections.unmodifiableMap(Stream.of(
                new SimpleEntry<>(client, values))
                .collect(Collectors.toMap((e) -> e.getKey(), (e) -> e.getValue())));
    }

    public Map<String, List<Double>> getPriceTable() {
        return priceTable.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
    
    public String getClient(){
        String client = null;
        for(String map : priceTable.keySet()){
            client = map;
        }
        return client;
    }
//    pegar a lista
//    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
//    List<String> list = entry.getValue();
}
