package aula1;

public class main {

	public static void main(String[] args) {
		Controller c = new Controller();
		Produto p = c.criarProduto("leite", "itambé", 8);
		Produto p2 = c.criarProduto("arroz", "tiojoao", 10);
		System.out.println(c.getProds());
	}
}
