package aula1;

import java.sql.Date;

public class Lote {
	private int qtd;
	private String dataV;
	Produto prod;
	public Lote(Produto p, int qtd, String dataV) {
		this.prod = p;
		this.dataV =  dataV;
		this.qtd = qtd;
	}
}
