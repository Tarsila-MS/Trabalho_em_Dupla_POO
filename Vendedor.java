public class Vendedor extends Empregado {

			public Vendedor(String nome, String cpf) {
				super(nome, cpf);

			}

			private double totalDasVendas;

			private double comissão;

		}
	}

	
	public interface Salario {

		public static double calcularSalario(int totalDeVendas, int comissao) {

			return totalDeVendas * (comissao / 100);
		}

	}
