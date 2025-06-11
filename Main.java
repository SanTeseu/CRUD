package dao;

import model.Cavaleiro;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CavaleiroDAO dao = new CavaleiroDAO();

        while (true) {
            System.out.println("\n=== Menu CDZ - Saga Eliseos ===");
            System.out.println("1. Cadastrar Cavaleiro");
            System.out.println("2. Listar Cavaleiros");
            System.out.println("3. Editar Cavaleiro");
            System.out.println("4. Excluir Cavaleiro");
            System.out.println("0. Sair");

            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                Cavaleiro c = new Cavaleiro();
                System.out.print("Nome: ");
                c.setNome(sc.nextLine());
                System.out.print("Constelação: ");
                c.setConstelacao(sc.nextLine());
                System.out.print("Nível: ");
                c.setNivel(sc.nextLine());
                System.out.print("Afiliacao: ");
                c.setAfiliacao(sc.nextLine());
                dao.criarCavaleiro(c);
                System.out.println("Cavaleiro inserido!");

            } else if (opcao == 2) {
                for (Cavaleiro c : dao.listar()) {
                    System.out.printf("[%d] %s - %s - %s - %s\n",
                            c.getId(), c.getNome(), c.getConstelacao(),
                            c.getNivel(), c.getAfiliacao());
                }

            } else if (opcao == 3) {
                System.out.print("ID do cavaleiro a editar: ");
                int id = sc.nextInt(); sc.nextLine();
                Cavaleiro c = new Cavaleiro();
                c.setId(id);
                System.out.print("Novo Nome: ");
                c.setNome(sc.nextLine());
                System.out.print("Nova Constelação: ");
                c.setConstelacao(sc.nextLine());
                System.out.print("Novo Nível: ");
                c.setNivel(sc.nextLine());
                System.out.print("Nova Afiliacao: ");
                c.setAfiliacao(sc.nextLine());
                dao.atualizar(c);
                System.out.println("Atualizado!");

            } else if (opcao == 4) {
                System.out.print("ID do cavaleiro a excluir: ");
                int id = sc.nextInt();
                dao.excluir(id);
                System.out.println("Excluído!");

            } else if (opcao == 0) {
                System.out.println("Encerrando...");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}
