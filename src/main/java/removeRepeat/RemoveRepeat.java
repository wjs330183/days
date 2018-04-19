package removeRepeat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class RemoveRepeat {

    public static void main(String[] args) {

        Random random = new Random();

        List list = new ArrayList();
        for (int i = 0; i < 10000000; i++) {
            list.add(random.nextInt(1000000) + 1);
        }
//        for (Object o : list) {
//            System.out.println(o);
//        }
        System.out.println(System.currentTimeMillis());
        List<Integer> remove = remove(list);
        System.out.println(System.currentTimeMillis());
//        for (Integer integer : remove) {
//            System.out.println(integer);
//        }
//        1524126805586  100W数据
//        1524126807419

    }
    public static List<Integer> remove(List list) {
        return new ArrayList<Integer>(new HashSet<Integer>(list));
    }
}
