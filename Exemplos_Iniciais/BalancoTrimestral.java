class BalancoTrimestral{
	public static void main(String[] args){
		int gastosJaneiro = 15000, gastosFevereiro = 23000, gastosMarco = 17000;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		int mediaMensal = gastosTrimestre/3;
		boolean gastoControlado = mediaMensal<15000;
		
		System.out.println(gastosTrimestre);
		System.out.println("Média mensal: " + mediaMensal);
		System.out.println((gastoControlado)?"SIM!":"NÃO!");
		}
	
	}
