interface Observer {
    void update();
}

class Subscriber implements Observer {

    public void update() {
        System.out.println("Video Uploaded");
    }
}

public class ObserverExample {

    public static void main(String[] args) {

        Observer ob =
                new Subscriber();

        ob.update();
    }
}
//OUTPUT:Video Uploaded