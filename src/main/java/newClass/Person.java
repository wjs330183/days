package newClass;

class Person implements Cloneable {
   private String name;
   private int age;

   public Person(String name, int age) {
       this.name = name;
       this.age = age;
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public void setAge(int age) {
       this.age = age;
   }

   public int getAge() {
       return age;
   }

   public Object clone() throws CloneNotSupportedException {
       return super.clone();
   }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
