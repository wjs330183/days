package linkNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class linkLIst {
    public static void main(String[] args) {
        Random random = new Random();
//        LinkedList<Integer> linkedList = new LinkedList();
        List<Integer> linkedList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Integer j = random.nextInt(100) + 1;
            System.out.print(j+",");
            linkedList.add(j);
        }
        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.print(linkedList.get(i)+",");
        }

    }
}
