package aula1;

public class Services {
	Lote l;
	Produto p;
	LoteRepository lr;
	ProdutoRepository pr;
	public Services(){
	}
	public Produto criarProduto(String nome, String fabricante, double preco) {
		this.p = new Produto(nome, fabricante, preco);
		this.pr = new ProdutoRepository(p);
		return p;
	}
	public Lote criarLote(Produto p, int qtd, String dataV) {
		this.l = new Lote(p, qtd, dataV);
		this.lr = new LoteRepository(l);
		return l;
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
