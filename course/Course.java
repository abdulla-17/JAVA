package course;

public class Course {

    
    String courseName;
    int durationInWeeks;
    int no_ofStudents;

   
    final String creatorName = "CodeMentor Academy";

   
    static int totalStudents = 0;

    
    Course(String courseName, int durationInWeeks, int no_ofStudents) {
        this.courseName = courseName;
        this.durationInWeeks = durationInWeeks;
        this.no_ofStudents = no_ofStudents;

        totalStudents += no_ofStudents;
    }

    
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration (weeks): " + durationInWeeks);
        System.out.println("Number of Students: " + no_ofStudents);
        System.out.println("Creator Name: " + creatorName);
        System.out.println("----------------------------------");
    }

   
    public static void displayTotalStudents() {
        System.out.println("Total Students across all courses: " + totalStudents);
    }

    
    public static class Platform {
        public static void showPlatformMsg() {
            System.out.println("Courses are hosted on CodeMentor");
        }
    }
}



public class CourseTest {
    public static void main(String[] args) {
      
        Course course1 = new Course("Java Programming", 15, 35);
        Course course2 = new Course("Python Programming", 12, 50);

    
        course1.displayCourseDetails();
        course2.displayCourseDetails();

      
        Course.displayTotalStudents();

     
        Course.Platform.showPlatformMsg();
    }
}