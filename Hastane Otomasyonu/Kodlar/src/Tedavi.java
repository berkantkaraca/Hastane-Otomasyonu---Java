
public class Tedavi {
	
	private Hasta hasta;
	private Doktor doktor;
	private String ayrintilar;
		
	public Tedavi(Hasta hasta, Doktor doktor) {
		this.hasta = hasta;
		this.doktor = doktor;
	}
	
	public void setAyrintilar(String ayrintilar) {
			this.ayrintilar = ayrintilar;
		}
	
	public String getAyrintilar() {
		return ayrintilar;
	}

	public Hasta getHasta() {
		return hasta;
	}

	public Doktor getDoktor() {
		return doktor;
	}
	
	
	
	
}
