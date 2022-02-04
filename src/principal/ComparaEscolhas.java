package principal;

public class ComparaEscolhas {

	// Informa quem venceu ou se teve empate
	public String compEscolhas(int opcaoUsuario, int opcaoComputador) {

		String vencedor;
		
		System.out.println("");
		
		// Decide quem vence entre usuário e computador
		if ((opcaoUsuario == opcaoComputador)) {
			System.out.println("HOUVE EMPATE!");
			vencedor = "Empate";
		} else 
			if (((opcaoUsuario == 1) && (opcaoComputador == 2)) || 
			    ((opcaoUsuario == 2) && (opcaoComputador == 3)) || 
			    ((opcaoUsuario == 3) && (opcaoComputador == 1))) {
				System.out.println("COMPUTADOR GANHOU!");
				vencedor = "Computador";
			} else {
				System.out.println("VOCÊ GANHOU!");
				vencedor = "Você";
			} // final do if
		
		System.out.println("");
		
		return vencedor;
		
	} // final do método compEscolhas
	
} // final da classe ComparaEscolhas