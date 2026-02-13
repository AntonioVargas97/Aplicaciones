package com.mycompany.act_1;
import java.util.Scanner;

//Por Ángel Antonio Vargas Vaughan.
//Programación para aplicaciones de escritorio.

public class Act_1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de candidatos: ");
        int numCandidatos = sc.nextInt();

        int[] votos = new int[numCandidatos + 1];
        int totalVotos = 0;
        int numero;

        System.out.println("Ingrese el numero del candidato.");
        System.out.println("Ingrese 0 cuando ya no haya mas votos.");

        while (true) {

            numero = sc.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero >= 1 && numero <= numCandidatos) {
                votos[numero]++;
                totalVotos++;
            } else {
                System.out.println("Numero de candidato invalido.");
            }
        }

        if (totalVotos > 0) {

            System.out.println("\nResultados finales:");

            for (int i = 1; i <= numCandidatos; i++) {
                double porcentaje = (votos[i] * 100.0) / totalVotos;
                System.out.printf("Votos del candidato %d: %.2f%% (%d votos)%n",
                        i, porcentaje, votos[i]);
            }

        } else {
            System.out.println("No se registraron votos.");
        }

  
    }
    
}
