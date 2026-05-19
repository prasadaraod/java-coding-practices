import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // 1. List (Ordered, allows duplicates)
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        System.out.println("List: " + list);

        // 2. Set (Unordered, unique elements)
        Set<String> set = new HashSet<>(list);
        System.out.println("Set (duplicates removed): " + set);

        // 3. Map (Key-Value pairs)
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "John");
        map.put(2, "Jane");
        map.put(3, "Bob");
        
        System.out.println("Map Iteration:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 4. Custom object sorting using Collections.sort and Comparator
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));

        // Sort by age
        people.sort(Comparator.comparingInt(Person::getAge));
        System.out.println("Sorted People: " + people);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
