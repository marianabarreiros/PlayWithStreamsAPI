package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Hotel {
  private char classification;
  private String name;
  private List<PriceTable> priceTable;

    public Hotel(char classification, String name) {
        this.classification = classification;
        this.name = name;
        priceTable = new ArrayList<>();
    }

    public char getClassification() {
        return classification;
    }

    public String getName() {
        return name;
    }
    
    private boolean thereIsClient(PriceTable table){
        return priceTable.stream()
                .filter(p -> p.getClient().equalsIgnoreCase(table.getClient()))
                .findAny()
                .isPresent();
    }
    
    public void addPriceTableDynamically(PriceTable table){        
        if(!thereIsClient(table)){
            priceTable.add(table);
        }else
            System.out.println("Esse Cliente já foi adicionado ao hotel"); 
    }
}
