import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        String nome;
        int matricula;
        double nota1;
        double nota2;

        System.out.println("Digite o nome do aluno: ");
        nome = scnr.next();
        System.out.println("Digite o número de matrícula do aluno: ");
        matricula = scnr.nextInt();
        System.out.println("Digite a nota a qual o aluno tirou na primeira avaliação: ");
        nota1 = scnr.nextInt();
        System.out.println("Digite a nota a qual o aluno tirou na segunda avaliação: ");
        nota2 = scnr.nextInt();

        Aluno aluno1 = new Aluno(matricula, nome, nota1, nota2);
        System.out.println(aluno1);


    }
}

