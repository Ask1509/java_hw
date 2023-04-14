package Home_Work_4;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class task_5 {

    public static void main(String[] args) {
        String s = "({[]{Java}})";
        System.out.println(s);
        System.out.println(validate(s));
    }

    private static boolean validate(String input) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');

        Deque<Character> stack = new LinkedList<>();

        for (char c : input.toCharArray()) {
            if (brackets.containsValue(c)) {

                stack.push(c);

            } else if (brackets.containsKey(c)) {

                if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}