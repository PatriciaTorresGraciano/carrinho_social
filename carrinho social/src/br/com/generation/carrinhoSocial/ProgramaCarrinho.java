package br.com.generation.carrinhoSocial;

import java.util.Scanner;

public class ProgramaCarrinho {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		Estoque estoque = new Estoque();
		Doador doador = new Doador();
		Beneficiario beneficiario = new Beneficiario();
		
		int totalArroz = 0, totalFeijao = 0;
		int escolha;
		int produto;
		
		do{
			
			System.out.println("Bem vindo ao carrinho social!!");
			System.out.println("Digite 1 para doador" + "\n Digite 2 para benefici�rio" + "\n Digite 0 para sair.");
			escolha = entrada.nextInt();
			
			if(escolha == 1) {
			
			System.out.println("O que deseja doar?");
			System.out.println("1-Arroz" + "\n2-Feij�o" + "\n3-Macarr�o" + "\n4-Ol�o" + "\n5-Caf�");
			produto = entrada.nextInt();
			
			if(produto == 1) {
			System.out.println("Deseja doar quantos pacotes de arroz?");
			estoque.doar(entrada.nextInt());
			estoque.setQuantArroz(estoque.getTotalProdutos());
			estoque.setTotalArroz(estoque.getQuantArroz());
			totalArroz = estoque.getTotalArroz();
			estoque.setTotalProdutos(0);
			}
			else if(produto == 2) {
				System.out.println("Deseja doar quantos pacotes de feij�o?");
				estoque.doar(entrada.nextInt());
				estoque.setQuantfeijao(estoque.getTotalProdutos());
			    estoque.setTotalFeijao(estoque.getQuantfeijao());
			    totalFeijao = estoque.getTotalFeijao();
			    estoque.setTotalProdutos(0);
			}
			else if(produto == 3) {
				System.out.println("Deseja doar quantos pacotes de macarr�o?");
				estoque.setQuantmacarrao(entrada.nextInt());
			}
			else if (produto == 4) {
				System.out.println("Deseja doar quantos litros de ol�o?");
				estoque.setQuantoleo(entrada.nextInt());
			}
			else if(produto == 5 ) {
				System.out.println("Deseja doar quantos pacotes de de caf�?");
				estoque.setQuantcafe(entrada.nextInt());
			}
			else {
				System.out.println("Op��o inv�lida!");
			}
			
			
				
			
			System.out.println(totalArroz);
			System.out.println(totalFeijao);
			}
			
		}while( escolha != 0); 
			System.out.println("Obrigado");
			
		

	}

}
