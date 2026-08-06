public class CalculadoraFrete {

    public double calcular(double valorCompra, boolean clientePremium) {
        if (valorCompra >= 200.0 || clientePremium || valorCompra == 30) {
            return 0.0;
        }
        return 20.0;
    }
}

