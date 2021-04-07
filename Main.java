
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Pessoa> pessoa = new ArrayList<>();
		int opcao;
		Scanner teclado = new Scanner(System.in);

		do {
			gerarMenu();
			opcao = teclado.nextInt();
			if (opcao < 1 || opcao > 7) {
				System.out.println("Opção invalida");
			} else {
				switch (opcao) {
				case 1:
					gerarMenu2();
					opcao = teclado.nextInt();
					if (opcao != 8 && opcao != 9) {
						System.out.println("Opção invalida");
					} else {
						switch (opcao) {
						case 8:
							pessoa.add(cadastrarPessoa(opcao));

							System.out.println(pessoa.get(0).getNome());
							break;
						case 9:
							pessoa.add(cadastrarPessoa(opcao));
							break;
						}
					}
					break;
				case 2:
					pessoa.add(cadastrarPessoa(opcao));
					for (int i = 0; i < pessoa.size(); i++) {
						System.out.println(pessoa.get(i).getNome());
					}
					break;
				case 3:

					Pesquisar(pessoa);
					break;

				case 4:
					Listar(pessoa, opcao);
					break;
				case 5:
					Listar(pessoa, opcao);
					break;
				case 6:
					Remover(pessoa);
					break;
				}
			}
		} while (opcao != 7);
		teclado.close();
	}

	public static void gerarMenu() {
		String aux = "Escolha uma opção\n";
		aux += "1. Cadastrar Empregado\n";
		aux += "2. Cadastrar Cliente\n";
		aux += "3. Pesquisar\n";
		aux += "4. Listar Empregados\n";
		aux += "5. Listar Clientes\n";
		aux += "6. Remover\n";
		aux += "7. Finalizar\n";
		System.out.println(aux);
	}

	public static void gerarMenu2() {
		String aux = "Escolha uma opção\n";
		aux += "8. Cadastrar Gerente\n";
		aux += "9. Cadastrar Vendedor\n";

		System.out.println(aux);
	}

	private static Pessoa cadastrarPessoa(int opcao) {

		Pessoa pessoa = null;
		switch (opcao) {
		case 2:
			pessoa = cadastrarCliente();
			break;
		case 8:
			pessoa = cadastrarEmpregado(opcao);
			break;
		case 9:
			pessoa = cadastrarEmpregado(opcao);
			break;
		}
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe seu nome ->");
		String nome = teclado.nextLine();
		System.out.println("Informe seu Cpf ->");
		String cpf = teclado.nextLine();
		pessoa.setNome(nome);
		pessoa.setCpf(cpf);
		return pessoa;

	}

	private static Cliente cadastrarCliente() {
		Cliente cliente = new Cliente();

		return cliente;
	}

	private static Empregado cadastrarEmpregado(int opcao) {
		Empregado empregado = new Empregado();

		switch (opcao) {
		case 8:
			cadastrarGerente();
			break;
		case 9:
			cadastrarVendedor();
			break;
		}
		empregado.setMatricula("" + Math.random() * 100);
		return empregado;
	}

	private static Gerente cadastrarGerente() {
		Gerente gerente = null;
		return gerente;
	}

	private static Vendedor cadastrarVendedor() {
		Vendedor vendedor = null;
		return vendedor;

	}

	public static void Pesquisar(List<Pessoa> pessoa) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o Cpf a ser buscado");
		String consulta = teclado.nextLine();
		for (int i = 0; i < pessoa.size(); i++) {

			if (((List<Pessoa>) pessoa).get(i).getCpf().equals(consulta)) {
				if (pessoa instanceof Empregado) {
					System.out.println(pessoa.get(i));
				} else if (pessoa instanceof Cliente) {

					System.out.println(pessoa.get(i));
				}

			} else {
				System.out.println("Pessoa não encontrada");
			}

		}
		teclado.close();
	}

	public static void Listar(List<Pessoa> pessoa, int opcao) {

		for (int i = 0; i < pessoa.size(); i++) {

			if (pessoa.get(i) instanceof Empregado && opcao == 4) {
				System.out.println("Empregado ->" + pessoa.get(i));
			} else if (pessoa.get(i) instanceof Cliente && opcao == 5) {
				System.out.println("Cliente ->" + pessoa.get(i));

			}
		}

	}

	public static void Remover(List<Pessoa> pessoa) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o Cpf da pessoa a ser deletada");
		String consulta = teclado.nextLine();
		for (int i = 0; i < pessoa.size(); i++) {
			if (((List<Pessoa>) pessoa).get(i).getCpf().equals(consulta)) {
				if (pessoa instanceof Empregado) {
					System.out.println("O Cpf-> " + ((Pessoa) pessoa).getCpf() + " pertence ao empregado-> " + pessoa
							+ "\n deseja remove-lo? \n 1.Sim \n 2.Não");
					int resp = teclado.nextInt();
					if (resp == 1) {
						System.out.println("Pessoa deletada");
						pessoa.remove(i);
					} else {
						System.out.println("Ação cancelada");
					}

				} else if (pessoa instanceof Cliente) {

					System.out.println("O Cpf-> " + ((Pessoa) pessoa).getCpf() + " pertence ao cliente-> " + pessoa
							+ "\n deseja remove-lo? \n 1.Sim \n 2.Não");
					int resp = teclado.nextInt();
					if (resp == 1) {
						System.out.println("Pessoa deletada");
						pessoa.remove(i);
					} else {
						System.out.println("Ação cancelada");
					}
				}

			}
			teclado.close();
		}
	}
}
