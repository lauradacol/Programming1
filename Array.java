import java.util.Scanner;

class Array{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		int[] meuArray; 
		
		int tamanho_array = entrada.nextInt();
		
		meuArray = new int[tamanho_array];

		for(int i = 0; i< tamanho_array; i = i+1){
			meuArray[i] = entrada.nextInt();

		}
	
		int maior_valor = meuArray[0];
		int menor_valor = meuArray[0];
		int soma = meuArray[0];
		
		
		for(int j=1; j<tamanho_array; j=j+1){
			soma = soma + meuArray[j];
			
			if(maior_valor < meuArray[j]){
				maior_valor = meuArray[j];
				}
			
			if(menor_valor > meuArray[j]){
				menor_valor = meuArray[j];				
				}
			
		}
		
		for(int l=0; l<tamanho_array; l=l+1){
			if (meuArray[l]==maior_valor){
				System.out.println(meuArray[l] + " => maior valor");
				}
			else if (meuArray[l]==menor_valor){
				System.out.println(meuArray[l] + " => menor valor");
				}
			else{
				System.out.println(meuArray[l]);
				}
			
			}
		
		System.out.println("Soma dos valores: " + soma);
				

		}
	
	}
