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
        ValidatePatternFile validetaPatternFile = new ValidatePatternFile(rd.getListaDeEntradas());
        validetaPatternFile.removeSpaces(rd.getListaDeEntradas()).stream().forEach(System.out::println);
//        System.out.println(rd.verificarArquivoExiste());
        
                
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

