package teste;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ValidatePatternFile {
    private List<String> entryFileValidated;
    private final String REGEX = "((([a-zA-Z]+:)?([0-9]{2})([a-zA-Z]{3})([0-9]{4})\\(([a-z]{3,4})\\)[,]?){3,})\\n?"; // https://regexr.com/
    private List<String> entryFile;

    public ValidatePatternFile(List<String> entryFile) {
        this.entryFile = entryFile;
        entryFileValidated = new ArrayList<>();            
    }

//    public List<String> validatePatternsFile() {
//        this.removeSpaces(entryFile);
//        Pattern pattern = Pattern.compile(REGEX);
//        Matcher matcher;
//        entryFileValidated = IntStream
//        		.range(0, entryFile.size()-1)
//        		.filter(i -> pattern.matcher(entryFile.get(i)).matches())
//        		.mapToObj(i -> entryFile.get(i))
//        		.collect(Collectors.toList());
//                
//        return entryFileValidated;
//    }
    
    public List<String> validatePatternsFile() {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher;
        this.removeSpaces(entryFile).forEach(s -> {
            if (pattern.matcher(s).matches()) {
                entryFileValidated.add(s);
            } else{ //Qual a necessidade se não vai para lugar algum? AS LINHAS ERRADAS VEM PRIMEIRO NA SAÍDA
                System.out.println("Linha inválida! Exemplo de formato aceito: 'Rewards:99Aaa999(aaaa),99Aaa999(aaaa),99Aaa999(aaaa),99Aaa999(aaaa),99Aaa999(aaaa)'");
            }
        });
        return entryFileValidated;
    }
    
    public List<String> removeSpaces(List<String> entryFile) {
        return entryFile.stream()
                .map(s -> s.replace(" ", "").trim())
                .collect(Collectors.toList());
    }
}



