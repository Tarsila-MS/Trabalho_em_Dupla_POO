public class Empregado extends Pessoa {

		public Empregado(String nome, String cpf) {
			super(nome, cpf);

		}

		protected String matricula;

		public void setEmpregado(String matricula) {
			this.matricula = matricula;
		}
}

	public interface Bonus {

		public static double CalcularBonus(double salario, int bonus) {

			return salario * (bonus / 100);
		}

	}
}