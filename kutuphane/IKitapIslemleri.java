package kutuphane;

public interface IKitapIslemleri {
	
	//object olusturamiyoruz.
	void kitapEkle(Kitap kitap);
	void kitapSil(int id);
	void kitapGuncelle(int id,Kitap kitap);
	void tumKitaplar();

	
	
}
