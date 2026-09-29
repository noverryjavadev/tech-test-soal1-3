public class Manager extends Employee {
    private String department;

    public Manager(String var1, double var2, String var4) {
        super(var1, var2);
        this.department = var4;
    }

    public String getDepartment() {
        return this.department;
    }

    public void tampilkanData() {
        System.out.println("Name: " + this.getName());
        System.out.printf("Salary: %.0f%n", this.getSalary());
        System.out.println("Department: " + this.getDepartment());
    }
}
