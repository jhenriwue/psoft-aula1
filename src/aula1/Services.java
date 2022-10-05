package aula1;

public class Services {
	LoteRepository lr = new LoteRepository();
	ProdutoRepository pr = new ProdutoRepository();
	public Services(){
	}
	public void criarProduto(String nome, String fabricante, double preco) {
		Produto p = new Produto(nome, fabricante, preco);
		pr.addSet(p);
	}
	public void criarLote(Produto p, int qtd, String dataV) {
		Lote l = new Lote(p, qtd, dataV);
		lr.addMapa(l.hashCode(), l);
	}
	public String getLote() {
		String retorno = "";
		for (Lote lote : lr.getMapa().values()) {
			retorno += lote.getProd().getNome() + " " + lote.getQtd() + " " + lote.getDataV() + "\n";
		}
		return retorno;
	}
	public String getProdutos() {
		String lista = "";
		for (Produto prod : pr.getLista()) {
			lista += prod.getNome() + " " + prod.getFabricante() + " R$" + prod.getPreco() + "\n"; 
		}
		return lista;
	}
}
