import java.util.ArrayList;
import java.util.Arrays;

public class Editora{
	private String nome;   
	private int cnpj; 
	ArrayList<Publicacao> publicacao;
	
	public Editora(String nome, int cnpj){
		this.nome = nome;
		this.cnpj = cnpj;
		publicacao = new ArrayList<Publicacao>();
	}
	
	void setNome(String nomeNew){
		this.nome = nomeNew;						
	}
	
	String getNome(){
		return this.nome;
		}
	
	void setCnpj(int cnpjNew){
		this.cnpj = cnpjNew;		
	}

	int getCnpj(){
		return this.cnpj;
		}

	void cadastraPublicacao(Publicacao p1){
		publicacao.add(p1);
		}
	
	public String toString(){
		return "\nNome: " + this.nome;	 
	}

}













