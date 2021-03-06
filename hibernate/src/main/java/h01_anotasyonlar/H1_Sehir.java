package h01_anotasyonlar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;



//================================================================
//HIBERNATE ICIN TABLO TANIMLAMASININ YAPILMASI 
//tablo oluşturabilmek için içerik hazırlama )alttakiler)
//POJO: Plain Old Java Object									
//1) Private degiskenler tanimlanir.
//2) constructor olusturulur.
//3) Getter ve Setter metotlar tanimlanir.
//4) toString() metodu ile nesne yazdirilabilir hale getirilir.
//================================================================
/*
	Bir Class Hibernate ile tablo olusturmada kullanilacaksa degiskenlerin
	“final” veya “static” tanimlanMAMAsi gerekir. 
*/
//- @Entity anotasyonu bu class’ın bir tabloya donusturulmesi
//gerektigini Hibernate’e gosterir.(sql ortamına mapping yapıo uyarlıo,translate)
//Her bir degisken bir sutun olacaktir.
//- @Table annotasyonu tablo adinin degistirilmesini saglar.javada ve sql deki isimler aynı olmak zorunda değil
//- @Id anotasyonu tablo icerisinde primary key olusturur.
//- @Transient anotasyonu bir degiskenin (sutun) tabloda yer almayacagini gosterir.



@Entity  // alttaki class ismiyle table oluşturuyor
@Table(name="sehir_tablosu") // zorunda değilim , yaparsam sql'deki ismini vermiş olurum.
class H1_Sehir {
	
	@Id // Bu sütun Primary Key oldu anlamına geliyor (not null + unique)
	@Column(name="sehir_plaka") // bu şart değil sadece sql'deki adını değiştirmek istersek sql'deki ismini değiştirdik.
	private int sehirPlaka; // Bu şehir tablomuzun ilk sütunu oluyor. run edersem mySQL'de tablo ve bu kolon oluşacak.
	
	private String sehirAdi;
	
	private int sehirNufus;
	
	@Transient // Bu sütun tabloda ye almayacak, Javada Kullanabiliriz ama SQL'deki tabloda görünmez eklenmez.
	private String adres;
	
	

	public H1_Sehir(int sehirPlaka, String sehirAdi, int sehirNufus) {
		super();
		this.sehirPlaka = sehirPlaka;
		this.sehirAdi = sehirAdi;
		this.sehirNufus = sehirNufus;
		
	}
	

	public H1_Sehir() {
		
	}


	public int getSehirPlaka() {
		return sehirPlaka;
	}


	public void setSehirPlaka(int sehirPlaka) {
		this.sehirPlaka = sehirPlaka;
	}


	public String getSehirAdi() {
		return sehirAdi;
	}


	public void setSehirAdi(String sehirAdi) {
		this.sehirAdi = sehirAdi;
	}


	public int getSehirNufus() {
		return sehirNufus;
	}


	public void setSehirNufus(int sehirNufus) {
		this.sehirNufus = sehirNufus;
	}



	

	@Override
	public String toString() {
		return "H1_Sehir [sehirPlaka=" + sehirPlaka + ", sehirAdi=" + sehirAdi + ", sehirNufus=" + sehirNufus + "]";
	}





	
	
	
	

	
	
	

	
	
	
	
}
