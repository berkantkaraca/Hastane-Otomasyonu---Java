import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BilgiSistemi {
	
	List<Hasta> hastalar = new ArrayList<>();
	List<Doktor> doktorlar = new ArrayList<>();
	List<Tedavi> tedaviler = new ArrayList<>();
	
	Scanner scan = new Scanner(System.in);	
	
	public boolean hastaEkle(Hasta hasta) {
			
		boolean kontrol = false;
		
		if(hastalar.isEmpty()) {			
			hastalar.add(hasta);
			System.out.println("\nHasta Baþarýyla Eklendi.");
			System.out.println("---------------------------\n");
			kontrol = true;
		}
		else {		
			for(Hasta hastaKontrol : hastalar) {       	
	        	if(hasta.getIsim().equalsIgnoreCase(hastaKontrol.getIsim())) {
	        		kontrol = true;
	        		break;
	        	}    	       		
	        }
			
	        if(kontrol) {
	    		System.out.println("\nHasta Sistemde Mevcut. Eklenemedi!");
				System.out.println("---------------------------\n");
	    		kontrol = false;
	    	}
	    	else {
	    		hastalar.add(hasta);
	    		System.out.println("\nHasta Baþarýyla Eklendi.");
				System.out.println("---------------------------\n");    		
	    		kontrol = true;
	    	}               
		}     
        return kontrol;		
	}
	
	public Hasta hastaBul(String TCKimlik){
		
		Hasta hasta = null;
		
	
        for(Hasta hastaKontrol : hastalar) {          	
        	if( TCKimlik.equalsIgnoreCase(hastaKontrol.getTCKimlik()) ) {
        		hasta = hastaKontrol; 
        		break;
        	}    	       		
        }
        
       
        if( !(hasta == null)) {
        	System.out.println("\n  -Hasta Bilgileri-");
    		System.out.println("  Hastanýn Ýsmi: " + hasta.getIsim() + 
    							"\n  Hastanýn TC No'su: " + hasta.getTCKimlik() +
    							"\n  Hastanýn Doðum Yýlý: " + hasta.getDogumYili());   
    		System.out.println("---------------------------\n");
    	}
    	else {
    		System.out.println("\nHasta Bulunamadý!");		
    		System.out.println("---------------------------\n");
    	}               
        return hasta;       
	}			
		
	public boolean doktorEkle(Doktor doktor) {
		
		boolean kontrol = false;
		

		if(doktorlar.isEmpty()) {
			doktorlar.add(doktor);
			System.out.println("\nDoktor Baþarýyla Eklendi.");
			System.out.println("---------------------------\n");
			kontrol = true;
		}
		else {	
			
			for(Doktor doktorKontrol : doktorlar) {       	
	        	if(doktor.getIsim().equalsIgnoreCase(doktorKontrol.getIsim())) {
	        		kontrol = true;
	        		break;
	        	}    	       		
	        }
			
	        if(kontrol) {
	    		System.out.println("\nDoktor Sistemde Mevcut. Eklenemedi!");
	    		System.out.println("---------------------------\n");
	    		kontrol = false;
	    	}
	    	else {
	    		doktorlar.add(doktor);
	    		System.out.println("\nDoktor Baþarýyla Eklendi.");
	    		System.out.println("---------------------------\n");	    		
	    		kontrol = true;
	    	}               
		}     
        return kontrol;		
	}	
	
	public Doktor doktorBul(String TCKimlik) {
		
		Doktor doktor = null;
		
	
        for(Doktor doktorKontrol : doktorlar) {         	
        	if( TCKimlik.equalsIgnoreCase(doktorKontrol.getTCKimlik()) ) {
        		doktor = doktorKontrol; 
        		break;
        	}    	       		
        }
        
        if( !(doktor == null)) {
        	System.out.println("\n  -Doktor Bilgileri-");
    		System.out.println("  Doktorun Ýsmi: " + doktor.getIsim() + 
    							"\n  Doktorun TC No'su: " + doktor.getTCKimlik() +
    							"\n  Doktorun Diploma Notu: " + doktor.getDiplomaNo());    
    		System.out.println("---------------------------\n");
    	}
    	else {
    		System.out.println("\nDoktor Bulunamadý!");		
    		System.out.println("---------------------------\n");
    	}               
        return doktor;
	}
		
	public void tedaviEkle(Hasta hasta, Doktor doktor) {
			
		Tedavi tedavi = new Tedavi(hasta, doktor); 
		boolean kontrol = false;
		
		System.out.print("Tedavinin Ayrýntýlarýný Girin: ");
		tedavi.setAyrintilar(scan.nextLine());
		
		
		if(tedaviler.isEmpty()) {		
			tedaviler.add(tedavi);						
			System.out.println("\nTedavi Baþarýyla Eklendi.");
			System.out.println( hasta.getIsim() + 
								" Ýsimli Hastaya, Doktor " + 
								doktor.getIsim() + 
								" Tarafýndan " + 
								tedavi.getAyrintilar() + 
								" Uygulanacak" );
			System.out.println("---------------------------\n");		
		}
		else {	
			
			for(Tedavi tedaviKontrol : tedaviler) {       	
	        	if(tedavi.getAyrintilar().equalsIgnoreCase(tedaviKontrol.getAyrintilar())) {
	        		kontrol = true;
	        		break;
	        	}    	       		
	        }
			
	        if(kontrol) {
	    		System.out.println("\nTedavi Sistemde Mevcut. Eklenemedi!");
	    		System.out.println( hasta.getIsim() + 
									" Ýsimli Hastaya, Doktor " + 
									doktor.getIsim() + 
									" Tarafýndan " + 
									tedavi.getAyrintilar() + 
									" Uygulanacak" );
	    		System.out.println("---------------------------\n");
	    	}
	    	else {
				tedaviler.add(tedavi);
				System.out.println("\nTedavi Baþarýyla Eklendi.");
				System.out.println( hasta.getIsim() + 
									" Ýsimli Hastaya, Doktor " + 
									doktor.getIsim() + 
									" Tarafýndan " + 
									tedavi.getAyrintilar() + 
									" Uygulanacak" );
				System.out.println("---------------------------\n");	    		
	    	}
		}	
	}	
}