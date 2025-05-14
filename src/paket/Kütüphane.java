package paket;

import java.util.ArrayList;

public class Kütüphane {
	
	private ArrayList<String> kutuphane= new ArrayList<String>();
	private ArrayList<String> kitap_yazar= new ArrayList<String>();
	private ArrayList<Integer> sayfa_sayisi=new ArrayList<Integer>();
	
	
	public void kitaplari_bastir() {
		
		
	
		if(kutuphane.size()==0 && kitap_yazar.size()==0 && sayfa_sayisi.size()==0) {
			
			System.out.println("Kütüphanenizde herhangi bir kitap bulunmuyor");
		}
		else {
		for(int i=0;i<kutuphane.size();i++) {
			
			System.out.println((i+1)+".Kitap: "+kutuphane.get(i)+" -Yazarı: "+kitap_yazar.get(i)+" -Sayfa sayısı:"+sayfa_sayisi.get(i));
		}
		}
			
			
			
			
		}
	public void kitap_ekle(String isim,String yazar,int s_sayisi) {
		
		kutuphane.add(isim);
		kitap_yazar.add(yazar);
		sayfa_sayisi.add(s_sayisi);
		System.out.println("Kitaplığa eklendi");
	
		
	}
		
	public void kitap_guncelle(String yeni_isim,int pozisyon,String yeni_yazar,int yeni_s_sayisi) {
	
	kutuphane.set(pozisyon, yeni_isim);
	kitap_yazar.set(pozisyon, yeni_yazar);
	sayfa_sayisi.set(yeni_s_sayisi, yeni_s_sayisi);
	System.out.println("Kütüphaneniz güncellendi");
	
	}
	
	public void kitap_sil(int pozisyon) {

		
		String isim=kutuphane.get(pozisyon);
		
		kutuphane.remove(pozisyon);
		kitap_yazar.remove(pozisyon);
		sayfa_sayisi.remove(pozisyon);
		System.out.println(isim+" li kitap kütüphanden silindi");

		
	}
	
	public void kitap_ara(String kitap_ismi) {
		
		int pozisyon=kutuphane.indexOf(kitap_ismi);
		
	if(pozisyon>=0) {
		
	// bu sayede kitabımızın arraylistimizde bulunup bulunmadığını kontrol ediyoruz	
	
		System.out.println("Kitap bulundu");
		System.out.println(kitap_ismi+"isimli kitap"+(pozisyon+1)+"Konumunda");
	}	
	else {
		
		System.out.println("Böyle bir kitap kütüphanenizde bulunmuyor");
	}
		
		
		
		
	}
	
	

}
