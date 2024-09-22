package edu.proz.btt;
import java.util.Scanner;
public class AtividadeDois {
    public static void main(String[] args){
        System.out.println("Digite seu nome: ");
        Scanner ler = new Scanner(System.in);
        String nome = ler.nextLine();
        nome = nome.toUpperCase();
        System.out.println("Seu nome é: " + nome);
    }
}