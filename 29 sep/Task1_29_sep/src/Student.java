import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Course> skoleFag = new ArrayList<>();

    //Constructor
    Student(String name) {
        this.name = name;

    }

    //1.d Make a method using addCourse and take a Course-object as a parameter and add it to the students arraylist

    public void addCourse(Course basic) {
        skoleFag.add(basic);

    }
//1.e to-String, return nice String-representation of the object, for instance "Student." + name for the student objects

@Override
    public String toString(){
        return "Student" + name;

        }

    }

