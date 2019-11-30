import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Just some stream training file
public class Streams {

    List<Employee> employees = new ArrayList<>();

    Streams() {
        employees.add(new Employee("eddy", 1));
        employees.add(new Employee("simon", 2));
        employees.add(new Employee("carl", 3));
        employees.add(new Employee("peter", 4));
    }

    public static void main(String[] args) {
        Streams streams = new Streams();
        List<Employee> idHigherTwo = streams.employees.stream().filter(employee -> employee.getId() > 2).collect(Collectors.toList());
        System.out.println("Employees id higher 2 " + idHigherTwo.stream().map(Employee::getName).collect(Collectors.toList()));
        List<Employee> modifyId = streams.employees.stream().peek(employee -> employee.setId(employee.getId() + 4)).collect(Collectors.toList());
        System.out.println("new Employee Ids " + modifyId.stream().map(Employee::getId).collect(Collectors.toList()));
        int sumOfIds = streams.employees.stream().map(Employee::getId).reduce(0, Integer::sum);
        System.out.println("Sum of ids " + sumOfIds);
    }

    static class Employee {
        private String name;
        private int id;

        Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }

        String getName() {
            return name;
        }

        int getId() {
            return id;
        }

        void setName(String name) {
            this.name = name;
        }

        void setId(int id) {
            this.id = id;
        }
    }

}
