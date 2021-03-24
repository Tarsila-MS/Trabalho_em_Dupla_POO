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

	}