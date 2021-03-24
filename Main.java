import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {

	public static void main(String[] args) {
		Pessoa[] pessoa = new Pessoa[6];
		int opcao;
		int posicao = 0;
		do {
			opcao = parseInt(showInputDialog(gerarMenu()));
			if (opcao < 1 || opcao > 7) {
				showMessageDialog(null, "Opção invalida");
			} else {
				switch (opcao) {
				case 1:
					cadastrarEmpregado(pessoa, posicao);
					posicao++;
					break;
				case 2:
					cadastrarCliente(pessoa, posicao);
					posicao++;
					break;
				case 3:
					Pesquisar(pessoa, posicao);
					break;
				case 4:
					listarEmpregados(pessoa, posicao);
					break;
				case 5:
					ListarClientes(pessoa, posicao);
					break;
				case 6:
					Remover(pessoa, posicao);
					break;

				}
			}
		} while (opcao != 7);

	private static void ListarClientes(Pessoa[] pessoa, int posicao) {
		String aux;
		for (int i = 0; i < posicao; i++) {
			if (pessoa[i] == cliente) {
				aux = pessoa[i].getNome() + " ,Cpf: " + pessoa[i].getCpf() + "\n";

			}

		}
		showMessageDialog(null, "Clientes \n" + aux);
	}

	private static void listarEmpregados(Pessoa[] pessoa, int posicao) {
		String aux;
		for (int i = 0; i < posicao; i++) {
			if (pessoa[i] == Pessoa.Empregado()) {
				aux = pessoa[i].getNome() + " ,Cpf: " + pessoa[i].getCpf() + "\n";

			}

		}
		showMessageDialog(null, "Clientes \n" + aux);
	}

	private static void cadastrarCliente(Pessoa[] pessoa, int posicao) {
		pessoa[posicao] = new Pessoa.Cliente(null, null);
		pessoa[posicao].setNome(showInputDialog("Informe seu nome"));
		pessoa[posicao].setCpf(showInputDialog("Informe seu cpf"));
		pessoa[posicao].valorDaDivida = showInputDialog("Informe sua divida");
		for (int i = 0; i < posicao; i++) {
			if (pessoa[posicao].getCpf().equals(pessoa[i].getCpf())) {
				showMessageDialog(null, "CPF repetido, impossivel cadastrar nova pessoa");

				posicao--;

			}

		}

	}

	private static void cadastrarEmpregado(Pessoa[] pessoa, int posicao) {
		int opcao = parseInt(showInputDialog(null, "1. Vendedor \n 2. Gerente"));
		switch (opcao) {
		case 1:
			pessoa[posicao] = new Pessoa(null, null);
			pessoa[posicao].setNome(showInputDialog("Informe seu nome"));
			pessoa[posicao].setCpf(showInputDialog("Informe seu cpf"));
			pessoa[posicao].matricula = showInputDialog("Informe a matrícula");
			pessoa[posicao].salario = showInputDialog("Informe o salario");
			pessoa[posicao].comissao = showInputDialog("Informe a comissão");
			for (int i = 0; i < posicao; i++) {
				if (pessoa[posicao].getCpf().equals(pessoa[i].getCpf())) {
					showMessageDialog(null, "CPF repetido, impossivel cadastrar nova pessoa");

					posicao--;

				}

			}

			break;
		case 2:
			pessoa[posicao] = new Pessoa(null, null);
			pessoa[posicao].setNome(showInputDialog("Informe seu nome"));
			pessoa[posicao].setCpf(showInputDialog("Informe seu cpf"));
			pessoa[posicao].matricula = showInputDialog("Informe a matrícula");
			pessoa[posicao].salario = showInputDialog("Informe o salario");
			pessoa[posicao].bonus = showInputDialog("Informe o bonus");
			for (int i = 0; i < posicao; i++) {
				if (pessoa[posicao].getCpf().equals(pessoa[i].getCpf())) {
					showMessageDialog(null, "CPF repetido, impossivel cadastrar nova pessoa");

					posicao--;

				}

			}
			break;
		}
	}
}