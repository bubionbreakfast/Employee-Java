package staff;

public abstract class Employee {

    private String name;
    private int NINumber;
    private Double salary;

    public Employee(String name, int NINumber, Double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNINumber() {
        return NINumber;
    }

    public void setNINumber(int NINumber) {
        this.NINumber = NINumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public abstract Double raiseSalary();

    public abstract Double payBonus();

}
