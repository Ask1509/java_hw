// Реализовать алгоритм сортировки слиянием и выборкой.

package Home_Work_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task_1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(60, 100, 20, 1, 21, 44, 128);
        List<Integer> listNegative = Arrays.asList(60, 100, 20, 1, 21, 44, 128);

        System.out.println("Сортировка слиянием");
        System.out.println(list);
        System.out.println(mergeSort(list));

        System.out.println("Сортировка выборкой");
        System.out.println(list);
        System.out.println(selectionSort(listNegative));
    }

    // Сортировка слиянием

    public static List<Integer> mergeSort(List<Integer> list) {
        if (list.size() <= 1) {
            return list;
        } else {
            int delimiter = list.get(0);
            List<Integer> left = new ArrayList<>();
            List<Integer> right = new ArrayList<>();
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) < delimiter) {
                    left.add(list.get(i));
                } else {
                    right.add(list.get(i));
                }
            }
            return merger(mergeSort(left), delimiter, mergeSort(right));
        }
    }

    private static List<Integer> merger(List<Integer> left, int del, List<Integer> right) {
        left.add(del);
        left.addAll(right);
        return left;
    }

    // Сортировка выборкой
    public static List<Integer> selectionSort(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int min = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(min)) {
                    min = j;
                }
            }
            int swap = list.get(i);
            list.set(i, list.get(min));
            list.set(min, swap);
        }
        return list;
    }
}
