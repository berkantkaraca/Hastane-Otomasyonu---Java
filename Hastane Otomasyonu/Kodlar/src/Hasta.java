
public class Hasta extends Kisi {
	
	private int dogumYili;

	public Hasta(String isim, String TCKimlik, int dogumYili) {
		super(isim, TCKimlik);
		this.dogumYili = dogumYili;
	}

	void kisi() {
		System.out.println("Hastanýn Adý: " + getIsim());
		System.out.println("Hastanýn TC'si: " + getTCKimlik());
		System.out.println("Hastanýn Doðum Tarihi: " + dogumYili);	
	}
	
	public int getDogumYili() {
		return dogumYili;
	}

}
