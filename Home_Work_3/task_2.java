// 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и
// среднее из этого списка.

package Home_Work_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task_2 {

    public static List<Integer> removeEvenValue(List<Integer> list) {

        for (int i = list.size() - 1; i >= 0; --i) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        return list;
    }

    public static Integer getMin(List<Integer> list) {
        int minIndex = list.indexOf(Collections.min(list));
        return list.get(minIndex);
    }

    public static Integer getMax(List<Integer> list) {
        int maxIndex = list.indexOf(Collections.max(list));
        return list.get(maxIndex);
    }

    public static Double getAverage(List<Integer> list) {
        Double average = list.stream().mapToInt(val -> val).average().orElse(0.0);
        return average;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(60, 100, 20, 1, 21, 44, 128));

        System.out.println(list);

        System.out.print("Min: ");
        System.out.println(getMin(list));

        System.out.print("Max: ");
        System.out.println(getMax(list));

        System.out.print("Average: ");
        System.out.println(getAverage(list));

        System.out.print("removeEvenValue array: ");
        System.out.println(removeEvenValue(list));
    }

}