package ByChatGPT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentAverageCalculator {
	public static final String[] STUDENT_NAMES = {"Sanket", "Girish", "Akash", "Ashwin", "Hardik", "Gokul", "Ishan", "Ashish", "Gourav", "Girish"};
    public static final List<List<Double>> MARKS = new ArrayList<>();
    
    static {
        MARKS.add(Arrays.asList(10.0, 10.0, 10.0)); // Marks for Student1
        MARKS.add(Arrays.asList(88.0, 92.5, 76.0)); // Marks for Girish
        MARKS.add(Arrays.asList(76.5, 89.0, 91.5)); // Marks for Akash
        MARKS.add(Arrays.asList(89.15, 81.2, 75.65)); // Marks for Ashwin
        MARKS.add(Arrays.asList(35.20, 45.10, 71.65)); // Marks for Hardik
        MARKS.add(Arrays.asList(79.96, 78.24, 81.54)); // Marks for Gokul
        MARKS.add(Arrays.asList(77.4, 88.40, 71.5)); // Marks for Ishan
        MARKS.add(Arrays.asList(74.55, 69.0, 41.5)); // Marks for Ashish
        MARKS.add(Arrays.asList(77.35, 79.40, 81.55)); // Marks for Gourav
        MARKS.add(Arrays.asList(96.45, 99.70, 81.75)); // Marks for Girish
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Create student objects with constant names and marks
        for (int i = 0; i < STUDENT_NAMES.length; i++) {
            String name = STUDENT_NAMES[i];
            List<Double> marks = MARKS.get(i);
            students.add(new Student(name, marks));
        }

        // Calculate and display average marks for each student
        for (Student student : students) {
            double average = student.calculateAverage();
            System.out.println(student.getName() + "'s Average Marks: " + average);
        }
    }
}
