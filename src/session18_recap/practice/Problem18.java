package session18_recap.practice;

import java.util.HashMap;
import java.util.Map;

public class Problem18 {

    //Consider:
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Key", "Value1");
        map.put("Key", "Value2");
        System.out.println(map.get("Key"));
    }
}
/*
What is the result?
a) Value1
b) Value2
c) Key
d) null
 */