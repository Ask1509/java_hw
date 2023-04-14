
// Task_1.
// Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем вводятся 2 числа из этого диапазона.
//  Используя данные из массива найдите их кубы.
// Sample Input:
// 8
// 11
// Sample Output:
// 512
// 1331
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        int[] arr = new int[1000];
        for (int i = 1; i < 1000; i++) {
            arr[i] = i * i * i;
            System.out.println(arr[i]);
        }
        System.out.println("Куб первого числа равен " + arr[a]);
        System.out.println("Куб второго числа равен " + arr[b]);
        scanner.close();
    }
}