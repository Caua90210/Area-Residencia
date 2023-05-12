package br.senai.sp.jandira;

import java.util.Scanner;

public class Comodos {
		
	    public static void main(String[] args) {
	    	
	    	    Scanner teclado = new Scanner(System.in);
	    	    String continuar = "S";
	    	    double areaTotal = 0.0;

	    	    for (int i = 0; i < 10; i++) {
	    	        System.out.println("=====================================");
	    	        System.out.println("                CÔMODO               ");
	    	        System.out.println("=====================================");
	    	        System.out.println("       Digite o nome do cômodo:");
	    	        String nome = teclado.nextLine();
	    	        System.out.println("=====================================");
	    	        System.out.println("                Largura              ");
	    	        System.out.println("=====================================");
	    	        System.out.println("Digite a largura do cômodo em metros:");
	    	        double largura = teclado.nextDouble();
	    	        System.out.println("=====================================");
	    	        System.out.println("              Comprimento            ");
	    	        System.out.println("=====================================");
	    	        System.out.println("Digite o comprimento do cômodo em metros:");
	    	        double comprimento = teclado.nextDouble();

	    	        double area = largura * comprimento;
	    	        System.out.printf("A área do cômodo %s é: %.2f metros quadrados\n", nome, area);
	    	        areaTotal += area;

	    	        System.out.println("Deseja continuar calculando novos cômodos? (S/N)");
	    	        teclado.nextLine(); 
	    	        continuar = teclado.nextLine().trim().toUpperCase();
	    	        if (!continuar.equals("S")) {
	    	            break;
	    	        }
	    	    }

	    	    System.out.printf("A área total da residência é: %.2f metros quadrados\n", areaTotal);
	    	}


	    }
	



