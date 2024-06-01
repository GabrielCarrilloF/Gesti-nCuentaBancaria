import java.util.Random;
public class CuentaBancaria {
    private Random random = new Random();

    private String NumeroCunta = String.valueOf((long)(random.nextDouble()*1000000000000L));
    private double Saldo;
    private String Titular; 
    private boolean Estado;

    public String getNumeroCunta(){
        return NumeroCunta;
    }

    public String getTitular(){
        return Titular;
    }

    public double getSaldo(){
        return Saldo;
    }

    public boolean isEstado(){
        return Estado;
    } 

    public void setTitular(String Titular){
        this.Titular = Titular;
    }

    public void Deposito(double cantidad){
        if(cantidad > 0 && Estado){
            Saldo = Saldo + cantidad;
        }
    }

    public void Retiro(double cantidad){
        if(Saldo > 0 && cantidad <= Saldo && Estado){
            Saldo = Saldo - cantidad;
        }
    }

    public void setEstado(boolean Estado){
        if(this.Estado != Estado){
            this.Estado = Estado;
        }
    }
}