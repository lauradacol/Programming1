/* Para usar o ArrayList */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

/* Para criar objetos de entrada*/
import java.util.Scanner;

class Empresa{
	String nomeFantasia;
	String razaoSocial;
	String cnpj;
	ArrayList<Funcionario> bodegueiros;
	ArrayList<Bebida> bebidas;
	
	public Empresa(String nF, String rS, String cnpj){
		this.nomeFantasia = nF;
		this.razaoSocial = rS;
		this.cnpj = cnpj;
		bodegueiros = new ArrayList<Funcionario>();
		bebidas = new ArrayList<Bebida>();
		}

 	public void contrata(Funcionario f1){
		this.bodegueiros.add(f1);
		System.out.println("Funcionário contratado com sucesso!");
	}
	
	/*
	public void demiteFunc(Funcionario f1){
		this.bodegueiros.remove(f1);
		
		}*/
		
	public boolean demiteFunc(String idFunc){
		
		boolean b = this.bodegueiros.stream().anyMatch(f1 -> f1.idFunc.equals(idFunc));
		this.bodegueiros.removeIf(f1 -> f1.idFunc.equals(idFunc));
		return b;
	}
		
	public Optional<Funcionario> encontraFunc(String idFunc){
		return this.bodegueiros.stream().filter(f1 -> f1.idFunc.equals(idFunc)).findFirst();
	}
	
	
	
	
	
}
