package Review10;

public class Encapsulation {
    private String empName;
    private int empAge;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation();
        obj.setEmpName("Mario");
        obj.setEmpAge(32);
        System.out.println("Employee Name: "+obj.getEmpName());
        System.out.println("Employee Name: "+obj.getEmpAge());
    }
}



