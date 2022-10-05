package aula1;

import java.util.HashSet;

public class ProdutoRepository {
	Produto p;
	private HashSet<Produto> set = new HashSet<>();
	public ProdutoRepository(Produto p){
		set = new HashSet<>();
		this.p = p;
		set.add(p);
		
	}
	public HashSet<Produto> getLista() {
		return set;
	}
}
