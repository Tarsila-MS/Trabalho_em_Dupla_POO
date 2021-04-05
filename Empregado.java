public class Empregado extends Pessoa {
	protected String matricula;

		public Empregado() {
			super();

		}

		public String getMatricula() {
			return matricula;
		}
	
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}

	


	public interface Bonus {

		public static double CalcularBonus(double salario, int bonus) {

			return salario * (bonus / 100);
		}

	}
}