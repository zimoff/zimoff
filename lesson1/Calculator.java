public class Calculator {
    public static void main(String args[]){
        char operator = '^';
        int a = 7;
        int b = 2;
        
        if (operator == '+') System.out.printf("%2d %2c %2d = %2d", a, operator, b, (a + b));
        else if (operator == '-') System.out.printf("%2d %2c %2d = %2d", a, operator, b, (a - b));
        else if (operator == '*') System.out.printf("%2d %2c %2d = %2d", a, operator, b, (a * b));
        else if (operator == '/') System.out.printf("%2d %2c %2d = %2d", a, operator, b, (a / b));
        else if (operator == '%') System.out.printf("%2d %2c %2d = %2d", a, operator, b, (a % b));
        else if (operator == '^') {
            System.out.print(a + " " + operator + " " + b + " = ");
            for (int i = a; b>1; b--) a = i * a;
            System.out.print(a);
        }
    }
}
