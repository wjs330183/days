package newClass;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Person implements Cloneable {
   private String name;
   private int age;


}
