package test;

public class ForTest {
    public static void main(String[] args) {
        int[] a = new int[2000];
        int[] b = new int[50000];
        Long start = System.currentTimeMillis();
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
            }
        }
        Long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
