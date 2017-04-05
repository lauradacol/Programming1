class Programa{
    public static void main(String[] args){
        Aluno aa = new Aluno();
        aa.nome="Pri";
        aa.matricula=2535;
        
        System.out.println(aa);
        
        Disciplina d1=new Disciplina();
        d1.creditos=4;
        d1.codigo=123456;
        d1.nome="Programação I";
        
        aa.matricular(d1);
        
        d1=new Disciplina();
        d1.nome="ED II";
        d1.codigo=12547;
        d1.creditos=4;
        aa.matricular(d1);
        
        Disciplina d2=new Disciplina();
        d2.nome="Algebra Linear";
        d2.codigo=12548;
        d2.creditos=2;
        aa.matricular(d2);
        
        d2=new Disciplina();
        d2.nome = "Cálculo I";
        d2.codigo = 12349;
        d2.creditos=6;
        aa.matricular(d2);
        
        aa.listarDisciplinas();
        System.out.println(aa);
        aa.disciplinas[0].encerrar();
        
        aa.listarDisciplinas();
        
        
    }
}
