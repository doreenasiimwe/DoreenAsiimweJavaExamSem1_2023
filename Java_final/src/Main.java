import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //number one
        //display the sum of even numbers below 8
        int sum =0;
        for (int i=1;i<8;i++)
            if (i % 2 == 0) {

                System.out.println(sum += i);
            }

//        find the average of 5 input numbers
//Using the Scanner Class to get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the Second number: ");
        Scanner scanne = new Scanner(System.in);
        int secondNumber = scanne.nextInt();
        System.out.println("Enter the Third number: ");
        Scanner scann = new Scanner(System.in);
        int thirddNumber = scann.nextInt();
        System.out.println("Enter the Fourth number: ");
        Scanner scan = new Scanner(System.in);
        int fourthNumber = scan.nextInt();
        System.out.println("Enter the Fifth number: ");
        Scanner sca = new Scanner(System.in);
        int fifthNumber = sca.nextInt();


        System.out.println("The average of the five numbers is: "+ (firstNumber+secondNumber+thirddNumber+fourthNumber+fifthNumber)/5);
//     java program toprint out the following operations
//        operation a
        int a = -5+8*6;
        int b = (55+9)%9;
        int c = 20+-3*5/8;
        int d = 5+15/3*2-8%3;
        System.out.println("Part a: "+ a + "\n Part b: " + b + "\n Part C: " +c + "\n part d: " +d);
   //java program that creates an array list of animals and prints the animals in a collection;
        ArrayList<String>animals =new ArrayList<String>();
        //Adding animals to the collection
        animals.add("Cow");
        animals.add("Goat");
        animals.add("Sheep");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Donkey");
        animals.add("Horse");
        animals.add("lion");
        System.out.println("Collection of animals: "+ animals);

        //Question Two
        //A private modifier is an accessor that makes attributes of a class only accessible to that class and it is used for security

      //  Public access modifier is an accessor that makes a class or attributes to be accessed by any other class forexemple in inheritance the super class has to be public

      //  Protected modifier is an accessor used in inheritance to protect the attributes of a class


    //    Student Class
        Student student = new Student("Atim Dorah",80,"Java");
        Student student1= new Student("Asiimwe Sarah",90,"Python");
        Student student2 = new Student("Nganda Tracy",70,"Javascript");
        Student student3 = new Student("Muzaki Gladys",95,"Graphics Design");
        //Adding students to the collection
        Student.addStudent(student);
        Student.addStudent(student1);
        Student.addStudent(student2);
        Student.addStudent(student3);
        ArrayList<Student>students = Student.getStudents();
        for (Student studen_t:students
             ) {
            System.out.println();
            System.out.println("StudentName: "+ studen_t.getName()+ "\n Student Grade: "+ studen_t.getGrade()+ "\n Course: " + studen_t.getCourse());
        }


        //Courses
        Courses course = new Courses("Java","CSD 313");
        Courses course1 = new Courses("Javascript","CSD 212");
        Courses course2 = new Courses("Python","CSD 312");
        Courses course3 = new Courses("WebDevelopment","CSD 217");
        Courses course4 = new Courses("Hardware","CSD 314");
        Courses course5 = new Courses("Graphics Design","CSD 414");
        Courses course6 = new Courses("Reactjs","CSD 321");
        //Adding courses to the collection
        Courses.addCourses(course);
        Courses.addCourses(course1);
        Courses.addCourses(course2);
        Courses.addCourses(course3);
        Courses.addCourses(course4);
        Courses.addCourses(course5);
        Courses.addCourses(course6);
        System.out.println("Before Removing Courses");
        ArrayList<Courses>courses = Courses.getCourses();
        for (Courses cours_e:courses
             ) {
            System.out.println();
            System.out.println("Name: " + cours_e.getCourseName() + "\b Course Code: " + cours_e.getCourseCode());
        }
        Courses.removeCourses(course);
        Courses.removeCourses(course1);

        System.out.println("After Removing Courses");

        for (Courses cours_e:courses
        ) {
            System.out.println();
            System.out.println("Name: " + cours_e.getCourseName() + "\b Course Code: " + cours_e.getCourseCode());
        }


        // Restaurant
        Restaurant item1 = new Restaurant("Matooke Masala",20000,5);
        Restaurant item2= new Restaurant("Chicken Tikka",80000,6);
        Restaurant item3 = new Restaurant("Chps and chicken",90000,9);
        Restaurant item4= new Restaurant("Shawarma",120000,10);
        Restaurant item5 = new Restaurant("Green sensation",60000,2);

        //Adding items
        Restaurant.addItems(item1);
        Restaurant.addItems(item2);
        Restaurant.addItems(item3);
        Restaurant.addItems(item4);
        Restaurant.addItems(item5);
        //adding ratings to a collection
        Restaurant.addRatings(item1.getRatings());
        Restaurant.addRatings(item2.getRatings());
        Restaurant.addRatings(item3.getRatings());
        Restaurant.addRatings(item4.getRatings());
        Restaurant.addRatings(item5.getRatings());



        //displaying all the items
        ArrayList<Restaurant>menuItems = Restaurant.getMenuItems();
        System.out.println("Before Removing Items");
        for (Restaurant item:menuItems
             ) {
            System.out.println();
            System.out.println("ItemName: "+ item.getItemname() + "\n Price: " + item.getItemPrices() + "\n ratings: " + item.getRatings());
        }
        //Removing items
        Restaurant.removeItems(item2);
        Restaurant.removeItems(item1);
        Restaurant.removeItems(item3);
        System.out.println("After Removing Items");
        for (Restaurant item:menuItems
        ) {
            System.out.println();
            System.out.println("ItemName: "+ item.getItemname() + "\n Price: " + item.getItemPrices() + "\n ratings: " + item.getRatings());
        }

        //Average ratings
        Restaurant.getAverageRatings();

    //Number four
        //A class is a blue print of an object and must start with a capital letter
        //An object is an instance of a class. it is instantiated by the new key word.


        //Person Class
        Person person = new Person("Ankunda Anita",20);
        Person person1 = new Person("Amayoru Palma",40);
        Person person2 = new Person("Kadondi Bridget",30);
        Person person3 = new Person("Mutoni Elsa",28);
        //Getting the values
        System.out.println("Getting Values Before Updating");
        System.out.println("Name: "+ person1.getName()+ "\n Age "+ person1.getAge());
        System.out.println();
        System.out.println("Name: "+ person.getName()+ "\n Age "+ person.getAge());
        System.out.println();
        System.out.println("Name: "+ person2.getName()+ "\n Age "+ person2.getAge());
        System.out.println();
        System.out.println("Name: "+ person3.getName()+ "\n Age "+ person3.getAge());
        //Updating Values
        person2.setName("Karungi Dorah");
        person2.setAge(24);
        person.setName("Atim Sarah");
        person.setAge(26);
        person1.setName("Sewava James");
        person1.setAge(30);
        person3.setAge(50);
        person3.setName("Mugabe Timothy");
        System.out.println("Getting Values After Updating");
        System.out.println("Name: "+ person1.getName()+ "\n Age "+ person1.getAge());
        System.out.println();
        System.out.println("Name: "+ person.getName()+ "\n Age "+ person.getAge());
        System.out.println();
        System.out.println("Name: "+ person2.getName()+ "\n Age "+ person2.getAge());
        System.out.println();
        System.out.println("Name: "+ person3.getName()+ "\n Age "+ person3.getAge());
//
        //Box Class
        //instance of the box class
        Box box = new Box(6f);
        //getting the width of the box
        System.out.println("The width of the box is: "+ box.getWidth());
        //updating the width to a new value
        box.setWidth(8f);
        System.out.println();
        System.out.println("The Updated value of the width of a box is: " + box.getWidth());
    }
}