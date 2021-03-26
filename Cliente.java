class Cliente extends Pessoa {

		public Cliente(String nome, String cpf) {
			super(nome, cpf);

		}

		private double valorDaDivida;

		public void setCliente(double valorDaDivida) {
			this.valorDaDivida = valorDaDivida;
		}
	}