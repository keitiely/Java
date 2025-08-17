
package com.mycompany.primeiroprograma;

import java.util.Scanner;



public class PrimeiroPrograma {

    public static void main(String[] args) {
        
//        Exercicio 1 somar 4 numeros
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("__Exercicio 1 - Somar 4 numeros__");
        
        int soma = 0; 
        
        for(int i=1; i <=4; i++){
        System.out.printf("Digite o numero %d: ", i);
        int numero = teclado.nextInt();
        soma = soma + numero;
        
        }
        
        System.out.printf("A soma dos 4 numeros é: %d%n", soma);
        
        
//       Exercicio 2 media aritmetica das 3 notas
        System.out.println("\n__Exercicio 2 - Media Aritmetica__");
        
        float somarMedia = 0f;
        
        for(int i=1; i <= 3; i++){
            System.out.printf("Digite a nota %d: ", i);
            float nota = teclado.nextFloat();
            somarMedia =  somarMedia + nota;
        }
        float media = somarMedia/3;
        System.out.printf("A Media Aritmetica das 3 notas e: %.2f%n", media);
        
        
//        Exercicio 3 calcular media ponderada
        System.out.println("\n__Exercicio 3 - Media Ponderada__");
        
        double mediaP = 0;
        double somarPesos = 0;
        
        for(int i=1; i <= 3; i++){
            System.out.printf("Digite a nota %d: ", i);
            double nota = teclado.nextDouble();
            
            System.out.printf("Digite o peso %d: ", i);
            double peso = teclado.nextDouble();

            somarPesos = somarPesos + peso;
            mediaP = mediaP + (nota * peso);
        }
        mediaP = mediaP/somarPesos;
        System.out.printf("A Media Ponderada das 3 notas e: %.2f%n", mediaP);


//        Exercicio 4 calcular aumento salario 25% 
        System.out.println("\n__Exercicio 4 - Salario 25%__");
        
        System.out.printf("Digite o valor do salario: ");
        double salario = teclado.nextDouble();
        
        double novoSalario = (salario * 0.25) + salario;
        
        System.out.printf("Com aumento de 25%% seu salario passa a ser: %.2f%n", novoSalario);
        
        
//        Exercicio 5 Calcular aumento de acordo com a porcentagem
        System.out.println("\n__Exercicio 5 - Calcular Aumento__");
        System.out.printf("Digite o valor do salario: ");
        double salarioA = teclado.nextDouble();
        
        System.out.printf("Digite o valor do Percentual de aumento %%: ");
        double percentual = teclado.nextDouble();
        double decimal = percentual/100;  //converte
        
        double salarioB = salarioA * decimal;
        System.out.printf("Aumento: %.2f%n", salarioB);
        
        double novoSalarioP = salarioA + salarioB;
        System.out.printf("Novo salario: %.2f%n", novoSalarioP);
        

//        Exercicio 6 salario base com gratificacao de 5% e imposto de 7%
        System.out.println("\n__Exercicio 6 - Salario a receber__");
        
        System.out.printf("Digite o valor do salario: ");
        double salarioBase = teclado.nextDouble();
        
        double gratificacao = salarioBase * 0.05; 
        double salarioGratificado = salarioBase + gratificacao;
        
        double imposto = salarioGratificado * 0.07;
        double salarioAtual = salarioGratificado - imposto;
        
        System.out.printf("Gratificacao de 5%% no salario base: %.2f%n", gratificacao);
        System.out.printf("Imposto de 7%% no Salario gratificado: %.2f%n", imposto);
        System.out.printf("Salario a receber com gratificacao de 5%% e desconto do imposto de 7%% no salario gratificado: %.2f", salarioAtual);
        
        teclado.close();
    }   
   
}
