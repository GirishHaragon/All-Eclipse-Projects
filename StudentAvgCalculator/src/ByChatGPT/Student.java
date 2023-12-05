package ByChatGPT;

import java.util.List;

public class Student {
	private String name;
    private List<Double> marks;

    public Student(String name, List<Double> marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public double calculateAverage() {
        double sum = 0.0;
        for (Double mark : marks) {
            sum += mark;
        }
        return sum / marks.size();
    }
}
