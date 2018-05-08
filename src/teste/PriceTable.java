package teste;

import java.util.AbstractMap.SimpleEntry;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PriceTable {
    private Map<String, Set<Double>> priceTable = new LinkedHashMap<>();

    public PriceTable(String client, Set<Double> values) {
        createPricaTable(client, values);
    }
    

    private Map<String, Set<Double>> createPricaTable(String client, Set<Double> values) {    
        return Collections.unmodifiableMap(Stream.of(
                new SimpleEntry<>(client, values))
                .collect(Collectors.toMap((e) -> e.getKey(), (e) -> e.getValue())));
    }    
}
