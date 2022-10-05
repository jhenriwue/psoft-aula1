package aula1;

import java.util.HashSet;

public class ProdutoRepository {
	private HashSet<Produto> set = new HashSet<>();
	public ProdutoRepository(){
		set = new HashSet<>();
		
	}
	public HashSet<Produto> getLista() {
		return set;
	}
	public void addSet(Produto p) {
		set.add(p);
	}
}
