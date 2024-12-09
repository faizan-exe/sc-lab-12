package Task2_RecursiveParser;

public class ExpressionParser {

    public static double evaluateExpression(String expression) {
        return parseAdditionSubtraction(expression.replaceAll("\\s", ""));
    }

    private static double parseAdditionSubtraction(String expression) {
        int index = expression.lastIndexOf('+');
        if (index == -1) index = expression.lastIndexOf('-');

        if (index != -1) {
            double left = parseAdditionSubtraction(expression.substring(0, index));
            double right = parseMultiplicationDivision(expression.substring(index + 1));
            return expression.charAt(index) == '+' ? left + right : left - right;
        }

        return parseMultiplicationDivision(expression);
    }

    private static double parseMultiplicationDivision(String expression) {
        int index = expression.lastIndexOf('*');
        if (index == -1) index = expression.lastIndexOf('/');

        if (index != -1) {
            double left = parseMultiplicationDivision(expression.substring(0, index));
            double right = Double.parseDouble(expression.substring(index + 1));
            return expression.charAt(index) == '*' ? left * right : left / right;
        }

        return Double.parseDouble(expression);
    }
}
