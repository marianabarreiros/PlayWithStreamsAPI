package teste;

import java.util.List;
import java.util.stream.Stream;

public class Hotel {
  private char classification;
  private String name;
  private List<PriceTable> priceTable;
  
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
    
//    public void addTableDynamically(PriceTable table){           
////        Stream<TabelaDePreco> precoStream = this.tabelaPreco.stream();
//        boolean existePrecoCadastrado = precoStream.filter(p -> p.getTipoCliente().equals(tabela.getTipoCliente())).findAny().isPresent();
//        priceTable.stream()
//                .filter(p - > p.)
//        
//        if(!existePrecoCadastrado){
//            tabelaPreco.add(tabela);
//        }else
//            System.out.println("Esse Cliente já foi adicionado ao hotel");    
//    }
    
}
