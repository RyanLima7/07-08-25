package encapsulamento;

import java.util.Scanner;

public class LivroBiblioteca {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Livro livraria = new Livro();
        System.out.println("\n\tBom dia, seja bem-vindo(a) !");

        System.out.println("\nInforme seu nome por favor :");
        String nome = sc.next();
        sc.nextLine(); // 👈 Isso limpa a quebra de linha que sobrou do next()

        System.out.println("\nInforme o título do seu livro:");
        livraria.setTitulo(sc.nextLine());

        System.out.println("\nInforme o autor que deseja:");
        livraria.setAutor(sc.nextLine());

        System.out.println("\nDiga o número de páginas:");
        int paginas = sc.nextInt();
        livraria.setNumeroPaginas(paginas); // 👈 Corrigido o nome do método

        System.out.println("\nO título do livro é: " + livraria.getTitulo());
        System.out.println("O autor do livro é: " + livraria.getAutor());
        System.out.println("O número de páginas é: " + livraria.getNumeroPaginas());

        sc.close();
    }
}
