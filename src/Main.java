import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("wpisz pierwsza liczbe: ");
        double a = scanner.nextDouble();

        String operator = wczytajOperator();

        System.out.print("wpisz druga liczbe: ");
        double b = scanner.nextDouble();

        System.out.println("wynik dzialania: " + a + " " + operator + " " + b + " = " + wynik(a, operator, b));
    }

    private static double wynik(double a, String operator, double b) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b != 0) {
                    return a / b;
                }
                return 0;
            default:
                return 0;
        }
    }

    private static String wczytajOperator() {
        Scanner scanner = new Scanner(System.in);
        final Set<String> zbiorOperatorow = new HashSet<String>(Arrays.asList("+", "-", "*", "/"));

        System.out.print("wpisz znak operatora (+, -, *, lub /): ");
        String operator = scanner.next();
        if (!zbiorOperatorow.contains(operator)) {
            System.out.println("wczytano niepoprawny symbol operatora, sprobuj ponownie");
            operator = wczytajOperator();
        }
        return operator;
    }
}