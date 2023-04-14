package Home_Work_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class task_4 {

    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5, 4, 7));
        sum(d1, d2);
    }

    public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        int first = getNumber(d1);
        int second = getNumber(d2);
        int sum = first + second;
        System.out.println(sum);
        LinkedList<Integer> result = new LinkedList<>();
        while (sum > 0) {
            result.add(sum % 10);
            sum = sum / 10;
        }
        System.out.println(result);
        return result;
    }

    public static int getNumber(Deque<Integer> d) {
        int first = 0;
        int index = 1;
        for (Integer integer : d) {
            first = first + integer * index;
            index = index * 10;
        }
        System.out.println(first);
        return first;
    }
}