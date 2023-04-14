// Task_3.
// Реализовать простой калькулятор (+,-,=,*), только с целыми числами.

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Введите операцию: ");
        char operation = scanner.next().charAt(0);
        if (operation == '+')
            System.out.println(a + b);
        else if (operation == '-')
            System.out.println(a - b);
        else if (operation == '*')
            System.out.println(a * b);
        else if (operation == '/')
            if (b == 0)
                System.out.println("На ноль делить нельзя!");
            else
                System.out.println(a / b);
        else
            System.out.println("Неверная операция");
        scanner.close();
    }
}