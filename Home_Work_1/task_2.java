// Task_2.
// Вводится число n, затем n чисел целых, по одному на каждой строке. 
// Затем вводится число, на которое нужно умножить все введённые выше числа. 
// Выведите на экран результат умножения построчно.
// Sample Input:
// 4
// 1
// 2
// 3
// 5
// 2
// Sample Output:
// 2
// 4
// 6
// 10

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве: ");
        int a = scanner.nextInt();
        int[] arr = new int[a];
        System.out.println("Введите элементы массива: ");
        for (int k = 0; k < arr.length; k++) {
            arr[k] = scanner.nextInt();
        }
        System.out.println("Введите число, на которое нужно умножить: ");
        int b = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * b;
            System.out.println(arr[i]);
        }
        scanner.close();
    }
}