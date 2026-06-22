class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}

class ReportService {

    void generateReport(Student student) {
        System.out.println("Generating report for " + student.name);
    }
}

public class SRPExample {

    public static void main(String[] args) {

        Student student = new Student("Adi");

        ReportService reportService = new ReportService();

        reportService.generateReport(student);
    }
}