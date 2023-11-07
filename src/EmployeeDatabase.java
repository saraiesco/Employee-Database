
import java.util.Scanner;
import java.util.ArrayList;
public class EmployeeDatabase {
 Scanner scanner = new Scanner(System.in);
   ArrayList<Employee> employees = new ArrayList<Employee>();

   public EmployeeDatabase(){
    employees = new ArrayList<>();
   }
    public void hireEmployee(){
     String personType;
     do{
      System.out.println("Who are we hiring? Employee, Manager, or Salesperson? ");
      personType= scanner.nextLine();
     }while (!personType.equals("Employee") && !personType.equals("Manager") && !personType.equals("Salesperson"));

     if (personType.equals("Employee")) {
      Employee employee = createEmployee();
      employees.add(employee);
     } else if (personType.equals("Manager")) {
      Manager manager = createManager();
      employees.add(manager);
     } else if (personType.equals("Salesperson")) {
      SalesPerson salesperson = createSalesperson();
      employees.add(salesperson);
     }
    }

    public void fireEmployee(){


    }

    public void getEmployee(){


    }

 private Employee createEmployee() {
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter the employee's ID: ");
  int employeeID = scanner.nextInt();

  System.out.print("Enter the employee's name: ");
  String name = scanner.nextLine();

  System.out.print("Enter the employee's age: ");
  int age = scanner.nextInt();

  System.out.print("Enter the employee's job title: ");
  String jobTitle = scanner.nextLine();

  System.out.print("Enter the employee's salary: ");
  int salary = scanner.nextInt();

  return new Employee(employeeID, name, age, jobTitle, salary);
 }

 private Manager createManager() {
  Scanner scanner = new Scanner(System.in);
  Employee employee = createEmployee();

  System.out.print("Enter the manager's department: ");
  String department = scanner.nextLine();

  return new Manager(employee.getEmployeeID(), employee.getName(), employee.getAge(), employee.getTitle(), employee.getSalary(), department);
 }

 private SalesPerson createSalesperson() {
  Scanner scanner = new Scanner(System.in);
  Employee employee = createEmployee();

  System.out.print("What is my target sales? ");
  int salesTarget = scanner.nextInt();

  return new SalesPerson(employee.getEmployeeID(), employee.getName(), employee.getAge(), employee.getTitle(), employee.getSalary(), salesTarget);
 }
static String  answer;
 public static void main(String[] args) {
  System.out.print("Do you want to add an Employee to the database?");
  answer = scanner.next().toLowerCase();
  if (answer.equals("yes")) {
    hireEmployees();
  }
 }
}
