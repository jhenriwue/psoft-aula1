package aula1;

public class main {

	public static void main(String[] args) {
		System.out.println(listarProdutos());
	}
	
	public static String listarProdutos() {
		Produto p = new Produto("bike", "keloi", 1000.00);
		Lote l = new Lote(p, 30, "15-09");
		return l.getLista();
	}

}
