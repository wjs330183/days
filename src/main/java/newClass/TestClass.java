package newClass;

public class TestClass {
    public static void main(String[] args) {
        Class< ?> c1 = null;
        try {
            c1 = Class.forName("newClass.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Person p1 = null;
        try {
            p1 = (Person)c1.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
//        Person p1 = null;
//        try {
//            p1 = (Person) Class.forName("Person").newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        p1.setAge(23);
        p1.setName("阿毛三号");
        System.out.println(p1);
    }
}

