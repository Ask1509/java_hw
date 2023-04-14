/*
Task_1
public class Task_1 {
Вам дается строка S и целочисленный массив индексов int index[s.length].
Напишите программу, которая перетасует символы в S таким образом,
что символ c i-й позиции переместится на индекс index[i] в результирующей строке.

Пример: s = “cba”, index = [3,2,1] result “abc”
public static void main(String[] args) {
}
public String shuffle(final String s, final int[] index){
    return "";
}
}*/

package Home_Work_2;

public class task_2 {

    public static String shuffle(final String s, final int[] index) {
        String newS = "";
        for (int i = 0; i < index.length; i++) {
            char currentChar = s.charAt(index[i] - 1);
            newS = addChar(newS, currentChar, i);
        }
        return newS;
    }

    public static String addChar(String str, char ch, int position) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(position, ch);
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "cba";
        int[] index = { 3, 2, 1 };
        System.out.println(shuffle(s, index));
    }

}