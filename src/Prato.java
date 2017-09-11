
public class Prato {
	private String nome;
	private double preco;
	private String descricao;
	
	public Prato(String nome, double preco) {		
		this.nome = nome;
		this.preco = preco;		
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
}
