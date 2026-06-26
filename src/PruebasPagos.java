public class PruebasPagos {


        public static void main(String[] args) {

            Payable[] payments = {
                    new Invoice("Factura Internet", 120000),
                    new EmployeePayment("David", 2500000),
                    new ServicePayment("Reparación PC", 180000)
            };

            for (Payable payment : payments) {
                System.out.println(payment.getName());
                System.out.println("Valor a pagar: $" + payment.getPaymentAmount());
                System.out.println("---------------------");
            }
        }
    }
