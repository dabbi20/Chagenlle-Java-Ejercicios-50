public class BankAccount {
    private  double balance;

    public  BankAccount(double balance){this.balance = balance;}
    public void deposito(double deposito)throws IllegalArgumentException {
        if (deposito <= 0){
            throw  new IllegalArgumentException("El monto a depositar debe de ser mayor a 0");
        }else {
            balance = deposito + balance;
            System.out.println("Deposito realizado con exito!");
        }
    }

    public void withdraw(double withdraw){

            if (withdraw <= 0){
                throw new IllegalArgumentException(
                        "El retiro debe ser mayor a 0"
                );
            }
            if (withdraw > balance){
                throw  new IllegalArgumentException("No puedes retirar mas dinero que el que tienes en cuenta");
            }

        balance -= withdraw;
        System.out.println("Retiro exitoso");


    }
    public double getBalance() {
        return balance;

    }


}

/*
 if (deposito < 0){
        throw  new IllegalArgumentException("El monto a depositar debe de ser mayor a 0");
        }else {
balance = deposito + balance;
            System.out.println("Deposito realizado con exito!");
        }
                }

public double getBalance() {
    return balance;
}*/