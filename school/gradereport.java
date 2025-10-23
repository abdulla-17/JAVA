class GradeReport {
    public static void main(String[] args) {
        int[] marks = { 78, 82, 91, 65, 34 };
        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 35) {
                System.out.println("Result: Fail (Scored below 35 in subject " + (i + 1) + ")");
                break;
            }
            total += marks[i];
        }

        double average = total / (double) marks.length;
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 75) {
            System.out.println("Grade: B");
        } else if (average >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
    }
}