public class Invoice implements Payable {

    private String name;
    private double amount;

    public Invoice(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPaymentAmount() {
        return amount;
    }
}