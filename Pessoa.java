public class Pessoa {

	protected  String nome;
	protected  String cpf;
	

	public Pessoa() {

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
	@Override
    public String toString() {
        return "Pessoa{" +
                "Nome ->" + nome +
                ", Cpf -> '" + cpf + '\'' +
                '}';
    }
}


	
	