import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Blog{
	
	Scanner entrada = new Scanner(System.in);
	
	ArrayList<Post> posts;
	
	public Blog(){
		posts = new ArrayList<Post>();		
		}
	
	public void readData(Post p1){
		
		String title;
		String content;
		String source;
		String brand;
		int stars;
		
		System.out.println("Título: ");
		title = entrada.nextLine();
		System.out.println("Conteúdo: ");
		content = entrada.nextLine();
		
		if(p1 instanceof ProductReview){
			System.out.println("Marca do Produto Avaliado: ");
			brand = entrada.nextLine();
			
			posts.add(new ProductReview(title, content, brand));
			
			System.out.println("Avalie o produto\n(0 a 10 estrelas)\n");
				stars = entrada.nextInt();
				
				int count = 0;
				while(count == 0){
					if(((ProductReview)p1).testaEvaluate(stars)){
						((ProductReview)p1).evaluate(stars);
						count = 1;
						}
					else{
						System.out.println("Nota inválida!\nTente novamente: ");
						stars = entrada.nextInt();
						}										
					}
				}
		
		else if(p1 instanceof News){
			System.out.println("Fonte: ");
			source = entrada.nextLine();
			posts.add(new News(title, content, source));
			}
		
		else{
			posts.add(new Post(title, content));
			}
		
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
		
		Post a = new News("Notícia Quentíssima! Rifam é visto tomando coca em cantina", "Os alunos da UFFS estão cada dia mais habituados a dividirem o espaço de ensino e aprendizagem com uma celebridade. A Careca do Rifam, que já foi motivos de muito alvoroço, hoje desfila tranquilamente pelos corredores. Até febre por fotos e autógrafos parece ter dado uma trégua. Mesmo a sua página oficial - Todo dia um meme diferente da careca do Rifam - não está mais sendo atualizada diariamente. Rifam está tão a vontade entre os meros mortais que inclusive foi visto sentado tranquilamente na cantina da UFFS tomanco Coca e comendo Paçoca. É realmente incrível que uma celebridade se renda a uma refeição tão simples e popular. Seria o famoso de fato um sujeito simples ou tudo não passa de um golpe de Marketing para promover a sua especulada candidatura à presiência em 2018?", "Página: Todo dia um meme diferente da Careca do Rifam");		
		blog.posts.add(a);
		
		Post b = new ProductReview("Café Preto da Cantina - um Review", 
		"Avaliamos o café preto da cantina como médio. Ele tem as vantagens de ser vegetariano, vegano, sem gluten, sem lactose e sem aditivos agricolas. Porém, para obter um café bom você tem que ter a sorte de chegar na hora em que o café está fresco, o que a nossa equipe especula que seja as 05:30 da manhã das segundas feiras. Caso você adquira o seu café em qualquer outro horário ao longo da semana, irá observar um gosto de queimado, velho, requentado, parecendo que este café foi passado antes mesmo de você entrar nesta universidade e ficou ali sendo eternamente reaquecido. Apesar o sabor ruim, o café da cantina mantém suas propriedades ressussitativas, sendo considerado mais um remédio do que propriamente uma bebida saborosa. Se você busca a ressurreição em cafeína este é o produto certo para você. Se você busca sabor, sugerimos fortemente um todynho.", "Cantina's Black Coffee©");
		((ProductReview)b).evaluate(5);
		blog.posts.add(b);
		
		Post c = new Post("Gang do Suéter: a nova tribo urbana", "A UFFS está vivenciando o nascimento de uma nova tribo urbana: a Gang do suéter. Começou com uma coincidência - dois jovens que adiquiriam o mesmo suéter por acaso - e virou uma febre quando uma terceira jovem deliberadamente comprou a vestimenta apenas para se inserir neste grupo social. Alguns estudantes e até mesmo professores já desmonstraram interesse em adquirir o suéter. Outros acreditam que a necessidade de adiquirir um suéter de 100 reais para fazer parte de um grupo social é algo que exclui as classes menos favorecidas. Especula-se até que tudo não passa de um plano articulado pelo governo ilegítimo para excluir e banir os menos favorecidos de universidade. Para mitigar tais efeitos, a direção de campus está submetendo esta semana um pedido para o governo federal para implementar a bolsa-sueter como um sub-programa do projeto Universidade para Todos");
		blog.posts.add(c);
						
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
				Post p1 = new News();
				blog.readData(p1);								
				}
			
			if(escolha==2){				
				Post p2 = new ProductReview();
				blog.readData(p2);
				}
			
			if(escolha==3){				
				Post p3 = new Post();
				blog.readData(p3);			
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
						int codPost = entrada.nextInt();
						
						int indice = 0;
						int size = blog.posts.size();
						for(Post i : blog.posts){
							if(indice == codPost){
								i.like();
								count = 1;
								}
							
							else if(indice > size){
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

			if(escolha==6){
				int count3 = 0;
				
				while(count3==0){
					System.out.println("Digite:\n1 para inserir o Código do Post a descurtir\n2 para imprimir todos os posts e verificar o código");
					
					int escolha3 = entrada.nextInt();
					
					if(escolha3 == 1){
						int codPost1 = entrada.nextInt();
						
						int indice1 = 0;
						int size = blog.posts.size();
						for(Post i : blog.posts){
							if(indice1 == codPost1){
								i.dislike();
								count3 = 1;
								}
							
							else if(indice1 > size){
								System.out.println("Código Inválido\nTente novamente");
								}
																		
							indice1++;
														
							}					
					
						}
					
					if(escolha3 == 2){
						blog.showAll();						
						}					
					}			
				
				}

										
			
			}while(escolha<7);
	
	
	
	
	}
}

