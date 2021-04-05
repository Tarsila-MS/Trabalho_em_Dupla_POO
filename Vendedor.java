public class Vendedor extends Empregado {
	private double totalDasVendas;

	private double comissao;

			public Vendedor() {
				super();

			}

			
		
			public void setTotalDasVendas(double vendas) {
				this.totalDasVendas = vendas;
			}
			public void setComissao(double comissao) {
				this.comissao = comissao;
			}

		
	

	
	public interface Salario {

		public static double calcularSalario(int totalDeVendas, int comissao) {

			return totalDeVendas * (comissao / 100);
		}

	} }
