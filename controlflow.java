
public class controlflow {
    public static void main(String[] args) {

        
        String name = "Pio Nicolai Bacani";
        String idNumber = "2026-7344";
        String course = "BSIT";
        String schoolYear = "2026-2027";

        
        String subject1 = "Colloquium";
        double grade1 = 90;

        String subject2 = "Work Education";
        double grade2 = 88;

        String subject3 = "Computer Programming 2";
        double grade3 = 92;

        String subject4 = "Arts Appreciation";
        double grade4 = 85;

        String subject5 = "Discrete Mathematics";
        double grade5 = 95;

        String subject6 = "CWTS 2";
        double grade6 = 90;

        String subject7 = "PATHFIT 2";
        double grade7 = 93;

        String subject8 = "Life and Teachings of Jesus";
        double grade8 = 89;

        String subject9 = "Living in the IT Era";
        double grade9 = 94;

        
        double gwa = (grade1 + grade2 + grade3 +
                      grade4 + grade5 + grade6 +
                      grade7 + grade8 + grade9) / 9;

        
        String letterGrade;

        if (gwa >= 98) {
            letterGrade = "A";
        } else if (gwa >= 95) {
            letterGrade = "A-";
        } else if (gwa >= 91) {
            letterGrade = "B+";
        } else if (gwa >= 88) {
            letterGrade = "B";
        } else if (gwa >= 85) {
            letterGrade = "B-";
        } else if (gwa >= 81) {
            letterGrade = "C+";
        } else if (gwa >= 78) {
            letterGrade = "C";
        } else if (gwa >= 75) {
            letterGrade = "C-";
        } else if (gwa >= 70) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        
        System.out.println(" STUDENT INFORMATION ");
        System.out.println("Student Name: " + name);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Course: " + course);
        System.out.println("School Year: " + schoolYear);

        
        System.out.println("\n MY COURSES ");
        System.out.println(subject1 + " - " + grade1);
        System.out.println(subject2 + " - " + grade2);
        System.out.println(subject3 + " - " + grade3);
        System.out.println(subject4 + " - " + grade4);
        System.out.println(subject5 + " - " + grade5);
        System.out.println(subject6 + " - " + grade6);
        System.out.println(subject7 + " - " + grade7);
        System.out.println(subject8 + " - " + grade8);
        System.out.println(subject9 + " - " + grade9);

        
        System.out.println("\n========== FINAL GRADE ==========");
        System.out.printf("General Weighted Average: %.2f%n", gwa);
        System.out.println("Letter Grade: " + letterGrade);

        
        System.out.println("\n========== GRADING SCALE ==========");
        System.out.printf("%-15s %-15s%n", "GRADE RANGE", "LETTER GRADE");
        System.out.println("-----------------------------------");
        System.out.printf("%-15s %-15s%n", "100 - 98", "A");
        System.out.printf("%-15s %-15s%n", "97 - 95", "A-");
        System.out.printf("%-15s %-15s%n", "94 - 91", "B+");
        System.out.printf("%-15s %-15s%n", "90 - 88", "B");
        System.out.printf("%-15s %-15s%n", "87 - 85", "B-");
        System.out.printf("%-15s %-15s%n", "84 - 81", "C+");    
        System.out.printf("%-15s %-15s%n", "80 - 78", "C");
        System.out.printf("%-15s %-15s%n", "77 - 75", "C-");
        System.out.printf("%-15s %-15s%n", "74 - 70", "D");
        System.out.printf("%-15s %-15s%n", "69 below", "F");
        System.out.println("===================================");
    }
}
