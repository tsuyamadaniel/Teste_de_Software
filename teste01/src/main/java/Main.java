public class Main {
    public static void main(String[] args) {

        CalculadoraFrete c =new CalculadoraFrete();

        System.out.println(c.calcular(0, false));
        System.out.println(c.calcular(200, false));
        System.out.println(c.calcular(200, true));
        System.out.println(c.calcular(100, true));

    }
}
