public class PartTimeEmployee extends Employee
{
    private int hourWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name,int id, int hourWorked,double hourlyRate)
    {
        super(name,id);
        this.hourWorked=hourWorked;
        this.hourlyRate=hourlyRate;
    }

    @Override
    public double calculateSalary()
    {
        return hourWorked*hourlyRate;
    }
}
