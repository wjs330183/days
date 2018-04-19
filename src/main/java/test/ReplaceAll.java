package test;

public class ReplaceAll {
    private static String s = "setDeviceNodeId";
    private static String s1 = "";
    public static void main(String[] args) {
        s1 = s.substring(3,s.length()-6);
        System.out.println(s1.toString());
    }
}
//(?:_|node|id|service)