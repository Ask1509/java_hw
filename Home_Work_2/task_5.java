/*
Task_4.* К калькулятору из предыдущего дз добавить логирование.
*/

package Home_Work_2;

import java.io.IOException;

import java.util.Scanner;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task_5 {

    private static Scanner scan = new Scanner(System.in);

    static int getInt(String prompt) {
        boolean flag = true;
        int i = -1;
        while (flag) {
            System.out.print(prompt);
            if (scan.hasNextInt()) {
                i = scan.nextInt();
                flag = false;
            } else {
                System.out.println("Не удалось распознать число.");
                scan.nextLine();
            }
        }
        return i;
    }

    public static void main(String[] args) throws IOException {

        Logger LOGGER_A = Logger.getLogger(task_5.class.getName());
        LOGGER_A.setLevel(Level.ALL);
        ConsoleHandler ch = new ConsoleHandler();
        LOGGER_A.addHandler(ch);
        SimpleFormatter sf = new SimpleFormatter();
        ch.setFormatter(sf);
        LOGGER_A.log(Level.INFO, "Начало работы");

        int number_first = getInt("Input first number: ");
        int number_second = getInt("Input second number: ");

        char c = '0';
        boolean flag = true;
        while (flag) {
            System.out.println("Input operation: ");
            c = (char) System.in.read();
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                flag = false;
            }
        }

        if (c == '+') {
            System.out.printf("%d + %d = %d\n", number_first, number_second, number_first + number_second);
        }

        if (c == '-') {
            System.out.println(number_first - number_second);
        }

        if (c == '*') {
            System.out.println(number_first * number_second);
        }

        if (c == '/') {
            if (number_second != 0) {
                System.out.println(number_first / number_second);
            }
            if (number_second == 0) {
                System.out.println("Division by zero error");
            }

        }
        scan.close();

        LOGGER_A.log(Level.INFO, "END");
    }
}