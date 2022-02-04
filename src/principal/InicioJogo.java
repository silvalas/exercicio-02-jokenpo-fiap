package principal;

import java.util.Scanner;

public class InicioJogo {
	
	Scanner leitor = new Scanner(System.in);
	
	String outroJogo = "N";
	public int contador = 0, contPartida, qtdePartidas = 0;
	int qtdeEmpate = 0, qtdeVoce = 0, qtdeComputador = 0;

	// Imprime a primeira parte do programa	
	public String parte01() {

		System.out.println("------------------------------");
		System.out.println("      J O K E N P O");
		System.out.println("------------------------------");
		System.out.print("INFORME A QTDE DE PARTIDAS: ");
				
		qtdePartidas = leitor.nextInt();
		contPartida = 1;
				
		System.out.println("------------------------------");
		System.out.println("ESCOLHA UMA DAS OP��ES ABAIXO:");
		System.out.println("1 - PEDRA");
		System.out.println("2 - PAPEL");
		System.out.println("3 - TESOURA");
	
		outroJogo = parte02(qtdePartidas, contador, qtdeEmpate, qtdeComputador, qtdeVoce);
		
		return outroJogo;
	}
	
	// Imprime a segunda parte do programa
	public String parte02(int qtdePartidas, int contador, int qtdeEmpate, int qtdeComputador, int qtdeVoce) {
		
		// Verifica a qtde de partidas que ser� processada
		while (qtdePartidas > contador) {
			System.out.println("------------------------------");
			System.out.println("PARTIDA " + contPartida);
			System.out.println("------------------------------");
			System.out.print("QUAL SUA OP��O? ");
			
			contador++;
			contPartida++;
			
			ValidaDados valDados = new ValidaDados();

			// Captura e valida op��o escolhida pelo usu�rio
			int capUser = valDados.capturaOpcaoUser();

			// Captura op��o escolhida pelo computador
			int capComputador = valDados.valOpcaoComputador();

			// Compara escolha de usu�rio e computador
			ComparaEscolhas comp = new ComparaEscolhas();
			
			System.out.println("------------------------------");

			// Informa quem venceu a partida
			String vencedor = comp.compEscolhas(capUser, capComputador);

			// Contabiliza a qtde de vit�rias e empates
			if (vencedor == "Empate") {
				qtdeEmpate++;
			} else
				if (vencedor == "Voc�") {
					qtdeVoce++;
				} else {
					qtdeComputador++;
			}	// final do if

			PlacarJogo placar = new PlacarJogo();

			// Informa a qtde de pontos parcial at� o momento
			placar.resultJogo(qtdeEmpate, qtdeComputador, qtdeVoce);

		} // final do while
		
		// Informa o resultado da partida
		if (qtdeVoce == qtdeComputador) {
			System.out.println("HOUVE EMPATE");
		} else 
			if (qtdeVoce > qtdeComputador) {
				System.out.println("VOC� VENCEU O JOGO POR " + qtdeVoce + " X " + qtdeComputador);
			} else {
				System.out.println("COMPUTADOR VENCEU O JOGO POR " + qtdeComputador + " X " + qtdeVoce);
			} // final do if

		System.out.println("------------------------------");
		System.out.println("**************************************");

		// Verifica se ter� partida de desempate ou termina o jogo
		
		String outroJogo02;
		
		if (qtdeVoce == qtdeComputador) {
			System.out.println(" P A R T I D A  DE  D E S E M P A T E");
			System.out.println("**************************************");
			qtdePartidas++;
			outroJogo02 = parte03(qtdePartidas, contador, qtdeEmpate, qtdeComputador, qtdeVoce);
		} else {
			System.out.print  ("J O G A R   N O V A M E N T E (S/N)? ");
			outroJogo02 = leitor.next();
		}	// final do if
		
		System.out.println("**************************************");
		
		return outroJogo02;

	} // final do m�todo parte02
	
	
	// Processa partida de desempate, chamando segunda parte do programa	
	public String parte03(int qtdePartidas, int contador, int qtdeEmpate, int qtdeComputador, int qtdeVoce) {

		String outroJogo03 = parte02(qtdePartidas, contador, qtdeEmpate, qtdeComputador, qtdeVoce);
		
		return outroJogo03;
	}	// final do m�todo parte03
	
	
	//#### Ponto onde est� o problema no fechamento do Scanner ####
	//leitor.close();
	//#### Ponto onde est� o problema no fechamento do Scanner ####
	
}	// final da classe InicioJogo
