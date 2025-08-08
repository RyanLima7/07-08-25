package encapsulamento;

import java.util.Scanner;

public class TestePersonagem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PersonagemRPG p = new PersonagemRPG();

		System.out.println(" == Bem-vindo ao criador de personagem RPG ==");

		System.out.print("Digite o nome do personagem: ");
		p.setNome(sc.nextLine());

		System.out.print("Digite a classe do personagem (Guerreiro, Mago, Arqueiro...): ");
		p.setClasse(sc.nextLine());

		System.out.print("Digite o nível do personagem: ");
		int nivel = sc.nextInt();
		p.setNivel(nivel);

		System.out.print("Digite a vida do personagem (0 a 100): ");
		int vida = sc.nextInt();
		p.setVida(vida);

		System.out.println("\n Personagem criado com sucesso!");
		System.out.println("Nome: " + p.getNome());
		System.out.println("Classe: " + p.getClasse());
		System.out.println("Nível: " + p.getNivel());
		System.out.println("Vida: " + p.getVida());

		System.out.println("\n Obrigado por usar o == Criador de Personagem RPG ==");

		sc.close();
	}
}
