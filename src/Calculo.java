public class Calculo {
    private int saldo = 0;

    public Calculo(int saldo) {
        this.saldo = saldo;
    }

    public void credito(int valor) {
        this.saldo += saldo;
    }
    
    public void debito(int valor) {
        this.saldo -= saldo;
    }
    
    public int getSaldo() {
        return this.saldo;
    }
    
}
