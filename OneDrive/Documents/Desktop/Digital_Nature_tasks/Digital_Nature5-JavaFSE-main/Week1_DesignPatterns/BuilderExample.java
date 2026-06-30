class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class BuilderExample {

    public static void main(String[] args) {

        Student s =
                new Student("Adi", 22);

        s.display();
    }
}