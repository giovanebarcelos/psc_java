package aula14;

public abstract class Caloria {
	private  String descricao;
	private int qtdeCalorias;
	
	public Caloria(String descricao, int qtdeCalorias) {
		super();
		this.descricao = descricao;
		this.qtdeCalorias = qtdeCalorias;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getQtdeCalorias() {
		return qtdeCalorias;
	}
	public void setQtdeCalorias(int qtdeCalorias) {
		this.qtdeCalorias = qtdeCalorias;
	}
}
