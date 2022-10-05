package aula1;

public class main {
	
	public static void main(String[] args) {
		Controller c = new Controller();
	}
	public static void criarProduto(Controller c,String nome, String fabricante, double preco) {
		c.criarProduto(nome, fabricante,preco);
	}
	public static void criarLote(Controller c,Produto p, int qtd, String dataV) {
		c.criarLote(p, qtd, dataV);
	}
	public static void getProds(Controller c) {
		System.out.println(c.getProds());
	}
	public static void getLotes(Controller c) {
		System.out.println(c.getLotes());
	}
}
