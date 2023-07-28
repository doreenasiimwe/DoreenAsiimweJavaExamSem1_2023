import java.util.ArrayList;

public class Student {
    //write a java program to create a class called student with a name,grade,and courses.
    //methods to add and remove courses
    private  String name;
    private int grade;
    private String course;



    private static ArrayList<Student>students =new ArrayList<Student>();

//constructor

    public Student(String name, int grade,String course) {
        this.name = name;
        this.grade = grade;
        this.course = course;
    }
//getters and setters
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
    public String getCourse() {
        return course;
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }
     public  static  void addStudent(Student student){
        students.add(student);
     }



}
