import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Record (Java 14+) - Immutable data carrier
record Employee(String name, String department, double salary) {}

public class ModernJavaExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Engineering", 75000),
                new Employee("Bob", "Engineering", 80000),
                new Employee("Charlie", "HR", 60000)
        );

        // 1. Streams & Lambdas
        System.out.println("--- High Earners in Engineering ---");
        List<String> highEarners = employees.stream()
                .filter(e -> e.department().equals("Engineering"))
                .filter(e -> e.salary() > 70000)
                .map(Employee::name) // Method Reference
                .collect(Collectors.toList());
        
        highEarners.forEach(System.out::println);

        // 2. Pattern Matching for instanceof (Java 16+)
        Object obj = "Hello Pattern Matching";
        if (obj instanceof String s) {
            System.out.println("String length: " + s.length());
        }
    }
}
