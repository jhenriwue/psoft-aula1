package aula1;

import java.util.ArrayList;
import java.util.HashMap;

public class Lote {
	private int qtd;
	private String dataV;
	Produto prod;
	HashMap<Produto, String> lista;
	public Lote(Produto p, int qtd, String dataV) {
		lista =  new HashMap<>();
		lista.put(p, dataV);
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
	public String getLista(){
		for (Produto prod : lista.keySet()) {
			return prod.getNome() + "|" + prod.getFabricante() + "|R$" + prod.getPreco();
		}
		return null;
	}
}
