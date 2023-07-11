package restaurante.atendimento.cozinha;

import java.util.Random;

public class Cozinheiro {
	public void receberPedido(int pedido) {
		
		System.out.println("\nCozinheiro recebe pedido na cozinha");
		
		verificarIngredientes();
		
		switch(pedido) {
			case 1:
				prepararPrato();
				adicionarPrato();
			break;
			
			case 2:
				prepararSuco();
				adicionarSuco();
			break;
			
			case 3:
				prepararCombo();
				adicionarCombo();
			break;			
		}
		verificarGas();
	}
	
	private void verificarIngredientes() {
		System.out.println("\nCozinheiro verifica se faltam ingredientes");
		boolean faltaIngrediente = new Random().nextInt(3)==1;
		
		if (faltaIngrediente) {
			pedirIngredientes();
		}
	}
	
	private void pedirIngredientes() {
		System.out.println("\nCozinheiro pede ingredientes");
		Almoxarife almoxarife = new Almoxarife();
		almoxarife.entregarIngredientes();
	}
	
	private void verificarGas() {
		System.out.println("\nCozinheiro verifica se falta gás");
		boolean faltaGas = new Random().nextInt(3)==1;
		
		if (faltaGas) {
			pedirGas();
		}
	}
	
	private void pedirGas() {
		System.out.println("\nCozinheiro pede troca de gás");
		Almoxarife almoxarife = new Almoxarife();
		almoxarife.trocarGas();
	}
	
	private void adicionarPrato() {
		System.out.println("\nCozinheiro adiciona prato no balcão");
	}
	
	private void adicionarSuco() {
		System.out.println("\nCozinheiro adiciona suco no balcão");
	}
	
	private void adicionarCombo() {
		adicionarPrato();
		adicionarSuco();
	}
	
	private void prepararPrato() {
		selecionarIngredientesPrato();
		System.out.println("\nCozinheiro prepara prato");
	}
	
	private void prepararSuco() {
		selecionarIngredientesSuco();
		System.out.println("\nCozinheiro prepara suco");
	}
	
	private void prepararCombo() {
		prepararPrato();
		prepararSuco();
	}
	
	private void selecionarIngredientesPrato() {
		System.out.println("\nCozinheiro seleciona ingredentes do prato");
	}
	
	private void selecionarIngredientesSuco() {
		System.out.println("\nCozinheiro seleciona ingredentes do suco");
	}
}
