package objects;

public class Student {
    public String name;
    public int age;
    public char grade;
    public double percentage;

    public Student(String name, int age, char grade, double percentage) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.percentage = percentage;
    }

    public double calculateAmount() {
        double amount = 0;

        if (percentage <= 50) {
            amount = 250000;
        } else if (percentage > 50 || percentage <= 60) {
            amount = 250000 - ((250000 * 10) / 100);
        } else if (percentage > 60 || percentage <= 70) {
            amount = 250000 - ((250000 * 20) / 100);
        } else if (percentage > 70 || percentage <= 80) {
            amount = 250000 - ((250000 * 30) / 100);
        } else if (percentage > 80 || percentage <= 90) {
            amount = 250000 - ((250000 * 40) / 100);
        } else if (percentage > 90 || percentage <= 100) {
            amount = 250000 - ((250000 * 50) / 100);
        }

        return amount;
    }
}
