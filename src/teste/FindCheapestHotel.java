package teste;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindCheapestHotel {
    private Map<String, Set<LocalDate>> mapOfClientsEndDates;
    private List<Hotel> hotelList = new ArrayList<>();
    private List<Quotation> quotation = new ArrayList<>();

    public FindCheapestHotel(Map<String, Set<LocalDate>> mapOfClientsEndDates, List<Hotel> hotelList) {
        this.mapOfClientsEndDates = mapOfClientsEndDates;
        this.hotelList = hotelList;
    }
    
    public double getFullValue(Hotel hotel){
        double full = 0;
        PriceTable price;  
        for(Map.Entry<String, Set<LocalDate>> map : mapOfClientsEndDates.entrySet()){
            price = getPriceByClient(hotel, map.getKey());
            for(LocalDate date : map.getValue()){
                if(date.getDayOfWeek().getValue() == 6 || date.getDayOfWeek().getValue() == 7){
                    full += price.getWeekendRates();
                }
                else{
                    full += price.getWeekdayPrices();
                }
            }
        }
        return full;
    }
    
    private PriceTable getPriceByClient(Hotel hotel, String cliente) {
        return hotel.getPriceTable().stream()
                .filter(p -> p.getClient().equalsIgnoreCase(cliente))
                .findAny()
                .get();
    }
    
//    public String findCheapestHotel(){
//        for(int i=0; i<hotelList.size(); i++){
//            double total = getFullValue(hotelList.get(i));
//            quotation.add(new Quotation(hotelList.get(i), total));
//        }
//    }
}
