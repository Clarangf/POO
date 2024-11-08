package applicattion;

import entities.Funcionarios;
import entities.tipo.Mensalista;
import entities.tipoFuncionario.Horista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            boolean fim = false;
            List<Funcionarios> funcionarios = new ArrayList<>();
            while (!fim) {
                System.out.println(
                        "\nQual operação você deseja executar?\n" +
                                "1 - Registrar funcionário horista.\n" +
                                "2 - Registrar funcionário mensalista.\n" +
                                "3 - Consultar dados dos funcionários. \n" +
                                "4 - Finalizar Programa.\n");

                int operacao = sc.nextInt();
                if (operacao < 1 || operacao > 4) {
                    throw new IllegalArgumentException("Operação inválida!");
                }

                switch (operacao) {
                    case 1:
                        System.out.println("Digite o id: ");
                        int id = sc.nextInt();

                        System.out.println("Digite o nome: ");
                        sc.nextLine();
                        String nome = sc.nextLine();

                        System.out.println("Digite a idade: ");
                        int idade = sc.nextInt();

                        System.out.println("Digite as horas trabalhadas:");
                        int horasTrabalhadas = sc.nextInt();

                        System.out.println("Digite o valor por hora trabalhada:");
                        double taxaHora = sc.nextDouble();
                        funcionarios.add(new Horista(id, nome, idade, horasTrabalhadas, taxaHora));

                        System.out.println("\nFuncionário registrado!\n");
                        break;
                    case 2:

                        System.out.println("Digite o id: ");
                        id = sc.nextInt();

                        System.out.println("Digite o nome: ");
                        sc.nextLine(); // Limpar o buffer
                        nome = sc.nextLine();

                        System.out.println("Digite a idade: ");
                        idade = sc.nextInt();

                        System.out.println("Digite o salário inicial: ");
                        double salarioBase = sc.nextDouble();

                        System.out.println("Digite o valor do bonus salarial:");
                        double bonusSalarial = sc.nextDouble();
                        funcionarios.add(new Mensalista(id, nome, idade, salarioBase, bonusSalarial));

                        System.out.println("\nFuncionário registrado!\n");




                        break;
                    case 3:
                        funcionarios.forEach(System.out::println);
                        break;
                    case 4:
                        System.out.println("Programa finalizado!");
                        fim = true;
                        break;
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}