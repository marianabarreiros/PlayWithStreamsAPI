package teste;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindCheapestHotel {
    Map<String, Set<LocalDate>> mapOfClientsEndDates;
    List<Hotel> hotelList = new ArrayList<>();

    public FindCheapestHotel(Map<String, Set<LocalDate>> mapOfClientsEndDates, List<Hotel> hotelList) {
        this.mapOfClientsEndDates = mapOfClientsEndDates;
        this.hotelList = hotelList;
    }
    
    public List<String> getClients(){
        return this.mapOfClientsEndDates.keySet()
                .stream()
                .collect(Collectors.toList());
    }   

    public List<Set<LocalDate>> getDates() {
        return this.mapOfClientsEndDates.values()
                .stream()
                .collect(Collectors.toList());
    }
}
