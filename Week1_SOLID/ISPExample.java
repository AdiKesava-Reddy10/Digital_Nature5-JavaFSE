interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Human implements Workable, Eatable {

    public void work() {
        System.out.println("Human working");
    }

    public void eat() {
        System.out.println("Human eating");
    }
}

class Robot implements Workable {

    public void work() {
        System.out.println("Robot working");
    }
}

public class ISPExample {

    public static void main(String[] args) {

        Human h = new Human();
        h.work();
        h.eat();

        Robot r = new Robot();
        r.work();
    }
}