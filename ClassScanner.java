package com.mycompany.aula01;
import java.util.Scanner;   //Importando a Classe Scanner

/**
 *
 * @author keitiely.viana
 */
public class Aula01 {

    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in); //Cria um objeto Scanner
        System.out.println("Entre com seu nome");
        
        String nome = meuScanner.nextLine();
        System.out.println("Seu nome é: " + nome);
    }
}
        
      
