package java;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by AnLu on
 * 2017/5/6 15:30.
 * JavaSE_20171
 */
//使用反射机制获取 java.lang.String 类的所有域、构造方法、成员方法
public class T4 {
    public static void main(String[] args) throws NoSuchMethodException {
        Class clazz = String.class;

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        System.out.println("------------------");

        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName());
        }
            System.out.println("---------------------");

            Method[] methods = clazz.getMethods();
            for (Method method : methods) {
                System.out.println(method.getName());
            }
        }
    }
