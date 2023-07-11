package restaurante;

import java.util.Scanner;

import restaurante.area.cliente.Cliente;
import restaurante.atendimento.Atendente;
import restaurante.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Cozinheiro cozinheiro = new Cozinheiro();
		Atendente atendente = new Atendente();
		Cliente cliente = new Cliente();
		
		System.out.println("Restaurante abre...");
		
		System.out.println("\nCliente chega no restaurante...");
		
		int pedido;
		
		do {
			System.out.println("\nPróxima ação do cliente:\n1 - Pedir prato\n2 - Pedir suco\n3 - Pedir combo\n0 - Pedir conta");
			pedido = scanner.nextInt();
			
			if(pedido >= 0 && pedido < 4) {
				if(pedido != 0) {
					cliente.fazerPedido(pedido);
		
					atendente.pegarPedidoCliente();
			
					cozinheiro.receberPedido(pedido);
					
					atendente.servirMesa();
				}
			}else {
				System.out.println("\nOpção inválida");
			}
			
		} while (pedido != 0);
		
		scanner.close();
		
		cliente.pedirConta();
		
		cliente.pagar();
		
		atendente.receberPagamento();
	}
	
}
