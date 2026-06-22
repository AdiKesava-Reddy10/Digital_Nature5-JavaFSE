class Singleton {

    private static Singleton obj =
            new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return obj;
    }

    void show() {
        System.out.println("Singleton Object");
    }
}

public class SingletonExample {

    public static void main(String[] args) {

        Singleton s =
                Singleton.getInstance();

        s.show();
    }
}
//OUTPUT: Singleton Object