package aula1;

public class Lote {
	private int qtd;
	private String dataV;
	Produto prod;
	public Lote(Produto p, int qtd, String dataV) {
		this.prod = p;
		this.dataV = dataV;
		this.qtd = qtd;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public String getDataV() {
		return dataV;
	}
	public void setDataV(String dataV) {
		this.dataV = dataV;
	}
	public Produto getProd() {
		return prod;
	}
	public void setProd(Produto prod) {
		this.prod = prod;
	}
}
