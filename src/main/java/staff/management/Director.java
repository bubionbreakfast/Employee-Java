package staff.management;


public class Director extends staff.Employee {

    private double budget;

    public Director(String name, int NINumber, Double salary, Double budget) {
        super(name, NINumber, salary);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    public Double raiseSalary(){
        return super.getSalary() * 1.1;
    }

    public Double payBonus(){
        return super.getSalary() * 0.02;
    }
}
