public class newdemo {
    private String name;
    private int birthYear;
    private String usn; // Added attribute

    // Updated constructor to accept and set 'usn'
    newdemo(String name, int birthYear, String usn) {
        this.name = name;
        this.birthYear = birthYear;
        this.usn = usn;
    }

    public void displayStudentInfo() {
        int currentYear = 2025; // Hardcoded current year
        int age = currentYear - birthYear;
        System.out.println("Student Name: " + name);
        System.out.println("USN: " + usn);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        
        String name = "Khadar";
        int birthYear = 2000;
        String usn = "01fe23bca160";

        newdemo student = new newdemo(name, birthYear, usn);
        student.displayStudentInfo();
    }
}
