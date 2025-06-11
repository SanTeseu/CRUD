import dao.CavaleiroDAO;
import model.Cavaleiro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CavaleiroDAO dao = new CavaleiroDAO();

        System.out.println("=== Menu CDZ - Saga Eliseos ===");
        System.out.println("1. Cadastrar Cavaleiro");


        int opcao = sc.nextInt();
        sc.nextLine(); // limpar buffer

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
        }
    }
}
