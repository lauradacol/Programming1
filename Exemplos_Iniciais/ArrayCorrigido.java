import java.util.Scanner;

class ArrayCorrigido{
	public static void main(String[] args){
		Scanner le = new Scanner(System.in);
		
		int[] lista;
		int i, maior = 0, menor = 0, soma=0;
		
		System.out.println("Digite o tamanho do array: ");
		i = le.nextInt(); 
		
		lista = new int[i];
		
		for(i=0; i<lista.length; i++){
			System.out.println("Digite o número para a posição " + i);
			lista[i] = le.nextInt();
			
			soma+=lista[i];
			
			if (i==0){
				menor = lista[i];
				maior = lista[i];
				}
								
			if (menor > lista[i]){
				menor = lista[i];				
				}
			if (maior < lista[i]){
				maior = lista[i];
				}
		}
		
		System.out.println("Soma dos valores: " + soma);
		System.out.println("Maior valor: " + maior);
		System.out.println("Menor valor: " + menor);

		}

	}
