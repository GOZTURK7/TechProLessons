package h04_OneToMany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class H4_Fetch {

	public static void main(String[] args) {

		
		
		
		Configuration con = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(H1_Ogrenci.class).
				addAnnotatedClass(H2_Kitap.class);
		
		SessionFactory  sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		
		
		
// 		id = 111 olan ogrencinin tüm kitaplarını listele
		
//		
//		H1_Ogrenci ogrenci = session.get(H1_Ogrenci.class, 111);
//		
//		for (H2_Kitap each : ogrenci.getKitapListesi()) {
//			
//			System.out.println(each);
//			
//		}
		
		
		
		
		
//		// id=50 olan kitap'ın sahibinin bilgilerini listele;
//		
//		H2_Kitap kitap = session.get(H2_Kitap.class, 50);
//		
//		System.out.println(kitap.getOgrenci());
//		
//		
//		
//		
//		// kitaplar ve ogrenciler tablolarındaki ortak olan ogrenci bilgilerini listeleyiniz;
//		
//		
//		String sorgu = "select o.ogrAd, k.isim "
//				+ "from H1_Ogrenci o inner join H2_Kitap k on o.ogrId=k.ogrenci";
//		
//		
//		List<Object[]> liste =  session.createQuery(sorgu).getResultList();
//		
//		liste.forEach(t->System.out.println(Arrays.toString(t)));
//		
//		
//		
//		
//		// silme işlemi
//		// parent'ı silince child'da silinecek.
//		
//		
//		session.delete(session.get(H1_Ogrenci.class, 111));
////		
////		System.out.println("Slindi....");
////		
		
		
		
		// HQL İLE TÜM KİTAPLARI SİLELİM;
		
		//int sayi = session.createQuery("delete from H2_Kitap").executeUpdate(); // executeUpdate sayesinde silince kaç satır sildiğini return edecek
		
		//System.out.println(sayi + " KİTAP SİLİNDİ .... ");
		
		//--------------------------------------------------------------------------
				//  LAZY FETCH VS EAGER FETCH  
				//------------------------------------------------------------------------
				
				/* 
				 *  Hibernate veritabanından verileri cekerken AC GOZLU(EAGER) veya TEMBEL(LAZY) olabilmektedir. 
				 *  EAGER Fetch isleminde bir tablodan veri cekilmesi istendiginde Hibernate o tablo ile iliskili
				 *  Tum tablolari da getirir. 
				 *  
				 *  Eger LAZY fetch islemi kullanilirsa sadece istenilen tablonun verileri getirilir. 
				 * 
				 *  2 yontemin de avantajlari ve dezavatanjlari vardir. Tercih, uygulanin gereksinimlerine gore belirlenir.  
				 * 
				 *  LAZY fetch gereksiz verilerin cekilmemesini saglamak icin ve daha dusuk bellek kullanimi icin daha elvereslidir. 
				 *  Ancak, zamana duyarlı uygulamalarda problem olusturuabilir. iliskili verilerin tek tek veritabnindan getirilmesi
				 *  zaman kayıolarina yol acabilir. 
				 * 
				 *  EAGER fetch ise bazen kullanimayacak veriler bastan pesin pesin getirilmesine yol acabilir.
				 *   
				 *   */
				
		 
				//System.out.println(session.get(H1_Ogrenci.class, 333));
		
		
		
		tx.commit();
		sf.close();
		session.close();
		
		
	}

}
