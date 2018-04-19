package test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class classLang {
    public static void main(String[] args) {
        try {
            Class class1 = Class.forName("test.Sort");
            Object object = class1.newInstance();
            Sort sort = (Sort) object;
            Method method1 = class1.getDeclaredMethod("method1",int.class,int.class,int[].class);
            method1.setAccessible(true);
            Method[] methods = class1.getMethods();
            for (Method method : methods) {
                System.out.println(method);
            }
            System.out.println(class1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
