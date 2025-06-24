 public class Course {
    public static void main(String[] args) {
        CourseDetails c1 = new CourseDetails("Java Programming", 6, 15000);
        CourseDetails c2 = new CourseDetails("Web Development", 4, 12000);

        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
        System.out.println();

        c1.updateInstituteName("Tech Academy");

        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}
class CourseDetails{
   String courseName;
   int duration;
   double fee;
   static String  instituteName;

    public CourseDetails(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}
