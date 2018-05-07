package teste;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

public class ValidateFileLines {

    private static ValidateFileLines validateFileLinesInstance;
    SimpleClientFactory simpleClientFactory = new SimpleClientFactory();
    private Map<String, Set<LocalDate>> mapClientsEndDates = new TreeMap<>();

    private ValidateFileLines() {
    }

    public static ValidateFileLines getInstance() {
        if (validateFileLinesInstance == null) {
            validateFileLinesInstance = new ValidateFileLines();
        }
        return validateFileLinesInstance;
    }

    public Map<String, Set<LocalDate>> parseFileLines(List<String> string) {        
        ValidatesDates fd = ValidatesDates.getInstance();
        String client = null;
        String dates = null;
        int endIndex = 0;
//        for (int i = 0; i < stringSplit.length; i++) {
//            endIndex = stringSplit[i].indexOf(":");
//            client = stringSplit[i].substring(0, endIndex);
//            dates = stringSplit[i].substring(endIndex + 1);
//            final boolean clienteCriado = simpleClientFactory.creatClient(client);
//            final Set<LocalDate> datasValidas = fd.validatesDates(dates);
//            if (clienteCriado && datasValidas != null) {
//                mapClientsEndDates.put(simpleClientFactory.getClient().getTypeClient(), datasValidas);
//            } else {
//                System.out.println("Erro ao criar usuário ou a data não é válida, na linha: " + (i + 1));
//            }
//        }
//        return Collections.unmodifiableMap(mapClientsEndDates);
        for(String s : string){
            endIndex = stringSplit[i].indexOf(":");
            client = stringSplit[i].substring(0, endIndex);
            dates = stringSplit[i].substring(endIndex + 1);
            final boolean clienteCriado = simpleClientFactory.creatClient(client);
            final Set<LocalDate> datasValidas = fd.validatesDates(dates);
        }
    }
//    
//    private String parseListToString(List<String> dates) {
//        String text = "";
//        for (String s : dates) {
//            text += s;
//        }
//        return text;
//    }

}
