package Exercicio;

public class ExMetodo {
    public static void main(String[] args) {
        double alturaRetangulo = 14.5;
        double baseRetangulo = 8.3;
        double raioCirculo = 4;

        double areaRetangulo = calculaAreaRetangulo(baseRetangulo, alturaRetangulo);
        double areaCirculo = calculaAreaCirculo(raioCirculo);

        System.out.printf("A área do retângulo é: %.2f, A área do círculo é: %.2f%n", areaRetangulo, areaCirculo);
    }

    public static Double calculaAreaRetangulo(double base, double altura) {
        return base * altura;
    }

    public static Double calculaAreaCirculo(double raio) {
        return raio * raio * Math.PI;
    }
}