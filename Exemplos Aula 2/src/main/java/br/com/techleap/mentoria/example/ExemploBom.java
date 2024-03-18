package br.com.techleap.mentoria.example;

public class ExemploBom {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10,5);
        Circulo circulo = new Circulo(3);

        FormaGeometrica[] formaGeometricas = {retangulo,circulo};
        double areaTotal = CalculadoraArea.calcularAreaTotal(formaGeometricas);
        System.out.println("Área total: " + areaTotal);
    }
    interface FormaGeometrica {
        double calculaArea();
    }
    static class Retangulo implements FormaGeometrica {
        double altura;
        double largura;

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
        double raio;
        public  Circulo(double raio){
            this.raio = raio;
        }
        @Override
        public double calculaArea() {
            return Math.PI * raio * raio;
        }
    }
    static class CalculadoraArea {
        public static double calcularAreaTotal(FormaGeometrica[] formaGeometricas) {
            double areaTotal = 0;
            for (FormaGeometrica forma : formaGeometricas) {
                areaTotal += forma.calculaArea();
            }
            return areaTotal;
        }
    }
}
