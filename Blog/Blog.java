import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Blog{
	
	ArrayList<Post> posts;
	
	public Blog(){
		posts = new ArrayList<Post>();		
		}
	
	public void readData(Post p){
		this.posts.add(p);
		}
	
	public void showAll(){
		int indice = 0;
		for(Post i : posts){
			i.show();
			System.out.println("Código do Post: " + indice + "\n");
			indice++;			
			}
		}
	
	public static void main(String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		
		Blog blog = new Blog();		
		
		int escolha = 0;
		
		do{
			System.out.println("BLOG: O que você quer fazer?");
			System.out.println("1 - Novo post de notícia");
			System.out.println("2 - Nova resenha de produto");
			System.out.println("3 - Novo post de outros assuntos");
			System.out.println("4 - Listar todas as postagens");			
			System.out.println("5 - Curtir uma postagem");
			System.out.println("6 - Não curtir uma postagem");			
			System.out.println("7 - Sair");
			System.out.println("Escolha a opção: ");
			
			escolha = entrada.nextInt();
			entrada.nextLine();
			if(escolha==1){
				System.out.println("Título da Notícia: ");
				String title = entrada.nextLine();
				System.out.println("Conteúdo: ");
				String content = entrada.nextLine();
				System.out.println("Fonte: ");
				String source = entrada.nextLine();
				
				Post p1 = new News(title, content, source);
				blog.readData(p1);				
				}
			
			if(escolha==2){
				System.out.println("Título da Resenha: ");
				String title = entrada.nextLine();
				System.out.println("Conteúdo: ");
				String content = entrada.nextLine();
				
				Post p2 = new ProductReview(title, content);
				blog.readData(p2);					
											
				System.out.println("Avalie o produto\n(Nota de 0 a 10)\n");
				int stars = entrada.nextInt();
				
				int count = 0;
				while(count == 0){
					if(((ProductReview)p2).testaEvaluate(stars)){
						((ProductReview)p2).evaluate(stars);
						count = 1;
						}
					else{
						System.out.println("Nota inválida!\nTente novamente: ");
						stars = entrada.nextInt();
						}										
					}		
				}
			
			if(escolha==3){
				System.out.println("Título da Notícia: ");
				String title = entrada.nextLine();
				System.out.println("Conteúdo: ");
				String content = entrada.nextLine();
				
				Post p1 = new Post(title, content);
				blog.readData(p1);				
				}
			
			if(escolha==4){
				blog.showAll();
				}
				
			if(escolha==5){
				int count = 0;
				
				while(count==0){
					System.out.println("Digite:\n1 para inserir o Código do Post a curtir\n2 para imprimir todos os posts e verificar o código");
					
					int escolha2 = entrada.nextInt();
					
					if(escolha2 == 1){
						int count2 = 0;
						
						int codPost = entrada.nextInt();
						
						int indice = 0;
						int size = blog.posts.size();
						for(Post i : blog.posts){
							if(indice == codPost){
								i.like();
								count = 1;
								}
							
							if(indice > size){
								System.out.println("Código Inválido\nTente novamente");
								}
																		
							indice++;
														
							}					
					
						}
					
					if(escolha2 == 2){
						blog.showAll();						
						}					
					}			
				
				}										
			
			}while(escolha<6);
	
	
	
	
	}
}

