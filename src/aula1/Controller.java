package aula1;

public class Controller {
	Services s;
	public Controller() {
		s = new Services();
	}
	public Produto criarProduto(String nome, String fabricante, double preco) {
		return s.criarProduto(nome, fabricante, preco);
	}
	public Lote criarLote(Produto p, int qtd, String dataV) {
		return s.criarLote(p, qtd, dataV);
	}
	public String getLotes() {
		return s.getLote();
	}
	public String getProds() {
		return s.getProdutos();
	}
}
