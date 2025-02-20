public class Course {
    private String courseName;
    private String courseCode;

    // Constructor using 'this' keyword
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Course Code: " + this.courseCode);
    }

    public static void main(String[] args) {
        // Creating an object of the Course class
        Course course1 = new Course("Data Structures", "CS101");

        // Displaying course details
        course1.displayCourseDetails();
    }
}
