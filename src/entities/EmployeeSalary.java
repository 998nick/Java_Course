package entities;

public class EmployeeSalary {
    public  String name;
    public double GrossSalary;
    public double tax;


    public double netSalary() {
        return GrossSalary - tax;
    }

    public void increaseSalary(double porcentage) {
        porcentage  =  GrossSalary * (porcentage / 100);
        GrossSalary += porcentage;
    }

    public String toString() {
        return
                name
                        + ", $ "
                        +String.format("%.2f%n", netSalary());
    }
}
