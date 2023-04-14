package Home_Work_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class task_3 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(2, 3, 6, 3, 2));
        System.out.println(checkOn(deque) ? "Палиндром" : "Не палиндром");
    }

    public static boolean checkOn(Deque<Integer> deque) {
        for (int i = 0; i < deque.size() / 2; i++) {
            if (deque.pollFirst() != deque.pollLast()) {
                return false;
            }
        }
        return true;
    }
}