class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}

class StudentView {

    void display(String name) {
        System.out.println("Student : " + name);
    }
}

class StudentController {

    Student model;
    StudentView view;

    StudentController(Student model,
                      StudentView view) {
        this.model = model;
        this.view = view;
    }

    void updateView() {
        view.display(model.name);
    }
}

public class MVCExample {

    public static void main(String[] args) {

        Student model =
                new Student("Adi");

        StudentView view =
                new StudentView();

        StudentController controller =
                new StudentController(model, view);

        controller.updateView();
    }
}