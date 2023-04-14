/*
Task_0
public class Task_0 {
Посчитайте сколько драгоценных камней в куче обычных камней
Пример:
jewels = “aB”, stones = “aaaAbbbB”
Результат в консоль ”a3B1”
public static void main(String[] args) {
}
public String findJewelsInStones(String jewels, String stones) {
    return "";
}
}
*/

package Home_Work_2;

public class task_1 {

    public static String findJewelsStones(String jewels, String stones) {
        String outputResult = "";
        int counter = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    counter++;
                }
            }
            outputResult = outputResult + jewels.charAt(i) + counter;
            counter = 0;
        }
        return outputResult;
    }

    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";
        System.out.println(findJewelsStones(jewels, stones));
    }
}