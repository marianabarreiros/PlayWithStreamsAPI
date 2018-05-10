package teste;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hotel {
  private char classification;
  private String name;
  private PriceTable priceTable;
  
    public Hotel(char classification, String name) {
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
        boolean clientPresent = table.getPriceTable()
                .entrySet()
                .stream()
                .filter(p -> p.getKey().equals(table.getClient()))
                .findAny()
                .isPresent(); 
        return clientPresent;
    }
    
    public void addTableDynamically(PriceTable table){
//        if(checkIfClientExists(table)){
//            priceTable.getPriceTable().put(name, value);
//        }else
//            System.out.println("Esse Cliente já foi adicionado ao hotel"); 
//    } 
}
