package principal;

import java.util.Scanner;

public class ValidaDados {

	Scanner leitorx = new Scanner(System.in);

	// Captura a op��o digitada pelo usu�rio
	public int capturaOpcaoUser() {

		int opcaoUsuario = leitorx.nextInt();

		// Valida op��o digitada pelo usu�rio
		opcaoUsuario = valOpcaoUsuario(opcaoUsuario);
		
		return opcaoUsuario;
	} // final do m�todo capturaOpcaoUser
	

	// valida a op��o digitada pelo usu�rio
	public int valOpcaoUsuario(int opcaoUsuario) {
		
		System.out.println("------------------------------");
		System.out.println(" ");
		
		// Valida op��o do usu�rio e s� aceita valores entre 1 e 3
		if ((opcaoUsuario < 1) || (opcaoUsuario > 3)) {
			String opcaoValida = "N";

			while (opcaoValida == "N") {
				if ((opcaoUsuario > 0) && (opcaoUsuario < 4)) {
					opcaoValida = "S";
				} else {
					System.out.print("OP��O " + opcaoUsuario + " INV�LIDA! " + "DIGITE ENTRE 01 E 03: ");
					opcaoUsuario = leitorx.nextInt();
				} // final do if
			} // final do while
			System.out.println(" ");
			System.out.println("------------------------------");
			
		} // final do if

		// chama m�todo que informa op��o selecionada pelo usu�rio
		infomaOpcaoSelec(opcaoUsuario);

		return opcaoUsuario;
	}	// final do m�todo valOpcaoUsuario

	
	// Informa op��o escolhida pelo usu�rio
	void infomaOpcaoSelec(int opcaoUsuario) {

		if (opcaoUsuario == 1) {
			System.out.println("VOC� ESCOLHEU PEDRA");
		} else if (opcaoUsuario == 2) {
			System.out.println("VOC� ESCOLHEU PAPEL");
		} else {
			System.out.println("VOC� ESCOLHEU TESOURA");
		} // final do if

	}	// final do m�todo infomaOpcaoSelec


	// valida a op��o escolhida pelo computador
	public int valOpcaoComputador() {

		int opcaoComputador = (int) (Math.random() * 3+1);

		// Chama m�todo que informa op��o escolhida pelo computador
		infomaOpcaoComputador(opcaoComputador);
				
		return opcaoComputador;

	}	// final do m�todo opcaoComputador


	// Informa op��o escolhida pelo computador
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

	}	// final do m�todo infomaOpcaoComputador
	
	
	//#### Ponto onde est� o problema no fechamento do Scanner ####
	//leitorx.close();
	//#### Ponto onde est� o problema no fechamento do Scanner ####
	
} // final da classe ValidaDados
