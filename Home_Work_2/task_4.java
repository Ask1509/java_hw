/*
 * // Task_3
public class Task_3 {
Напишите программу, которая принимает с консоли число в формате byte и
записывает его в файл ”result.txt”.
Требуется перехватить все возможные ошибки и вывести их в логгер.

После написания, попробуйте подать на вход числа 100 и 200 и проследите
разницу в результате
 */

package Home_Work_2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

import java.util.Scanner;

import java.util.logging.*;

public class task_4 {
    private static Scanner scan = new Scanner(System.in);

    static byte getByte(String prompt) {
        boolean flag = true;
        byte i = 0;
        while (flag) {
            System.out.print(prompt);
            if (scan.hasNextByte()) {
                i = scan.nextByte();
                flag = false;
            } else {
                System.out.println("Не удалось распознать число.");
                scan.nextLine();
            }
        }
        return i;
    }

    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(task_4.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);
        logger.log(Level.WARNING, "Test log");
        logger.info("Test log");

        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        String myCurrentDir = System.getProperty("user.dir");
        String myFilePath = myCurrentDir + File.separator + "result.txt";

        File file = new File(myFilePath);
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        byte myByteToFile = getByte("Input number in byte format: ");

        fileOutputStream.write(myByteToFile);

        fileOutputStream.close();
    }
}