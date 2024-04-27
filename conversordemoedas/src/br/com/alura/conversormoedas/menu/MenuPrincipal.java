package br.com.alura.conversormoedas.menu;

import br.com.alura.conversormoedas.menu.consultasapi.ConsultaMoeda;
import br.com.alura.conversormoedas.menu.moedas.ConversorMoedas;

import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        int opcao = 0;

        Scanner scanner = new Scanner(System.in);
        ConversorMoedas conversor = new ConversorMoedas();
        ConsultaMoeda consulta = new ConsultaMoeda();


        try{
            while(opcao != 7){
                String menu =
                        """
                                    ***********************************************************************
                                                 Seja bem vindo(a) ao conversor de moedas em tempo real!
                                                               
                                                        1) Dólar =>> Peso argentino
                                                        2) Peso argentino =>> Dólar
                                                        3) Dólar =>> Real brasileiro
                                                        4) Real brasileiro =>> Dólar
                                                        5) Dólar =>> Boliviano boliviano
                                                        6) Boliviano boliviano =>> Dólar
                                                        7) Sair
                                                        
                                    ***********************************************************************
                            """;
                System.out.println(menu);
                opcao = scanner.nextInt();
                if (opcao < 1 || opcao > 7){
                    System.out.println("Digite uma opção válida.\n");
                } else if (opcao != 7 ) {
                    System.out.println("Digite o valor que deseja converter: ");
                    int ValorDigitado = scanner.nextInt();


                    switch (opcao) {
                        case 1:
                            double valorDeApiUSD = consulta.buscaMoeda("USD").conversion_rates().ARS();
                            conversor.obterValorConvertido(valorDeApiUSD, ValorDigitado, "USD", "ARS");
                            break;

                        case 2:
                            double valorDeApiARS = consulta.buscaMoeda("ARS").conversion_rates().USD();
                            conversor.obterValorConvertido(valorDeApiARS, ValorDigitado, "ARS", "USD");
                            break;
                        case 3:
                            double valorDApiUSD = consulta.buscaMoeda("USD").conversion_rates().BRL();
                            conversor.obterValorConvertido(valorDApiUSD, ValorDigitado, "USD", "BRL");
                            break;
                        case 4:
                            double valorDeApiBRL = consulta.buscaMoeda("BRL").conversion_rates().USD();
                            conversor.obterValorConvertido(valorDeApiBRL, ValorDigitado, "BRL", "USD");
                            break;
                        case 5:
                            double valorDepiUSD = consulta.buscaMoeda("USD").conversion_rates().BOB();
                            conversor.obterValorConvertido(valorDepiUSD, ValorDigitado, "USD", "BOB");
                            break;
                        case 6:
                            double valorDeApiBOB = consulta.buscaMoeda("BOB").conversion_rates().USD();
                            conversor.obterValorConvertido(valorDeApiBOB, ValorDigitado, "BOB", "USD");
                            break;
                    }
                }
            }
        } catch ( NumberFormatException e ){
            System.out.println("Erro: Digite um valor válido. ");
        } catch (RuntimeException e) {
            System.out.println("Erro inesperado: " +e.getMessage());
            System.out.println("Finalizando a aplicação.");
        }
    }
}
