package newClass;

public class TestClone{
    public static void main(String[] args) {
        Person p1 = new Person("阿毛", 23);
        System.out.println(p1);
        Person p2 = null;
        try {
            p2 = (Person) p1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        p2.setName("阿毛二号");
        p2.setAge(24);
        System.out.println(p2);
    }
}

