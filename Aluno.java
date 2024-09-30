public class Aluno {

    private int numMatricula;
    private String nomeAluno;
    private double nota1;
    private double nota2;

    public Aluno (int numMatricula, String nomeAluno, double nota1, double nota2){
        this.nomeAluno = nomeAluno;
        this.numMatricula = numMatricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void setNota1(double nota1){
        this.nota1 = nota1;
    }
    public void setNota2(double nota2){
        this.nota2 = nota2;
    }

    public double Media(){
        return (nota1 + nota2) / 2;
    }

    public boolean Aprovacao(double media){
        boolean Aprovado;
        if(media>=7){
            return Aprovado = true;
        }else{
            return Aprovado = false;
        }
    }

    public double quantoPrecisa(double media){
        double precisa = (50-media*6)/4;
        return precisa;
    }

    @Override
    public String toString(){
        return "---------- Informações do Aluno(a) ----------\n" + "Nome: " + nomeAluno + "\nNúmero de matrícula: " +
                numMatricula + "\nNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nMédia: " + Media() +
                "\nStatus de aprovação: " + Aprovacao(Media());
    }
}
