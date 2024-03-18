package br.com.techleap.mentoria.solid;

public class ExemploFormaGeometrica {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.altura = 10;
        retangulo.largura = 5;

        Circulo circulo = new Circulo();
        circulo.raio = 3;

        Quadrado quadrado = new Quadrado();
        quadrado.altura = 50;
        quadrado.largura = 50;


        Object[] formas = {retangulo, circulo, quadrado};

        CalculadoraArea calculadora = new CalculadoraArea();
        double areaTotal = calculadora.calcularAreaTotal(formas);

        System.out.println("Área total: " + areaTotal);
    }
    static class Retangulo {
        public double altura;
        public double largura;

        public double calcularArea() {
            return altura * largura;
        }
    }

    static class Quadrado {
        public double altura;
        public double largura;

        public double calcularArea() { return altura * largura; }
    }

    static class Circulo {
        public double raio;

        public double calcularArea() {
            return Math.PI * raio * raio;
        }
    }
    static class CalculadoraArea {
        public double calcularAreaTotal(Object[] formas) {
            double areaTotal = 0;
            for (Object forma : formas) {
                if (forma instanceof Retangulo) {
                    Retangulo retangulo = (Retangulo) forma;
                    areaTotal += retangulo.calcularArea();
                } else if (forma instanceof Circulo) {
                    Circulo circulo = (Circulo) forma;
                    areaTotal += circulo.calcularArea();
                }else if (forma instanceof Quadrado) {
                    Quadrado qua = (Quadrado) forma;
                    areaTotal += qua.calcularArea();
                }
            }
            return areaTotal;
        }
    }
}
