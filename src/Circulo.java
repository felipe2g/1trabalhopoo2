public class Circulo {
    public Double raio;

    public Circulo(int raio) {
        this.raio = Double.valueOf(raio);
    }

    public Double calculaArea() {
        return 3.1415 * Math.pow(raio, 2);
    }

    public Double calculaCircunferencia() {
        return 2 * 3.1415 * raio;
    }

    @Override
    public String toString() {
        return "Area => " + calculaArea() + " Circunferência => " + calculaCircunferencia();
    }
}
