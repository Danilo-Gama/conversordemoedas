package br.com.alura.conversormoedas.menu.moedas;

public class ConversorMoedas {
    public void obterValorConvertido(double valorDeApi, double inserirValor, String moedaDeApi, String moedaAtual) {
        double resultado = (valorDeApi * inserirValor);
        double resultadoRedondado = Math.round(resultado * 10000.0) / 10000.0;

        System.out.println("O valor " + inserirValor + " [" + moedaDeApi + "] corresponde ao valor final de ->> " + resultadoRedondado + " [" + moedaAtual + "] ");

    }
}

