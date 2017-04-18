class Programa{

	public static void main(String[] args){
		Aluno a1 = new Aluno("Pri", 666);
		Aluno.totalDeAlunos++;

		System.out.println("Total em a1: " + Aluno.totalDeAlunos);

		Aluno a2 = new Aluno("Ana", 007);
		Aluno.totalDeAlunos++;

		System.out.println("Total em a1: " + Aluno.totalDeAlunos);
	}
}
