import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanTexto = new Scanner(System.in);
        Scanner scanNum = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        Integer i = 0, idade = 0, id = 0, opt = 0;
        String nome, CPF;

        while (i == 0) {

            System.out.println("Deseja adicionar um aluno? 1 - SIM 2 -NÃO");
            opt = scanNum.nextInt();

            switch (opt) {
                case 1:

                    System.out.println("Digite o nome do aluno:");
                    nome = scanTexto.nextLine();
                    System.out.println("Digite o CPF do aluno:");
                    CPF = scanTexto.nextLine();
                    System.out.println("Digite a idade do aluno:");
                    idade = scanNum.nextInt();
                    id += 1;
                    alunos.add(new Aluno(nome, CPF, idade, id));
                    break;

                case 2:
                    System.out.println("Sistema encerrando...");
                    i = 1;
                    break;

                default:
                    System.out.println("Opção inválida!");

            }

            for (Aluno n : alunos) {
                System.out.println(
                        "\n Id do aluno: " + n.getId() +
                                "\n Nome: " + n.getNome() +
                                "\n CPF: " + n.getCPF() +
                                "\n Idade:" + n.getIdade());
            }
        }
    }
}