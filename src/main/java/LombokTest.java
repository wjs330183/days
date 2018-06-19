import Lock.ReadWriteLock;

import newClass.Person;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class LombokTest {

    Person person = Person.builder().age(1).build();

    public static void main(String[] args) {
        Class clazz=Person.class;
       Annotation annotation=clazz.getAnnotation(Person.class);


    }
}
