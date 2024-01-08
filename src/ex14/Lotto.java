package ex14;

import java.util.*;

public class Lotto {
    public static void main(String[] args) {
        //HashMap<String, Object> data = new HashMap<>();
        Set<Integer> lotto = new HashSet<>();

        Random r = new Random();
        while (true) {
            int num = r.nextInt(45) + 1; // 6, 8, 20, 30, 40, 40, 50
            lotto.add(num);

            if (lotto.size() == 6) break;
        }
        List<Integer> arr = new ArrayList<>(lotto);
        Collections.sort(arr);

        arr.stream().forEach(i -> System.out.print(i + " "));
    }
}