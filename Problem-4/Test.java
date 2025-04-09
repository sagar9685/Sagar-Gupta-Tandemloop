import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        Map<Integer, Integer> result = new HashMap<>();
 
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }

     
        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    result.put(i, result.get(i) + 1);
                }
            }
        }

        
        System.out.println(result);
    }
}
