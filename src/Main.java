public class Main
{
    public static void main(String[] args)
    {
        PayrollSystem payrollSystem=new PayrollSystem();
        FullTimeEmployee e1=new FullTimeEmployee("Ram Sharma",1001,30000.00);
        PartTimeEmployee e2=new PartTimeEmployee("dixit Verma",1002,23,100);

        payrollSystem.addEmployee(e1);
        payrollSystem.addEmployee(e2);

        System.out.println("Employee details:");
        payrollSystem.showEmployee();

        System.out.println("Removing Employee:-");
        payrollSystem.removeEmployee(1002);
        System.out.println("Remaining Employees:-");
        payrollSystem.showEmployee();
    }
}
