package aula1;

import java.util.HashMap;

public class LoteRepository {
	private HashMap<Integer, Lote> mapa;
	private Lote l;
	private Integer i =1;
	public LoteRepository(Lote l) {
		mapa = new HashMap<>();
		this.l = l;
		mapa.put(i, l);
		i+=1;
	}
	public HashMap<Integer,Lote> getMapa() {
		return mapa;
	}
}
