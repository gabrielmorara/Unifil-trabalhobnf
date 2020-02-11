public class MinijavaSymbol {

    // Palavra Reservada
    public static String pr = "< PR, ";
    // Identificador
    public static String id = "< ID, ";
    // Literal
    public static String literal = "< LT, ";
    // Operador
    public static String op = "< OP, ";
    // Sinal
    public static String sinal = "< SN, ";

    public static String symbol(String s) {
        s = s.replace(" ", "");
        if (!s.equals(" ") && !s.equals("import") && !s.contains("java.") && !s.contains("//") && !s.contains("try") && !s.contains("cath")) {
            switch (s) {
                case "{":
                    return sinal + "{ >";
                case "}":
                    return sinal + "} >";
                case "[":
                    return sinal + "[ >";
                case "]":
                    return sinal + "] >";
                case "(":
                    return sinal + "( >";
                case ")":
                    return sinal + ") >";
                case "int":
                    return pr + "int >";
                case "boolean":
                    return pr + "boolean >";
                case "if":
                    return pr + "if >";
                case "else":
                    return pr + "else >";
                case "while":
                    return pr + "while >";
                case "System.out.println":
                    return pr + "System.out.println >";
                case "return":
                    return pr + "return >";
                case "&&":
                    return op + "&& >";
                case "<":
                    return op + "< >";
                case "+":
                    return op + "+ >";
                case "-":
                    return op + "- >";
                case "*":
                    return op + "* >";
                case "static":
                    return pr + "static >";
                case "void":
                    return pr + "void >";
                case "main":
                    return pr + "main >";
                case "String":
                    return pr + "String >";
                case "length":
                    return pr + "length >";
                case "new":
                    return pr + "new >";
                case "true":
                    return pr + "true >";
                case "false":
                    return pr + "false >";
                case "this":
                    return pr + "this >";
                case "public":
                    return pr + "public >";
                case "class":
                    return pr + "class >";
                case "extends":
                    return pr + "extends >";
                case "=":
                    return op + "= >";
                case ";":
                    return sinal + "; >";
                case "!":
                    return op + "!";
                default:
                    String regex = "[0-9]+";
                    if (s.matches(regex)) {
                        return literal + s + " >";
                    }
                    String regexVar = "([_]*[a-z]|[A-Z])+[_]*[0-9]*[_]*";
                    if (s.matches(regexVar)) {
                        return id + s + " >";
                    }
            }
        }
        return null;
    }
}

