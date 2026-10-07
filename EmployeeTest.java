abstract class Employee {
    protected String name;
    protected int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("Tên: " + name + " | Tuổi: " + age + " | Lương: " + calculateSalary());
    }
}

class OfficeEmployee extends Employee {
    private static final double DAILY_RATE = 100.0;
    private int workingDays;

    public OfficeEmployee(String name, int age, int workingDays) {
        super(name, age);
        this.workingDays = workingDays;
    }

    @Override
    public double calculateSalary() {
        return workingDays * DAILY_RATE;
    }
}

class TechnicalEmployee extends Employee {
    private double workingHours;
    private double hourlyRate;

    public TechnicalEmployee(String name, int age, double workingHours, double hourlyRate) {
        super(name, age);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return workingHours * hourlyRate;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];

        employees[0] = new OfficeEmployee("Nguyễn Văn A", 28, 22);
        employees[1] = new TechnicalEmployee("Trần Thị B", 25, 160, 150);
        employees[2] = new OfficeEmployee("Lê Văn C", 30, 20);
        employees[3] = new TechnicalEmployee("Phạm Văn D", 27, 140, 200);

        System.out.println("=== DANH SÁCH LƯƠNG NHÂN VIÊN ===");
        for (int i = 0; i < employees.length; i++) {
            employees[i].displayInfo();
        }
    }
}