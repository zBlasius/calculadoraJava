
public class Calculadora {
    public double n1;
    public double n2;


    // Método
    public void soma(float n1, float n2) {
        System.out.println(n1 + n2);
    }

    // Método
    public void subtracao(float n1, float n2) {
        System.out.println(n1 - n2);
    }

    // Método
    public void multiplicacao(float n1, float n2) {
        System.out.println(n1 * n2);
    }

    // Método
    public void divisao(float n1, float n2) {
        System.out.println(n1 / n2);
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
}