package aula1;

public class Controller {
	Services s;
	public Controller() {
		s = new Services();
	}
	public void criarProduto(String nome, String fabricante, double preco) {
		s.criarProduto(nome, fabricante, preco);
	}
	public void criarLote(Produto p, int qtd, String dataV) {
		s.criarLote(p, qtd, dataV);
	}
	public String getLotes() {
		return s.getLote();
	}
	public String getProds() {
		return s.getProdutos();
	}
}
