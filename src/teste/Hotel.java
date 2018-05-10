package teste;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hotel {
  private char classification;
  private String name;
  private PriceTable priceTable;
  
    public Hotel(String name, char classification) {
        this.classification = classification;
        this.name = name;
    }

    public char getClassification() {
        return classification;
    }

    public String getName() {
        return name;
    }
    
    private boolean checkIfClientExists(PriceTable table){
        boolean clientPresent = this.priceTable.getPriceTable()
                .entrySet()
                .stream()
                .filter(p -> p.getKey().equals(table.getClient()))
                .findAny()
                .isPresent(); 
        return clientPresent;
//        this.priceTable.getClient().equals(table.getClient())
    }
   
    public void addTableDynamically(PriceTable table){
        if(checkIfClientExists(table)){
            priceTable.getPriceTable().put(table.getClient(), table.getListOfDates());
        }else
            System.out.println("Esse Cliente já foi adicionado ao hotel"); 
    } 
}
