import mathexpression.ast.Expression;
import mathexpression.parser.Parser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Add the expression : ");
        Scanner cin = new Scanner(System.in, "utf-8");
        String expression = cin.nextLine();

        Parser parser = new Parser();
        Expression expr = parser.parse(expression);

        if (expr != null) {
            double result = expr.evaluate();
            System.out.println("The result is : " + result);
        } else {
            System.out.println("error");
        }
    }
}