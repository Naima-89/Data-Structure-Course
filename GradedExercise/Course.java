package GradedExercise;

public class Course {

    private String courseName;
    private String[] students;
    private int numberOfStudents;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        students = new String[10];
        numberOfStudents = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    // Add a student
    public void addStudents(String student) {

        if (numberOfStudents >= students.length) {

            String[] temp = new String[students.length * 2];

            for (int i = 0; i < students.length; i++) {
                temp[i] = students[i];
            }

            students = temp;
        }

        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    // Remove a student
    public void dropStudent(String student) {

        for (int i = 0; i < numberOfStudents; i++) {

            if (students[i].equals(student)) {

                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }

                students[numberOfStudents - 1] = null;
                numberOfStudents--;

                break;
            }
        }
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    // Test the Course class
    public static void main(String[] args) {

        Course course = new Course("Java");

        course.addStudents("Maryan");
        course.addStudents("Ali");
        course.addStudents("aisha");

        System.out.println("Course: " + course.getCourseName());

        System.out.println("Number of Students: "
                + course.getNumberOfStudents());

        System.out.println("Students:");

        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println(course.getStudents()[i]);
        }

        course.dropStudent("Ali");

        System.out.println("After dropping Ali:");

        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println(course.getStudents()[i]);
        }

        System.out.println("Number of Students: "
                + course.getNumberOfStudents());
    }
}


