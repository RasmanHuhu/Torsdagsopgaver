public class Course {

    //1.a
    private String courseName;

    //Constructor
    public Course(String courseName) {
        this.courseName = courseName;
    }

    //1.e
    @Override
    public String toString() {

        return "Course" + courseName;
    }

    }
