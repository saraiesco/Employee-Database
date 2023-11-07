
class SalesPerson extends Employee {

    public int salesTarget;
    public SalesPerson(int employeeID, String name, int age, String jobTitle, int salary, int salesTarget) {
        super(employeeID, name, age, jobTitle, salary);
        this.salesTarget = salesTarget;
    }

    public int getSalesTarget() {
        return salesTarget;
    }

    public void setSalesTarget(int salesTarget) {
        this.salesTarget = salesTarget;
    }

}
