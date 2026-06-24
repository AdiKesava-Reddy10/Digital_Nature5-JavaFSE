class Employee {

    int id;
    String name;

    Employee(int id,String name) {

        this.id=id;
        this.name=name;
    }
}

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Employee emp[] = new Employee[2];

        emp[0] =
                new Employee(1,"Adi");

        emp[1] =
                new Employee(2,"Ravi");

        for(Employee e : emp) {

            System.out.println(
                    e.id + " " + e.name);
        }
    }
}
