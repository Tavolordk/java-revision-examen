
public class Employee {
    public int employeeId;
    public String firstName, lastName;
    public int yearStarted;
    @Override
    public int hashCode() {
        return employeeId;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return employeeId == employee.employeeId;
    }

    public static void main(String[] args) {
        Role.dameNivelDeAccesos(Role.OCTAVIO);
        Employee one = new Employee();
        one.employeeId = 101;
        Employee two = new Employee();
        two.employeeId = 101;
        if (one.equals(two))
            System.out.println("Success");
        else
            System.out.println("Failure");
    }
}