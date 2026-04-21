import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GerenciadorBiblioteca gerenciador = new GerenciadorBiblioteca();
        int opcao;
        do {
            System.out.println("Menu de opções: ");
            System.out.println("1 - Listar livros");
            System.out.println("2 - Emprestar livros");
            System.out.println("3 - Devolver livros");
            System.out.println("4 - Sair");
            System.out.println("===========");
            System.out.print("Escolha: ");
            opcao = scan.nextInt();
            System.out.println("===========");

            switch (opcao){
                case 1:
                    int opcaoLivros;
                    System.out.println("Escolha uma seção: ");
                    System.out.println("1 - AVENTURA");
                    System.out.println("2 - AUTOAJUDA");
                    System.out.println("3 - FANTASIA");
                    System.out.println("4 - FINANÇIAS");
                    System.out.println("5 - TERROR");
                    System.out.println("6 - Voltar ao menu principal");
                    System.out.println(("==========="));
                    System.out.print("Escolha: ");
                    opcaoLivros = scan.nextInt();
                    System.out.println(("==========="));

                    if(opcaoLivros == 1){
                        System.out.println(gerenciador.getLivros());
                    } else if (opcaoLivros == 2) {
                        System.out.println(gerenciador.getLivros());
                    } else if( opcaoLivros == 3){
                        System.out.println(gerenciador.getLivros());
                    } else if(opcaoLivros == 4){
                        System.out.println(gerenciador.getLivros());
                    } else if (opcaoLivros == 5){
                        System.out.println(gerenciador.getLivros());
                    } else if(opcaoLivros == 6){
                        break;
                    }
                    break;
                case 2:
                    long idLivro;
                    long idUsuario;
                    System.out.println("====================");
                    System.out.print("Digite o ID do Livro: ");
                    idLivro = scan.nextLong();
                    System.out.println("====================");
                    System.out.println("======================");
                    System.out.print("Digite o Id do Usuário: ");
                    idUsuario = scan.nextLong();
                    System.out.println("======================");
                    boolean resultado = gerenciador.emprestarLivro(idLivro,idUsuario);
                    if(resultado){
                        System.out.println("Empréstimo realizado com sucesso");
                    } else {
                        System.out.println("Não foi possível realizar o empréstimo");
                    }
                    break;
                case 3:
                    long devolverLivro;
                    System.out.println("========================================");
                    System.out.print("Digite o ID do Livro que deseja devolver: ");
                    devolverLivro = scan.nextLong();
                    System.out.println("========================================");
                    boolean devolucao = gerenciador.devolverLivro(devolverLivro);
                    if(devolucao){
                        System.out.println("Livro devolvido com sucesso");
                    } else {
                        System.out.println("Não foi possível devolver o livro");
                    }
                    break;
                case 4:
                    System.out.println("======================");
                    System.out.println("Saindo do programa....");
                    System.out.println("======================");
                    break;
                default:
                    System.out.println("=========================");
                    System.out.println("Escolha uma opção válida:");
                    System.out.println("=========================");
                    break;
            }
        }while (opcao != 4);
        scan.close();
    }
}
