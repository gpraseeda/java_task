import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        // Step 1: Create a HashMap to store employee names and salaries
        HashMap<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("Alice", 70000);
        employeeMap.put("Bob", 85000);
        employeeMap.put("Charlie", 65000);
        employeeMap.put("Diana", 90000);

        // Step 2: Iterate over the map in different ways

        System.out.println("== Using entrySet with for-each loop ==");
        for (Map.Entry<String, Integer> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + " => $" + entry.getValue());
        }

        System.out.println("\n== Using keySet ==");
        for (String name : employeeMap.keySet()) {
            System.out.println(name + " => $" + employeeMap.get(name));
        }

        System.out.println("\n== Using forEach with lambda ==");
        employeeMap.forEach((name, salary) ->
                System.out.println(name + " => $" + salary)
        );

        // Step 3: Use TreeMap to sort by employee name (alphabetically)
        TreeMap<String, Integer> sortedEmployeeMap = new TreeMap<>(employeeMap);

        System.out.println("\n== Sorted Map using TreeMap ==");
        for (Map.Entry<String, Integer> entry : sortedEmployeeMap.entrySet()) {
            System.out.println(entry.getKey() + " => $" + entry.getValue());
        }
    }
}

