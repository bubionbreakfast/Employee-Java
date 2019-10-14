package staff.techstaff;

import staff.Employee;

public class Developer extends Employee {

    public Developer(String name, int NINumber, Double salary) {
        super(name, NINumber, salary);
    }

    public Double raiseSalary(){
        return super.getSalary() * 1.1;
    }

    public Double payBonus(){
        return super.getSalary() * 0.01;
    }

}
