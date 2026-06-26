public class ServicePayment implements Payable {

    private String serviceName;
    private double cost;

    public ServicePayment(String serviceName, double cost) {
        this.serviceName = serviceName;
        this.cost = cost;
    }

    @Override
    public String getName() {
        return serviceName;
    }

    @Override
    public double getPaymentAmount() {
        return cost;
    }
}