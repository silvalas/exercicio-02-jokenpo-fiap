package principal;

public class AppJokenPo {

	public static void main(String[] args) {
		
		String finalJogo; 
		String repeteco = "S";
				 
		InicioJogo iniJogo = new InicioJogo();
		
		finalJogo = iniJogo.parte01();

		while (finalJogo.equalsIgnoreCase("S") == repeteco.equalsIgnoreCase("S"))  {
			
			repeteco = iniJogo.parte01();
		
		} // final do while
		
		System.out.println("       F I M   D E   J O G O!!!");
		System.out.println("**************************************");
			
	} // final do método main
	
} // final da classe AppJokenPo
