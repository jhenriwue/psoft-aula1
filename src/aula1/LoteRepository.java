package aula1;

import java.util.HashMap;

public class LoteRepository {
	private HashMap<Integer, Lote> mapa;
	public LoteRepository() {
		mapa = new HashMap<>();
	}
	public HashMap<Integer,Lote> getMapa() {
		return mapa;
	}
	public void addMapa(Integer i, Lote l) {
		mapa.put(i, l);
	}
}
