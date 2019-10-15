package staff.management;

public class Manager extends staff.Employee {

    private String deptName;

    public Manager(String name, int NINumber, Double salary, String deptName){
        super(name, NINumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Double raiseSalary() {
        if (super.getSalary() > 0.00)
        return super.getSalary() * 1.1;
        else {
            return super.getSalary() * 1;
        }
    }

    public Double setRaiseSalary(Double amount){
        return super.getSalary() * amount;
    }

    public Double payBonus(){
        return super.getSalary() * 0.01;
    }


}
