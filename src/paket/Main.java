package paket;

import java.util.Scanner;

public class Main {
	
	private  static Scanner scan=new Scanner(System.in);
	private  static   Kütüphane  kitap = new Kütüphane(); 
	
	public static void islemleri_bastir(){
		
		System.out.println("\t  0-İşlemleri görüntüle");
    	System.out.println("\t  1-Kitaplari görüntüle");
    	System.out.println("\t  2-Kitap ekle");
    	System.out.println("\t  3-Kitap güncelle");
    	System.out.println("\t  4-Kitap sil");
    	System.out.println("\t  5-Kitap ara");
    	System.out.println("\t  6-Uygulamadan çık ");
		
		
		
		
		
	}
	
	public  static void goruntule() {
		
		
		
		kitap.kitaplari_bastir();
		
		
		
	}
	
	
	public  static void kitap_ekle() {
		
		System.out.println("Eklemek istediğiniz kitap adi");
		
		String isim=scan.nextLine();
		System.out.println("Eklemek istediğiniz kitabın yazarı");
		String yazar=scan.nextLine();
		System.out.println("Eklemek istediğiniz kitabın sayfa sayısı");
		int sayfa_sayisi=scan.nextInt();
		kitap.kitap_ekle(isim,yazar,sayfa_sayisi);
		

	}
	
	public static void kitap_sil() {
		
		System.out.println("Silmek istediğiniz kitabın pozisyonunu giriniz (1,2,3)");
		int pozisyon =scan.nextInt();
		kitap.kitap_sil(pozisyon-1);
		
		
		
		
	}
	
	
	public static void kitap_guncelle() {
		
		System.out.println("Güncellemek istediğiniz pozisyon (1,2,3)");
		int pozisyon=scan.nextInt();
		scan.nextLine();
		
		String yeni_isim=scan.nextLine();
		String yeni_yazar=scan.nextLine();
		int yeni_sayfa=scan.nextInt();
		kitap.kitap_guncelle(yeni_isim, pozisyon-1,yeni_yazar,yeni_sayfa);
		
		
	}
	
	
	public static void kitap_ara() {
		
		
		System.out.println("Aramak istediğiniz kitap adı");
		
		String isim=scan.nextLine();
		kitap.kitap_ara(isim);
		
		
		
		
		
	}

	public static void main(String[] args) {
	
		
		System.out.println("Kütüphanenize hoş geldiniz");
		
		int islem;
	
		islemleri_bastir();
		
		
		while(true) {
			
			System.out.println("Bir işlem seçiniz");
			
			islem=scan.nextInt();
			scan.nextLine();
			
			
			if(islem== 0) {
				
				
				
				islemleri_bastir();
			}
			else if (islem==1) {
				
				goruntule();
				
				
				
			}
			else if(islem==2) {
				
				
				
				kitap_ekle();
				
			}
			else if (islem==3) {
				
				
				
				kitap_guncelle();
			}
			else if (islem==4) {
				
				
				kitap_sil();
			}
			else if(islem==5) {
				
				
				
				kitap_ara();
			}
			else if(islem ==6) {
				
				System.out.println("Uygulamadan çıkılıyor...");
				break;
			}
			else
				System.out.println("Geçersiz işlem");
			
			
			
			
			
		}
		
		
		
		

	}

}
