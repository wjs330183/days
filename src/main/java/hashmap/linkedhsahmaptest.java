package hashmap;

import java.util.*;

public class linkedhsahmaptest {

    public static void main(String[] args) {
//        Map<Integer, String> map = new LinkedHashMap<Integer, String>();
//        Map<Integer, String> map = new HashMap<Integer, String>();
        Map<Integer, String> map = new TreeMap<Integer, String>();
        Random rom = new Random();
        for (int i = 0; i < 100; i++) {
            String j = Integer.toString(rom.nextInt(100)+1);
            Integer k = rom.nextInt(100) + 1;
//            System.out.println(j);
            map.put(k, j);
        }
//        for (String s: map.values()) {
//            System.out.println(s);
//        }
        for (int i = 0; i <100 ; i++) {
            System.out.println(map.get(i));
            System.out.println(map.values());
        }
    }
}
