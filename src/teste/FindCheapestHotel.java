package teste;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindCheapestHotel {
    Map<String, Set<LocalDate>> mapOfClientsEndDates;
    List<Hotel> hotelList = new ArrayList<>();
    List<Quotation> quotation = new ArrayList<>();

    public FindCheapestHotel(Map<String, Set<LocalDate>> mapOfClientsEndDates, List<Hotel> hotelList) {
        this.mapOfClientsEndDates = mapOfClientsEndDates;
        this.hotelList = hotelList;
    }
   
    private double getFullValue(Hotel hotel){
        double full = 0;
        for(Map.Entry<String, Set<LocalDate>> map : mapOfClientsEndDates.entrySet()){
            PriceTable price = getPriceByClient(hotel, mapOfClientsEndDates.keySet());
        }
    }
    
    private PriceTable getPriceByClient(Hotel hotel, String cliente) {
        return hotel.getPriceTable().stream()
                .filter(p -> p.getClient().equalsIgnoreCase(cliente))
                .findAny()
                .get();
    }
    
    public String findCheapestHotel(){
        for(int i=0; i<hotelList.size(); i++){
            double total = getFullValue(hotelList.get(i));
            quotation.add(new Quotation(hotelList.get(i), total));
        }
    }
}
