package Home_Work_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task_1 {

    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void printBook(Map<String, ArrayList<Integer>> map) {
        for (var item : map.entrySet()) {
            String phones = "";
            for (int element : item.getValue()) {
                phones = phones + element + " ";
            }
            phones = phones.trim().replaceAll(" ", ", ");
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Ivanov", 112, bookPhone);
        addNumber("Petrov", 113, bookPhone);
        addNumber("Sidorov", 114, bookPhone);
        addNumber("Sidorov", 1111, bookPhone);
        addNumber("Sidorov", 987239, bookPhone);
        addNumber("Sidorov", 29837963, bookPhone);
        addNumber("Karasev", 4321, bookPhone);
        addNumber("Popov", 3435453, bookPhone);
        addNumber("Tarasov", 76328740, bookPhone);
        printBook(bookPhone);
    }
}