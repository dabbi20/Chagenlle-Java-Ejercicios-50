public class EmployeePayment implements Payable{
    private String employeeName;
    private double salary;

    public EmployeePayment(String employeeName,double salary){
        this.employeeName = employeeName;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return employeeName;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }
}
