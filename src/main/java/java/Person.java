package java;

/**
 * Created by anlu on 2017/3/18.
 */
//编写一个人类 Person,其中包含姓名、性别和年龄的属性,包含构造方法以及显示姓名、性别和年龄的方法。
//再编写一个学生类 Student,它继承 Person 类,其中包含学号属性,包含构造方法以及显示学号的方法。
//最后编写一个主类 Test,包含 main 方法, 在 main 方法中定义两个学生 s1 和 s2 并给他们赋值,最后显示他们的学号、姓名、性别以及年龄。
class Test {
    public static void main(String[] args) {
        Student s1 = new Student("s1", 'f', 18, 1);
        System.out.println(s1.getNumber());
        System.out.println(s1.getName());
        System.out.println(s1.getGender());
        System.out.println(s1.getAge());
        Student s2 = new Student("s2", 'm', 20, 2);
        System.out.println(s2.number);
        System.out.println(s2.name);
        System.out.println(s2.gender);
        System.out.println(s2.age);
    }
}


class Person {
    String name;
    char gender;
    int age;

    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person {
    int number;

    public Student(String name, char gender, int age, int number) {
        super(name, gender, age);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
