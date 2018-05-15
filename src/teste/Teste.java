/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.io.IOException;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class Teste {

    public static void main(String[] args) throws IOException, URISyntaxException {
//        System.out.println(toSplit("26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)\n26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)"));
//        ArrayList<String> string = new ArrayList<>(Arrays.asList("Regular: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)", "Regular: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)"));
//        String cliente;
//        String datas;
//        int endIndex;
//        for (int i = 0; i < string.size(); i++) {
//            endIndex = string.get(i).indexOf(":");
//            cliente = string.get(i).substring(0, endIndex);
//            datas = string.get(i).substring(endIndex);
//            System.out.println(cliente);
//            System.out.println(datas);
//          string.forEach(System.out::println);
//          string.stream()
//                  .filter(predicate)
//        }
//        System.out.println(string);
        ReadFile rd = new ReadFile();
//        System.out.println(rd.verificarArquivoExiste());
        ValidatesFile validate = new ValidatesFile(rd.getListaDeEntradas());
//        System.out.println(validate.validatePatternsFile());
        ValidatesDates vd = ValidatesDates.getInstance();
        List<String> dates = Arrays.asList("Regular:26Mar2009(thur),27Mar2009(fri),28Mar2009(sat)");
//        System.out.println(vd.validatesDates(dates));
        System.out.println();
        Hotel lakewood = new Hotel("Lakewwod", '2');
        PriceTable pt = new PriceTable("Regular", 100, 80);
        PriceTable pt2 = new PriceTable("Especial", 100, 80);
        PriceTable pt3 = new PriceTable("Especial", 100, 80);
        lakewood.addPriceTableDynamically(pt);
        lakewood.addPriceTableDynamically(pt2);
        List<Hotel> hotelList = Arrays.asList(lakewood);

        CreateMapOfClientsEndDates createMapOfClientsEndDates = CreateMapOfClientsEndDates.getInstance();
        System.out.println(createMapOfClientsEndDates.createMap(validate.validatePatternsFile()));
        FindCheapestHotel findCheapestHotel = new FindCheapestHotel(createMapOfClientsEndDates.createMap(validate.validatePatternsFile()), hotelList);
        System.out.println(findCheapestHotel.getClients());
        System.out.println(findCheapestHotel.getDates());
//        System.out.println(pt2.getPriceTable());
                
                
        
//        ValidateFileLines vfl = ValidateFileLines.getInstance();
//        System.out.println(vfl.validateLine("Regular:26Mar2009(thur),27Mar2009(fri),28Mar2009(sat)"));
//        rd.getListaDeEntradas().stream()
//               .map(s -> s.replace(" ", ""))
//               .forEach(System.out::println);
          
        }
}
    
//    private String removeSpaces(String string) {return string.replace(" ", "").trim();}
//
//    private static List<String> toSplit(String string) {
//        String[] stringSplit = null;
//        stringSplit = string.split("\n");
//        return convertToArrayList(stringSplit);
//       
//    
//    }
//    private static List<String> convertToArrayList(String[] dates){
////        ArrayList<String> stringSplitList = new ArrayList<>(Arrays.asList(dates));
//        List<String> datesList = Arrays.stream(dates).collect(Collectors.toList());
//        return datesList  ;
//    }
//     

