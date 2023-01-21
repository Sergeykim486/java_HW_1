import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.print("ЗАДАЧА: Найти значение треугольного числа n.\n\nВведите число n");
        int n = inputint();
        double result = 0;
        if (n == 1) {
            result = 1;
        }
        else {
            result = ((double)n / 2) * (n + 1);
        }
        System.out.println("Значение треугольного числа n = " + n + ", равно: " + (int)result);
    }

    public static int inputint() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число... -->  ");
        int res = 0;
        try {
            res = in.nextInt();
        }
        catch(Exception e) {
            errorcatch();
        }
        return res;
    }

    public static void errorcatch() {
        System.out.print("Внимание! не верный ввод. повторите попытку///");
        inputint();
    }
}
