package school;

public class gradeReport {
    public static void main(String[] args) {
        int[] marks = {78, 82, 91, 65, 34};

        int total = 0;
        float average;
        boolean isFail = false;

        for (int mark : marks) {
            if (mark < 35) {
                isFail = true;
                break;  
            }
            total += mark;
        }

       
        average = (float) total / marks.length;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        if (isFail) {
            System.out.println("Result: Fail");
        } else {
            System.out.print("Grade: ");
            if (average >= 90) {
                System.out.println("A");
            } else if (average >= 75) {
                System.out.println("B");
            } else if (average >= 60) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }
        }
    }
}  

