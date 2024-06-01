public class App {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setTitular("Gabriel Carrillo");
        cuenta.setEstado(true);
        cuenta.Deposito(2.999);

        System.out.println("El número de la cuenta es: " + cuenta.getNumeroCunta());
        System.out.println("El titular es: " + cuenta.getTitular());
        
        if(cuenta.isEstado()){
            System.out.println("La cuenta está activa");
        } else {
            System.out.println("La cuenta está inactiva");
        }

        System.out.println("El saldo de la cuenta es: " + cuenta.getSaldo());

        cuenta.Retiro(1.000);
        System.out.println("_______________________________________________");
        System.out.println("El saldo de la cuenta es: " + cuenta.getSaldo());
    }
}
