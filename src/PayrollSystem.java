import java.lang.reflect.Array;
import java.util.ArrayList;

public class PayrollSystem
{
    private ArrayList<Employee> employeeList;
    public PayrollSystem()
    {
        employeeList=new ArrayList<>();
    }

    public void addEmployee(Employee employee)
    {
        employeeList.add(employee);
    }

    public void showEmployee()
    {
        for (Employee employee:employeeList)
        {
            System.out.println(employee);
        }
    }

    public void removeEmployee(int id)
    {
        Employee employeeToRemove=null;
        System.out.print("Removing Employee");
        for(Employee employee:employeeList)
        {
            System.out.print(".");
            if(employee.getId()==id)
            {
                employeeToRemove=employee;
                break;
            }
        }
        if (employeeToRemove!=null)
        {
            employeeList.remove(employeeToRemove);
            System.out.println("Employee removed.");
        }
    }
}
