import java.util.*;
//class to store courses
public class Courses {
    private String courseName;



    private String courseCode;

    private static ArrayList<Courses>courses = new ArrayList<Courses>();
//constructor
    public Courses(String courseName,String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }
    public String getCourseCode() {
        return courseCode;
    }
    //method to add and remove courses
    public static void addCourses(Courses course){
        courses.add(course);
    }
    public  static  void removeCourses(Courses course){
        courses.remove(course);
    }

    public static ArrayList<Courses> getCourses() {
        return courses;
    }
}
