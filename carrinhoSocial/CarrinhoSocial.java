package br.com.generation.carrinhoSocial;

import java.util.Scanner;

public class CarrinhoSocial {

	public static void main(String[] args) {
		
		//Criando Objeto Categoria
		Categoria objAlimentacao = new Categoria ("Alimentação");
		Categoria objHigiene = new Categoria ("Higiene");
		
		ListagemCategoria objListaCategoria = new ListagemCategoria();
		
		objListaCategoria.incluirCategoriaNaLista(objAlimentacao);
		objListaCategoria.incluirCategoriaNaLista(objHigiene);
		
		//Criando Objeto Produto
		Produto objArroz = new Produto ("Arroz", objAlimentacao);
		Produto objFeijao = new Produto ("Feijão", objAlimentacao);
		Produto objOleo = new Produto ("Óleo", objAlimentacao);
		Produto objCafe = new Produto ("Café", objAlimentacao);
		Produto objMacarrao = new Produto ("Macarrão", objAlimentacao);
		
		ListagemProdutos objListaProdutoAlimentacao = new ListagemProdutos();
		
		objListaProdutoAlimentacao.incluirProdutoNaLista(objArroz);
		objListaProdutoAlimentacao.incluirProdutoNaLista(objFeijao);
		objListaProdutoAlimentacao.incluirProdutoNaLista(objOleo);
		objListaProdutoAlimentacao.incluirProdutoNaLista(objCafe);
		objListaProdutoAlimentacao.incluirProdutoNaLista(objMacarrao);
		
		Produto objPapelHigienico = new Produto ("Pepel Higiênico", objHigiene);
		Produto objAlcoolGel = new Produto ("Álcool em gel", objHigiene);
		Produto objMascara = new Produto ("Máscara", objHigiene);
		Produto objSabonete = new Produto ("Sabonete", objHigiene);
		Produto objAbsorvente = new Produto ("Absorvente", objHigiene);
		
		ListagemProdutos objListaProdutoHigiene = new ListagemProdutos();
		
		objListaProdutoHigiene.incluirProdutoNaLista(objPapelHigienico);
		objListaProdutoHigiene.incluirProdutoNaLista(objAlcoolGel);
		objListaProdutoHigiene.incluirProdutoNaLista(objMascara);
		objListaProdutoHigiene.incluirProdutoNaLista(objSabonete);
		objListaProdutoHigiene.incluirProdutoNaLista(objAbsorvente);
		
		Scanner in = new Scanner(System.in);
		
		int opcaoMenuPrincipal=100;
		int opcaoMenuCategoria=100;
		int indice=0;
		int quantidade=0;
		
		do {
			
			System.out.println("Hoje você deseja doar ou receber uma doação?\n");
			System.out.println("Digite 1- para doar ou 2- para receber ou 0- para sair.");
			opcaoMenuPrincipal=in.nextInt();
			
		switch (opcaoMenuPrincipal) {
			
			case 1: {
				objListaCategoria.exibirItensDaListaCategoria();
				System.out.println("Digite a categoria que deseja: ");
				opcaoMenuCategoria=in.nextInt();
				if (opcaoMenuCategoria == 1) {
					opcaoAdicionar(opcaoMenuCategoria, objListaProdutoAlimentacao, in, indice, quantidade);
				}
				else {
					opcaoAdicionar(opcaoMenuCategoria, objListaProdutoHigiene, in, indice, quantidade);
				}
				break;
			}
			
			case 2: {
				objListaCategoria.exibirItensDaListaCategoria();
				System.out.println("Digite a categoria que deseja: ");
				opcaoMenuCategoria=in.nextInt();
				if (opcaoMenuCategoria == 1) {
					opcaoSubtrair(opcaoMenuCategoria, objListaProdutoAlimentacao, in, indice, quantidade);
				}
				else {
					opcaoSubtrair(opcaoMenuCategoria, objListaProdutoHigiene, in, indice, quantidade);
				}
				break;
			}
			
			default:
				if(opcaoMenuPrincipal!=0 && opcaoMenuPrincipal!=1 && opcaoMenuPrincipal!=2) {
					System.out.println("Opção inválida, favor digitar novamente." + opcaoMenuPrincipal);
			}
		
		}
			
			
		}
		while (opcaoMenuPrincipal!=0);

	}
	
	public static void opcaoAdicionar (int opcaoMenuCategoria, ListagemProdutos listaProdutos, Scanner in, int indice, int quantidade) {
		switch (opcaoMenuCategoria) {
			case 1: {
				listaProdutos.exibirItensDaListaProduto();
				System.out.println("Qual produto deseja?\n");
				indice=in.nextInt();
				System.out.println("Informe a quantidade de produtos\n");
				quantidade=in.nextInt();
				listaProdutos.adicionarQuantidadeAoProduto(indice-1, quantidade);
				break;
			}
			
			case 2: {
				listaProdutos.exibirItensDaListaProduto();
				System.out.println("Qual produto deseja?\n");
				indice=in.nextInt();
				System.out.println("Informe a quantidade de produtos\n");
				quantidade=in.nextInt();
				listaProdutos.adicionarQuantidadeAoProduto(indice-1, quantidade);
				break;
			}
			
		}
		
			
	}
	
	public static void opcaoSubtrair (int opcaoMenuCategoria, ListagemProdutos listaProdutos, Scanner in, int indice, int quantidade) {
		switch (opcaoMenuCategoria) {
			case 1: {
				listaProdutos.exibirItensDaListaProduto();
				System.out.println("Qual produto deseja?\n");
				indice=in.nextInt();
				System.out.println("Informe a quantidade de produtos\n");
				quantidade=in.nextInt();
				listaProdutos.subtrairQuantidadeAoProduto(indice-1, quantidade);
				break;
			}
			
			case 2: {
				listaProdutos.exibirItensDaListaProduto();
				System.out.println("Qual produto deseja?\n");
				indice=in.nextInt();
				System.out.println("Informe a quantidade de produtos\n");
				quantidade=in.nextInt();
				listaProdutos.subtrairQuantidadeAoProduto(indice-1, quantidade);
				break;
			}
			
		}
		
			
	}
	
	
	
}
