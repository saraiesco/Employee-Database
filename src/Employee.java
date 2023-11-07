public class Employee {
   public int employeeID;
   public String name;
    public int age;
    public String title;
    public int salary;
   public Employee(int employeeID , String name, int age ,String title, int salary){
       this.employeeID = employeeID;
       this.name=name;
       this.age=age;
       this.title =title;
       this.salary =salary;
   }

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getTitle() {
        return title;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
