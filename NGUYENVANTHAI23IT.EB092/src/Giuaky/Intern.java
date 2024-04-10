package Giuaky;

public class Intern extends Employee {
    private String Majors;
    private int Semester;
    private String University_name;

    public Intern(String ID, String FullName, String BirthDay, String Phone, String Email, String Employee_type, String Majors, int Semester, String University_name) {
        super(ID, FullName, BirthDay, Phone, Email, Employee_type);
        this.Majors = Majors;
        this.Semester = Semester;
        this.University_name = University_name;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Majors: " + Majors);
        System.out.println("Semester: " + Semester);
        System.out.println("University Name: " + University_name);
    }
}
