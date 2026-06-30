interface Database {
    void connect();
}

class MySQLDatabase implements Database {

    public void connect() {
        System.out.println("Connected to MySQL");
    }
}

class StudentService {

    Database db;

    StudentService(Database db) {
        this.db = db;
    }

    void start() {
        db.connect();
    }
}

public class DIPExample {

    public static void main(String[] args) {

        Database db = new MySQLDatabase();

        StudentService service =
                new StudentService(db);

        service.start();
    }
}