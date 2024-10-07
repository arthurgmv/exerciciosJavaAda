package Terceiro_Exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        OperacaoMatematica soma = (a, b) -> a + b;
        OperacaoMatematica subtracao = (a, b) -> a - b;
        OperacaoMatematica multiplicacao = (a, b) -> a * b;
        OperacaoMatematica divisao = (a, b) -> {
            if (b == 0) {
                System.out.println("Divisão por zero não é permitida!");
                return 0.0;
            }
            return a / b;
        };


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();


        System.out.println("Resultados:");
        System.out.printf("Soma: %.2f\n", soma.calcular(num1, num2));
        System.out.printf("Subtração: %.2f\n", subtracao.calcular(num1, num2));
        System.out.printf("Multiplicação: %.2f\n", multiplicacao.calcular(num1, num2));
        System.out.printf("Divisão: %.2f\n", divisao.calcular(num1, num2));
    }
}


@FunctionalInterface
interface OperacaoMatematica {
    double calcular(double a, double b);
}
