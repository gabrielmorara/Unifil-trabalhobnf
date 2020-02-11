import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceFile {

    public static List<String> readFileAndWriteOutput(String path) {
        List<String> listSymbol = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            BufferedWriter out = new BufferedWriter(new FileWriter("src\\output\\output.txt"));
            while (br.ready()) {
                String linha = br.readLine().replace("\t", "");
                String[] linhaBreak = RulesGrammar.RuleMain(linha).split(" ");
                for (String x : linhaBreak) {
                    String resultSymbol = MinijavaSymbol.symbol(x);
                    if (resultSymbol != null) {
                        listSymbol.add(resultSymbol);
                    }
                }
            }
            for (String aux : listSymbol) {
                aux += "\r\n";
                out.write(aux);
            }
            br.close();
            out.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return listSymbol;
    }
}


