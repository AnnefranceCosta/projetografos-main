package grafos.maven;

import java.util.Scanner;

public class NovoGrafo {

	
	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		
			
		
		System.out.println("========== Menu ==========");
		System.out.println();
		System.out.println("01 - Criar Grafo Manual");
		System.out.println("02 - Ordem do Grafo");
		System.out.println("03 - Grau do Grafo");
		int menu = input.nextInt();
		
		
		if(menu == 1) {
			System.out.println("O Grafo é Orientado?");
			String direcional = input.next();
			
			if(direcional.equalsIgnoreCase("sim")) {
				
					
					System.out.println("Informe a letra do vértice!");
					String valorVertice = input.next();
					
					Grafo<String>grafo = new Grafo<String>();
					grafo.adicionarVertice(valorVertice);
					
					
					System.out.println("Deseja acrescentar novo Vértice?");
					System.out.println("[S]Sim ou [N]Não");
					
					
					
				
				

			} else if(direcional.equalsIgnoreCase("não")) {
				System.out.println("Vamos criar um grafo Não Orientado!");
			} else {
				System.out.println("Comando Inválido");
			}
		}
		
		
		
		
		
	}

}
