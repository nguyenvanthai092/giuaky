package Giuaky;

public class Experience extends Employee {
    private int ExpInYear;
    private String ProSkill;

    public Experience(String ID, String FullName, String BirthDay, String Phone, String Email, String Employee_type, int ExpInYear, String ProSkill) {
        super(ID, FullName, BirthDay, Phone, Email, Employee_type);
        this.ExpInYear = ExpInYear;
        this.ProSkill = ProSkill;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Experience in Years: " + ExpInYear);
        System.out.println("Professional Skills: " + ProSkill);
    }
}

