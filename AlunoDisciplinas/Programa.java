class Programa{
    public static void main(String[] args){
        Aluno aa = new Aluno(2535, "Pri");
        System.out.println(aa);
        
        Disciplina d1=new Disciplina(4, 123456, "Programação I");
        aa.matricular(d1);
        
        d1=new Disciplina(4, 12547, "ED II");
        aa.matricular(d1);
        
        Disciplina d2=new Disciplina(2, 12548, "Álgebra Linear");
        aa.matricular(d2);
        
        d2=new Disciplina(6, 12349, "Cálculo I");
        aa.matricular(d2);
        
        aa.listarDisciplinas();
        System.out.println(aa);
        
        aa.disciplinas[0].encerrar();
        aa.listarDisciplinas();
        
        
    }
}
