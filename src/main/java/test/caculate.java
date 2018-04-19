package test;


public class caculate {
//    public static void main(String[] args) {
//        int a = Integer.MAX_VALUE;
//        int b = Integer.MAX_VALUE;
//        int sum = a + b;
//        System.out.println("a=" + a + ",b=" + b + ",sum=" + sum);
////        BigInteger bigInteger = new BigInteger(a);
////        BigInteger bigInteger1 = a;
////        bigInteger.and(bigInteger1);
//        ccdemo cc = new ccdemo("000");
//        System.out.println(cc.toString());
//    }
    public static void main(String[] args) {
        System.out.println(args[0]);
    }

}

class ccdemo{
    String str = "123";
    public ccdemo(String string) {
        str = string;
    }

    @Override
    public String toString() {
        return "ccdemo{" +
                "str='" + str + '\'' +
                '}';
    }
}

