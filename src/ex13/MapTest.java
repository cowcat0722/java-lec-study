package ex13;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("kim","1234");
        map.put("park","pass");
        map.put("lee","word");

        System.out.println(map.get("lee")); // 키를 가지고 값을 참조

        for(String key : map.keySet()){
            String value = map.get(key);
            System.out.println("Key: " + key + " value: "+ value);
        }
//        map.remove("kim");
        map.put("choi","password");
        System.out.println(map);
    }
}
