class Manager extends Employee{

    String department;

    public Manager(int employeeID, String name, int age, String title, int salary, String department) {
        super(employeeID, name, age, title, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
