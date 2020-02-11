import java.util.ArrayList;
import java.util.List;

public class RulesGrammar {

    public static String RuleMain (String input) {
        return breakFileBySinals(input);
    }

    public static String breakFileBySinals(String input) {
        List<String> listSinals = new ArrayList<>();
        listSinals.add(";");
        listSinals.add(")");
        listSinals.add("(");
        listSinals.add("{");
        listSinals.add("}");
        listSinals.add("[");
        listSinals.add("]");
        listSinals.add("+");
        listSinals.add("-");
        listSinals.add("*");
        listSinals.add("/");
        String result = input;
        for (String x : listSinals) {
            result = replaceBlankSpace(result, x);
        }
        return result;
    }

    public static String replaceBlankSpace(String input, String sinal) {
        if (input.contains(sinal)) {
            input = input.replace(sinal, " " + sinal + " ");
        }
        return input;
    }
}
