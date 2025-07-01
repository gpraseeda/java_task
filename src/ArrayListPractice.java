
    import java.util.*;

    class StudentList {
        String name;
        int age;
        int id;

        // Constructor
        StudentList(String name, int age, int id) {
            this.name = name;
            this.age = age;
            this.id = id;
        }

        // Display student info
        public String toString() {
            return "Student{id=" + id + ", name='" + name + "', age=" + age + "}";
        }
    }

    public class ArrayListPractice {
        public static void main(String[] args) {
            // Integer list operations
            List<Integer> numbers = new ArrayList<>();

            // Add elements
            numbers.add(45);
            numbers.add(10);
            numbers.add(32);
            numbers.add(89);

            System.out.println("Original list: " + numbers);

            // Remove an element
            numbers.remove(Integer.valueOf(10));
            System.out.println("After removing 10: " + numbers);

            // Sort the list
            Collections.sort(numbers);
            System.out.println("Sorted list: " + numbers);

            // Find max and min
            int max = Collections.max(numbers);
            int min = Collections.min(numbers);
            System.out.println("Max: " + max + ", Min: " + min);

            // Reverse the list
            Collections.reverse(numbers);
            System.out.println("Reversed list: " + numbers);

            System.out.println("\n--- Student List ---");

            // Create and store students in ArrayList
            List<StudentList> students = new ArrayList<>();
            students.add(new StudentList("Alice", 20, 101));
            students.add(new StudentList("Bob", 22, 102));
            students.add(new StudentList("Charlie", 19, 103));

            // Display student info
            for (StudentList s : students) {
                System.out.println(s);
            }
        }


}
