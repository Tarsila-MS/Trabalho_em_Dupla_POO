public class Pessoa {

	protected String nome, cpf;

	public Pessoa(String nome, String cpf) {

	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	

	public class Empregado extends Pessoa {

		public Empregado(String nome, String cpf) {
			super(nome, cpf);

		}

		protected String matricula;

		public void setEmpregado(String matricula) {
			this.matricula = matricula;
		}

		public class Gerente extends Empregado {

			public Gerente(String nome, String cpf) {
				super(nome, cpf);

			}

			private double salario;

			private double bonus;
			{

			}

		}

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

	public interface Bonus {

		public static double CalcularBonus(double salario, int bonus) {

			return salario * (bonus / 100);
		}

	}
}