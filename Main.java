import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoa = new ArrayList<>();
		int opcao;

		do {
			opcao = parseInt(showInputDialog(gerarMenu()));
			if (opcao < 1 || opcao > 7) {
				showMessageDialog(null, "Opção invalida");
			} else {
				switch (opcao) {
				case 1:
					opcao = parseInt(showInputDialog(gerarMenu2()));
					if (opcao != 8 && opcao != 9) {
						showMessageDialog(null, "Opção invalida");
					} else {
						switch (opcao) {
						case 8:
							pessoa.add(cadastrarPessoa(opcao));
							break;
						case 9:
							pessoa.add(cadastrarPessoa(opcao));
							break;
						}
					}
					break;
				case 2:
					pessoa.add(cadastrarPessoa(opcao));

					break;
				case 3:
					Pesquisar(pessoa);

				case 4:
					Listar(pessoa);

				case 5:
					Listar(pessoa);

				case 6:
					Remover(pessoa);

				}
			}
		} while (opcao != 7);
	}

	public static String gerarMenu() {
		String aux = "Escolha uma opção\n";
		aux += "1. Cadastrar Empregado\n";
		aux += "2. Cadastrar Cliente\n";
		aux += "3. Pesquisar\n";
		aux += "4. Listar Empregados\n";
		aux += "5. Listar Clientes\n";
		aux += "6. Remover\n";
		aux += "7. Finalizar\n";
		return aux;
	}

	public static String gerarMenu2() {
		String aux = "Escolha uma opção\n";
		aux += "8. Cadastrar Gerente\n";
		aux += "9. Cadastrar Vendedor\n";

		return aux;
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
		pessoa.setNome(showInputDialog(null, "Informe seu nome"));
		pessoa.setCpf(showInputDialog(null, "Informe seu Cpf"));

		return pessoa;
	}

	private static Cliente cadastrarCliente() {
		Cliente cliente = null;
		double divida = Double.parseDouble(showInputDialog(null, "Informe sua dívida"));
		cliente.setValorDaDivida(divida);
		return cliente;
	}

	private static Empregado cadastrarEmpregado(int opcao) {
		Empregado empregado = null;
		switch (opcao) {
		case 8:
			cadastrarGerente();
			break;
		case 9:
			cadastrarVendedor();
			break;
		}
		empregado.setMatricula(showInputDialog(null, "Informe sua matricula"));

		return empregado;
	}

	private static Gerente cadastrarGerente() {
		Gerente gerente = null;
		gerente.setSalario(Double.parseDouble(showInputDialog(null, "Informe seu salário")));
		return gerente;
	}

	private static Vendedor cadastrarVendedor() {
		Vendedor vendedor = null;
		vendedor.setComissao(Double.parseDouble(showInputDialog(null, "Informe sua comissao")));
		vendedor.setTotalDasVendas(Double.parseDouble(showInputDialog(null, "Informe suas vendas")));
		return vendedor;
	}

	

	public static void Remover(ArrayList<Pessoa> pessoa) {
		String consulta = showInputDialog(null, "Informe o Cpf da pessoa a ser deletada");
		pessoa.forEach(pessoas -> {
			if (pessoas.getCpf().equals(consulta)) {
				if (pessoas instanceof Empregado) {
					int resp = JOptionPane.showConfirmDialog(null,
							"O Cpf-> " + pessoas.getCpf() + " pertence ao empregado-> " + pessoas);
					if (resp == JOptionPane.YES_OPTION) {
						showMessageDialog(null, "Pessoa deletada");
						int aux = pessoa.indexOf(pessoas);
						pessoa.remove(aux);
					} else {
						showMessageDialog(null, "Ação cancelada");
					}

				} else if (pessoas instanceof Cliente) {

					int resp = JOptionPane.showConfirmDialog(null,
							"O Cpf-> " + pessoas.getCpf() + " pertence ao cliente-> " + pessoas);
					if (resp == JOptionPane.YES_OPTION) {
						showMessageDialog(null, "Pessoa deletada");
						int aux = pessoa.indexOf(pessoas);
						pessoa.remove(aux);
					} else {
						showMessageDialog(null, "Ação cancelada");
					}
				}

			} else {
				showMessageDialog(null, "Pessoa não encontrada");
			}

		});
	}
}