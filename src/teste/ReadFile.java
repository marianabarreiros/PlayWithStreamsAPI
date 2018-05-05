package teste;

import java.io.File;
import java.io.IOException;
import static java.lang.System.exit;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFile {

    public boolean verificarArquivoExiste() throws URISyntaxException{
        final String FILE = "file" + File.separator;
        boolean ret = false;
        try{
            Stream<Path> stream = Files.list(Paths.get(getClass().getClassLoader().getResource(FILE).toURI()));
            Optional<Path> arq = stream.filter(p -> p.toString().endsWith("HotelReservation.txt")).findAny();
            ret = arq.isPresent(); //informa se o arquivo está presente
        } catch (NullPointerException ex) {
            System.out.println("Caminho não encontrado");
            exit(0);
        } catch (IOException ex){
            System.out.println("");
        }
        return ret;
    }

    public List<String> getListaDeEntradas()throws IOException, URISyntaxException{
        final String FILE = "file" + File.separator + "HotelReservation.txt";
        Path caminho = Paths.get(getClass().getClassLoader().getResource(FILE).toURI());
        Stream<String> linhas = Files.lines(caminho, StandardCharsets.ISO_8859_1);
        List<String> listaDeLinhas = linhas.collect(Collectors.toList());
        return listaDeLinhas;
    }
}