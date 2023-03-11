public class Retangulo {
    private int base;
    private int altura;

    public int area() {
        return base * altura;
    }

    public int perimetro() {
        return (2 * base) + (2*altura);
    }

    public String esteTrianguloEQuadrado() {
        return (base == altura) ? "SIM" : "NÃO";
    }

    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
}
