
public abstract class Kisi{

	private String isim;
	private String TCKimlik;

	public Kisi(String isim, String TCKimlik) {	
		this.isim = isim;
		this.TCKimlik = TCKimlik;
	}
	
	abstract void kisi();
	
	public String getIsim() {
		return isim;
	}

	public String getTCKimlik() {
		return TCKimlik;
	}
}
