package principal;

import java.util.Scanner;

public class ValidaDados {

	Scanner leitorx = new Scanner(System.in);

	// Captura a opção digitada pelo usuário
	public int capturaOpcaoUser() {

		int opcaoUsuario = leitorx.nextInt();

		// Valida opção digitada pelo usuário
		opcaoUsuario = valOpcaoUsuario(opcaoUsuario);
		
		return opcaoUsuario;
	} // final do método capturaOpcaoUser
	

	// valida a opção digitada pelo usuário
	public int valOpcaoUsuario(int opcaoUsuario) {
		
		System.out.println("------------------------------");
		System.out.println(" ");
		
		// Valida opção do usuário e só aceita valores entre 1 e 3
		if ((opcaoUsuario < 1) || (opcaoUsuario > 3)) {
			String opcaoValida = "N";

			while (opcaoValida == "N") {
				if ((opcaoUsuario > 0) && (opcaoUsuario < 4)) {
					opcaoValida = "S";
				} else {
					System.out.print("OPÇÃO " + opcaoUsuario + " INVÁLIDA! " + "DIGITE ENTRE 01 E 03: ");
					opcaoUsuario = leitorx.nextInt();
				} // final do if
			} // final do while
			System.out.println(" ");
			System.out.println("------------------------------");
			
		} // final do if

		// chama método que informa opção selecionada pelo usuário
		infomaOpcaoSelec(opcaoUsuario);

		return opcaoUsuario;
	}	// final do método valOpcaoUsuario

	
	// Informa opção escolhida pelo usuário
	void infomaOpcaoSelec(int opcaoUsuario) {

		if (opcaoUsuario == 1) {
			System.out.println("VOCÊ ESCOLHEU PEDRA");
		} else if (opcaoUsuario == 2) {
			System.out.println("VOCÊ ESCOLHEU PAPEL");
		} else {
			System.out.println("VOCÊ ESCOLHEU TESOURA");
		} // final do if

	}	// final do método infomaOpcaoSelec


	// valida a opção escolhida pelo computador
	public int valOpcaoComputador() {

		int opcaoComputador = (int) (Math.random() * 3+1);

		// Chama método que informa opção escolhida pelo computador
		infomaOpcaoComputador(opcaoComputador);
				
		return opcaoComputador;

	}	// final do método opcaoComputador


	// Informa opção escolhida pelo computador
	void infomaOpcaoComputador(int opcaoComputador) {

		if (opcaoComputador == 1) {
			System.out.println("COMPUTADOR ESCOLHEU PEDRA");
		} else 
			if (opcaoComputador == 2) {
				System.out.println("COMPUTADOR ESCOLHEU PAPEL");
			} else {
				System.out.println("COMPUTADOR ESCOLHEU TESOURA");
			} // final do if

		System.out.println(" ");

	}	// final do método infomaOpcaoComputador
	
	
	//#### Ponto onde está o problema no fechamento do Scanner ####
	//leitorx.close();
	//#### Ponto onde está o problema no fechamento do Scanner ####
	
} // final da classe ValidaDados
