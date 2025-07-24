import java.util.*;

abstract class CourseType {
    String title;
    CourseType(String title) { this.title = title; }
    public String toString() { return title; }
}

class ExamCourse extends CourseType {
    ExamCourse(String title) { super(title); }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String title) { super(title); }
}

class Course<T extends CourseType> {
    List<T> courses = new ArrayList<>();
    void addCourse(T course) { courses.add(course); }
    List<T> getCourses() { return courses; }
    static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses)
            System.out.println(c);
    }
}

public class UniversityCourseManagement {
    public static void main(String[] args) {
        Course<ExamCourse> exams = new Course<>();
        exams.addCourse(new ExamCourse("Java Exam"));
        Course.displayCourses(exams.getCourses());
    }
}