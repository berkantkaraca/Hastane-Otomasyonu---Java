
import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);	
	static BilgiSistemi bs = new BilgiSistemi();
	
	static public void hastaMenu() {
		
		boolean kontrol = true;
		
		do {			
			System.out.println( "----HASTA ��LEM SAYFASI----\n" + 
								"   1.Hastay� Ekle\n" +
								"   2.Hastay� Bul\n" +
								"   3.Ana Sayfaya D�n" );
			System.out.print("\n��leminiz Se�in: ");
			int secim = scan.nextInt();		
			System.out.println("---------------------------\n");			
		
			switch(secim) {
			
				case 1:
					System.out.println("----HASTA EKLEME SAYFASI---");					
					
					System.out.print("Hastan�n �smini Girin: ");
					String isim = scan.next();
					scan.nextLine();
					
					System.out.print("Hastan�n TC Kimlik No'sunu Girin: ");
					String TCNo = scan.next();
					
					System.out.print("Hastan�n Do�um Y�l�n� Girin: ");
					int dogum = scan.nextInt();
					
					Hasta hasta = new Hasta(isim, TCNo, dogum);				
					bs.hastaEkle(hasta);
					
					kontrol = true;
					break;
									
				case 2:
					System.out.println("----HASTA BULMA SAYFASI----");
					scan.nextLine();
					
					System.out.print("Hastan�n TC Kimlik No'sunu Girin: ");
					String TCNoArama  = scan.nextLine();
					
					bs.hastaBul(TCNoArama);				
					kontrol = true;
					break;	
					
				case 3:			
					kontrol = false;			
					break;
			}			
		}while(kontrol);	
	}
	
	static public void doktorMenu() {
		
		boolean kontrol = true;
			
		do {
			System.out.println( "----DOKTOR ��LEM SAYFASI---\n" + 
								"   1.Doktoru Ekle\n" +
								"   2.Doktoru Bul\n" +
								"   3.Ana Sayfaya D�n" );
			System.out.print("\n��leminiz Se�in: ");
			int secim = scan.nextInt();			
			System.out.println("---------------------------\n");			
			
			switch(secim) {		
				case 1:
					System.out.println("---DOKTOR EKLEME SAYFASI---");
					
					System.out.print("Doktorun �smini Girin: ");
					String isim = scan.next();
					scan.nextLine();
					
					System.out.print("Doktorun TC Kimlik No'sunu Girin: ");
					String TCNo = scan.next();
					
					System.out.print("Doktorun Diploma Notunu Girin: ");
					int diploma = scan.nextInt();
					
					Doktor doktor = new Doktor(isim, TCNo, diploma);
					bs.doktorEkle(doktor);					
					kontrol = true;
					break;
									
				case 2:
					System.out.println("----DOKTOR BULMA SAYFASI---");
					scan.nextLine();

					System.out.print("Doktorun TC Kimlik No'sunu Girin: ");				
					String TCNoArama  = scan.nextLine();
					
					bs.doktorBul(TCNoArama);
					kontrol = true;
					break;		
					
				case 3:			
					kontrol = false;			
					break;
			}		
		}while(kontrol);	
	}
	
	static public void tedaviMenu() {

		boolean kontrol = true;
			
		do {
			System.out.println( "----TEDAV� ��LEM SAYFASI---\n" + 
								"   1.Tedavi Ekle\n" +
								"   2.Ana Sayfaya D�n" );
			System.out.print("\n��leminiz Se�in: ");
			int secim = scan.nextInt();		
			System.out.println("---------------------------\n");
			
			switch(secim) {		
			
				case 1:
					Hasta hasta = null;
					Doktor doktor = null;					 
					String hastaTC;
					String doktorTC;
					System.out.println("---TEDAV� EKLEME SAYFASI---");
				
					System.out.print("Hastan�n TC No'sunu Girin: ");
					hastaTC = scan.next();
					
					for(Hasta hastaKontrol : bs.hastalar) {  		        	
			        	if( hastaTC.equalsIgnoreCase(hastaKontrol.getTCKimlik()) ) {
			        		hasta = hastaKontrol; 
			        		break;
			        	}    	       		
			        }
					
					System.out.print("Doktorun TC No'sunu Girin: ");
					doktorTC = scan.next();
					
					for(Doktor doktorKontrol : bs.doktorlar) {  				        	
			        	if( doktorTC.equalsIgnoreCase(doktorKontrol.getTCKimlik()) ) {
			        		doktor = doktorKontrol; 
			        		break;
			        	}    	       		
				    }				
					 
					bs.tedaviEkle(hasta, doktor);
					kontrol = true;
					break;
					
				case 2:
					kontrol = false;			
					break;
			}		
		}while(kontrol);			
	}
	
		
	public static void main(String[] args) {
		int secim;
	
		do {
			System.out.print( "---------ANA SAYFA---------\n" + 
								"   1.Hasta ��lemleri\n" +
								"   2.Doktor ��lemleri\n" +
								"   3.Tedavi ��lemleri\n" +
								"   4.Program� Kapat\n" );
			System.out.print("\n��leminiz Se�in: ");
			secim = scan.nextInt();	
			System.out.println("---------------------------\n");
			
			switch(secim) {
		
				case 1:
					hastaMenu();
					break;
				
				case 2:
					doktorMenu();
					break;
					
				case 3:
					tedaviMenu();
					break;
					
				case 4:
					scan.close();
					System.out.print("Program Kapan�yor...");
					System.exit(0);
					break;		
			}			
		}while(true); 		
	}
}