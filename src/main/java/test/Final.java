package test;

public class Final {
    public static void main(String[] args) {
        final StringBuffer a = new StringBuffer("immutable");
        System.out.println(a);
//        a = new StringBuffer("");
        a.append("broken!");
        System.out.println(a);

    }
}
