package collections;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;


/* organizar a los empleados por su departamento y, dentro de cada departamento, ordenarlos por nombre y luego por edad. */
class EmployeeInMemoryCache {
    private final Map<UUID, Employee> cache = new ConcurrentHashMap<>();

    public Map<Department, List<Employee>> getEmployeesGroupedByDepartmentAndSortedByNameAndAge() {
        return cache.values().stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getDateOfBirth)).collect(Collectors.groupingBy(Employee::getDepartment));
    }
    public static void main(String[] args) {
        EmployeeInMemoryCache memoryCache = new EmployeeInMemoryCache();
        memoryCache.cache.put(UUID.randomUUID(),new Employee(1,"Octavio",LocalDate.of(1990,5,12),Department.ACCOUNTING));
        memoryCache.cache.put(UUID.randomUUID(),new Employee(2,"Alberto",LocalDate.of(2015,10,5),Department.MARKETING));
        memoryCache.cache.put(UUID.randomUUID(),new Employee(1,"Benito",LocalDate.of(2025,6,1),Department.HUMAN_RESOURCES));

        Map<Department,List<Employee>> result=memoryCache.getEmployeesGroupedByDepartmentAndSortedByNameAndAge();

        for(Map.Entry<Department,List<Employee>> entry: result.entrySet()){
            System.out.println("Departamento " + entry.getKey());
            for(Employee employee: entry.getValue()){
                System.out.println(" - " + employee.getName() + " Nacimiento: " + employee.getDateOfBirth());
            }
        }
    }
}
enum Department {
    ACCOUNTING, MARKETING, HUMAN_RESOURCES;
}

class Employee {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private Department department;

    // Constructor
    public Employee(int id, String name, LocalDate dateOfBirth, Department department) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Department getDepartment() {
        return department;
    }
}