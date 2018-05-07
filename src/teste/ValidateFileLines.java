package teste;

import java.time.LocalDate;
import java.util.Arrays;
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
        String[] dates;
        int endIndex = 0;
        for(String s : string){
            endIndex = s.indexOf(":");
            client = s.substring(0, endIndex);
            dates = s.substring(endIndex + 1).split(",");
            List<String> datesAsList = Arrays.asList(dates);
            final boolean clienteCriado = simpleClientFactory.creatClient(client);
            final Set<LocalDate> datasValidas = fd.validatesDates(datesAsList);  
            if (clienteCriado && datasValidas != null) {
                mapClientsEndDates.put(simpleClientFactory.getClient().getTypeClient(), datasValidas);
            } else {
                System.out.println("Erro ao criar usuário ou a data não é válida " + s);
            }
        }
        return Collections.unmodifiableMap(mapClientsEndDates);
        }
    }
