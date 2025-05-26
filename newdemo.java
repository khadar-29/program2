public class newdemo {
    private String name;
    private int birthYear;

    newdemo(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public void displayStudentInfo() {
        int currentYear = 2025; // Hardcoded current year
        int age = currentYear - birthYear;
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Hardcoded input instead of scanner
        String name = "John Doe";
        int birthYear = 2000;

        newdemo student = new newdemo(name, birthYear);
        student.displayStudentInfo();
    }
}
