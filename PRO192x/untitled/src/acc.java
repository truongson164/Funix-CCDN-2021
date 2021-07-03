public class acc extends Employee {
    private double salary=100.0;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public String toString() {
        return super.toString() +" "+salary;
    }

}
