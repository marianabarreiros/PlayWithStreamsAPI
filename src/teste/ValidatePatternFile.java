package teste;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ValidatePatternFile {
//    private List<String> entryFileValidated;
    private String regex = "((([a-zA-Z]+:)?([0-9]{2})([a-zA-Z]{3})([0-9]{4})\\(([a-z]{3,4})\\)[,]?){3,})\\n?"; // https://regexr.com/
    private List<String> entryFile;

    public ValidatePatternFile(List<String> entryFile) {
        this.entryFile = entryFile;
    }

    public List<String> validatePatternsFile() {
        this.removeSpaces(entryFile);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        for(int i = 0; i<entryFile.size(); i++){
            if(pattern.matcher(stringSplit[i]).matches())
                StringByFileValidated += stringSplit[i].concat("\n");
            else {
//            PEGUE A LINHA DO ARQUIVO ONDE FOI ENCONTRADO O ERRO!!!!
                System.out.println("Linha inválida! Exemplo de formato aceito: 'Rewards:99Aaa999(aaaa),99Aaa999(aaaa),99Aaa999(aaaa),99Aaa999(aaaa),99Aaa999(aaaa)'");
            }
        }
        return StringByFileValidated.substring(0, StringByFileValidated.length() - 1);
//        entryFile.stream()
//                .filter(pattern.matcher(entryFile.get
//                .filter
//        return null;
    }

    public List<String> removeSpaces(List<String> entryFile) {
        return entryFile.stream()
                .map(s -> s.replace(" ", "").trim())
                .collect(Collectors.toList());
    }
}
