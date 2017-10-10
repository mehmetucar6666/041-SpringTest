package com.mehmetucar.memur;

//Öğretmen memur gurubuna girdiği için
//Memur interface'ini implement ettik.
//Burada Memur inteface'ini implement
//etmemizin sebebi Öğretmen her zaman 
//Memur grubuna girer.

public class Ogretmen implements Memur {
	
	// Her Öğretmenin farklı farklı
	// görevleri olur bunun için
	// Gorev interface'ini enjekte 
	// etmemiz gerekir. Her Polis'in
	// görevi aynı olsaydı biz o zaman 
	// Polis sınıfına Gorev interface'ini
	// enjekte yerine implement ederdik.
	// Her Öğretmen aynı görevi yapmadığı
	// için Gorev interface'ini enjekte
	// etmemiz gerekir.
	
	// Enjekte
	private Gorev gorev;
	
	//--------------------------------
	
	public Ogretmen(Gorev gorev) {
		this.gorev = gorev;
	}
	
	//---------------------------------
	
	@Override
	public void calis() {
		gorev.gorevVer();
	}

}
