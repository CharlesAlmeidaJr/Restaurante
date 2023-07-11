package restaurante.area.cliente;

public class Cliente {
	private void escolherPrato() {
		System.out.println("\nCliente escolhe prato");
	}
	
	public void fazerPedido(int pedido) {
		escolherPrato();
		System.out.println("\nCliente pede " + (pedido == 1?"prato":pedido == 2?"suco":"combo"));
	}
	
	public void pedirConta() {
		System.out.println("\nCliente pede conta");
	}
	
	private void consultarSaldo() {
		System.out.println("\nCliente consulta saldo");
	}
	
	public void pagar() {
		consultarSaldo();
		System.out.println("\nCliente paga");
	}
}
