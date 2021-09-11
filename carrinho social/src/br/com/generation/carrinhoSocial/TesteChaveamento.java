package br.com.generation.carrinhoSocial;

import java.util.Scanner;

public class TesteChaveamento {

	public static void main(String[] args) 
	{
	Scanner leia=new Scanner(System.in);
	String alimentos[]= {"arroz", "feijao", "macarrao", "oleo", "cafe"};
	int quantidadeAlimentos[]=new int[5];
	
	String higiene[]= {"papelHigienico", "sabonete", "shampoo", "acoolGel", "mascara"};
	int quantidadeHigiene[]=new int[5];
	
	String textil[]= {"camiseta", "blusa", "calca", "shorts", "outros"};
	int quantidadeTextil[]=new int[5];
	
	int voluntario, produto, doacaoA=0, doacaoH=0, doacaoT=0, contA=0, contH=0, contT=0;
	int quantidadeA, quantidadeH, quantidadeT;
	
	
		System.out.println("Hoje você é:\n1-fornecedor\n2-consumidor");
		voluntario=leia.nextInt();
		
			if (voluntario==1)
			{
				System.out.println("Digite que tipo de produto você deseja doar:\n1- Alimentos\n2-Higiêne\n3-Têxtil");
				produto=leia.nextInt();
					
				if (produto==1)
				{
					System.out.println("Digite \n1- Para doar arroz\n"
											+ "2- Para doar feijão\n"
											+ "3- Para doar macarrao\n"
											+ "4- Para doar oleo\n"
											+ "5-Para doar cafe\n");
					doacaoA=leia.nextInt();
					System.out.println("Qual a quantidade de produtos?");
					quantidadeA=leia.nextInt();
					for (int x=0; x<5; x++)
					{
						if ((doacaoA-1)==x)
						{
							contA+=quantidadeA;
							quantidadeAlimentos[x]+=contA;
						}
						System.out.println(alimentos[x]);
						System.out.println(quantidadeAlimentos[x]);
					}
				}
					
				if (produto==2)
				{
					System.out.println("Digite \n1- Para doar papel higiênico\n"
											+ "2- Para doar sabonete\n"
											+ "3- Para doar shampoo\n"
											+ "4- Para doar alcool em gel\n"
											+ "5-Para doar máscara\n");
					doacaoH=leia.nextInt();
					System.out.println("Qual a quantidade de produtos?");
					quantidadeH=leia.nextInt();
					for (int y=0; y<5; y++)
					{
						if ((doacaoH-1)==y)
						{
							contH+=quantidadeH;
							quantidadeHigiene[y]+=contH;
						}
						System.out.println(higiene[y]);
						System.out.println(quantidadeHigiene[y]);
					}
				}
					
				if (produto==3)
				{
					System.out.println("Digite \n1- Para doar camiseta\n"
											+ "2- Para doar blusa\n"
											+ "3- Para doar calça\n"
											+ "4- Para doar shorts\n"
											+ "5-Para doar outros\n");
					doacaoT=leia.nextInt();
					System.out.println("Qual a quantidade de produtos?");
					quantidadeT=leia.nextInt();
					for (int z=0; z<5; z++)
					{
						if ((doacaoT-1)==z)
						{
							contT+=quantidadeT;
							quantidadeTextil[z]+=contT;
						}
						System.out.println(textil[z]);
						System.out.println(quantidadeTextil[z]);
					}
				}
			}
		}
	}