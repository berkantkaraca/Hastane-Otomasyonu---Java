
public class Hasta extends Kisi {
	
	private int dogumYili;

	public Hasta(String isim, String TCKimlik, int dogumYili) {
		super(isim, TCKimlik);
		this.dogumYili = dogumYili;
	}

	void kisi() {
		System.out.println("Hastan�n Ad�: " + getIsim());
		System.out.println("Hastan�n TC'si: " + getTCKimlik());
		System.out.println("Hastan�n Do�um Tarihi: " + dogumYili);	
	}
	
	public int getDogumYili() {
		return dogumYili;
	}

}
