class Bird {
    void eat() {
        System.out.println("Bird is eating");
    }
}

class Sparrow extends Bird {
    void fly() {
        System.out.println("Sparrow can fly");
    }
}

public class LSPExample {
    public static void main(String[] args) {

        Bird bird = new Sparrow(); // Child replacing Parent

        bird.eat();

        Sparrow sparrow = new Sparrow();
        sparrow.fly();
    }
}


/*output:
Bird is eating
Sparrow can fly
*/