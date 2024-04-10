package Giuaky;

public class Fresher extends Employee {
    private String Graduation_date;
    private String Graduation_rank;
    private String Education;

    public Fresher(String ID, String FullName, String BirthDay, String Phone, String Email, String Employee_type, String Graduation_date, String Graduation_rank, String Education) {
        super(ID, FullName, BirthDay, Phone, Email, Employee_type);
        this.Graduation_date = Graduation_date;
        this.Graduation_rank = Graduation_rank;
        this.Education = Education;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Graduation Date: " + Graduation_date);
        System.out.println("Graduation Rank: " + Graduation_rank);
        System.out.println("Education: " + Education);
    }
}
