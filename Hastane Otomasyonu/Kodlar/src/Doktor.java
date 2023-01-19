
public class Doktor extends Kisi{
	
	private int diplomaNo;

	public Doktor(String isim, String TCKimlik, int diplomaNo) {
		super(isim, TCKimlik);
		this.diplomaNo = diplomaNo;
	}
	
	void kisi() {
		System.out.println("Doktorun Adý: " + getIsim());
		System.out.println("Doktorun TC'si: " + getTCKimlik());
		System.out.println("Doktorun Diploma Notu: " + diplomaNo);
	}
	
	public int getDiplomaNo() {
		return diplomaNo;
	}
}
