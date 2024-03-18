package br.com.techleap.mentoria.solid;


import java.util.logging.Level;
import java.util.logging.Logger;

public class ExemploFormaGeometricaSolid {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10, 15);
        Circulo circulo = new Circulo(3);
        Quadrado quadrado = new Quadrado(50, 50);

        FormaGeometrica[] formas = {retangulo, circulo, quadrado};
        CalculadoraArea calculadoraArea = new CalculadoraArea();
        double areaTotal = calculadoraArea.calcularAreaTotal(formas);
        Logger logger = Logger.getLogger(ExemploFormaGeometricaSolid.class.getName());
        logger.log(Level.INFO,"Area total ", areaTotal);

    }

    interface FormaGeometrica {
        double calculaArea();
    }

    static class Quadrado extends Retangulo implements FormaGeometrica {
        public Quadrado(double altura, double largura) {
            super(altura, largura);
        }
    }

    static class Retangulo implements FormaGeometrica {
        private double altura;
        private double largura;

        public Retangulo(double altura, double largura) {
            this.altura = altura;
            this.largura = largura;
        }

        @Override
        public double calculaArea() {
            return altura * largura;
        }
    }

    static class Circulo implements FormaGeometrica {
        private double raio;

        public Circulo(double raio) {
            this.raio = raio;
        }

        @Override
        public double calculaArea() {
            return Math.PI * raio * raio;
        }
    }


    static class CalculadoraArea {
        public double calcularAreaTotal(FormaGeometrica[] formas) {
            double areaTotal = 0;
            for (FormaGeometrica forma : formas) {
                areaTotal += forma.calculaArea();
            }
            return areaTotal;
        }
    }
}
