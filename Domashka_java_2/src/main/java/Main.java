public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        Arithmetic arithmetic = new Arithmetic();

        System.out.println("Сложение: " + arithmetic.addition(num1, num2));
        System.out.println("Вычитание: " + arithmetic.subtraction(num1, num2));
        System.out.println("Умножение: " + arithmetic.multiplication(num1, num2));
        System.out.println("Деление: " + arithmetic.division(num1, num2));
    }
}