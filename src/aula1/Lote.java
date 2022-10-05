package aula1;

public class Lote {
	private int qtd;
	private String dataV;
	Produto p;
	public Lote(Produto p, int qtd, String dataV) {
		this.p = p;
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
		return p;
	}
	public void setProd(Produto prod) {
		this.p = prod;
	}
}
