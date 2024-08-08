package org.example;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = ler.next();
        System.out.print("Digite sua agencia: ");
        String agencia = ler.next();
        System.out.print("Digite seu número (conta): ");
        int conta = ler.nextInt();
        System.out.print("Digite seu saldo: ");
        double saldo = ler.nextDouble();

        String mensagem = "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta " + conta + ", e seu saldo: " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);

    }
}