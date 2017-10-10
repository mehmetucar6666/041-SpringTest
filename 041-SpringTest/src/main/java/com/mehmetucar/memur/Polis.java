package com.mehmetucar.memur;


// Polis de memur gurubuna girdiği için
// Memur interface'ini implement ettik.
// Burada Memur inteface'ini implement
// etmemizin sebebi Polis her zaman 
// Memur grubuna girer.

public class Polis implements Memur {
	
	// Her Polisin farklı farklı
	// görevleri olur bunun için
	// Gorev interface'ini enjekte 
	// etmemiz gerekir. Her Polis'in
	// görevi aynı olsaydı biz o zaman 
	// Polis sınıfına Gorev interface'ini
	// enjekte yerine implement ederdik.
	// Her Öğretmen aynı görevi yapmadığı
	// için Gorev interface'ini implement
	// edeceğiz.
	
	private Gorev gorev;
	
	//--------------------------------
	
	public Polis(Gorev gorev) {
		this.gorev = gorev;
	}
	
	//--------------------------------
	
	@Override
	public void calis() {
		gorev.gorevVer();
	}

}
