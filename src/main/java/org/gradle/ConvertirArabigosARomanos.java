package org.gradle;

public class ConvertirArabigosARomanos {

	public String descomponerNumerArabigo(int numeroArabigo, String par1, String par2, String par3 ) {
		String numeroRomano="";
		if (numeroArabigo >0 && numeroArabigo < 4) {
			numeroRomano = repetirCaracter(par1,numeroArabigo);
			return numeroRomano;
		}
		if (numeroArabigo == 4) {
			return par1+par2;
		}
		
		if (numeroArabigo >4 && numeroArabigo < 9) {
			int restaRepetir = numeroArabigo - 5;
			numeroRomano = par2 + repetirCaracter(par1,restaRepetir);
			return numeroRomano;
		}
		
		if (numeroArabigo == 9) {
			return par1+par3;
		}
		
		return "";
	}

	
	private String repetirCaracter(String string, int numeroArabigo) {
		String caracterRepetido="";
		for (int i = 0; i < numeroArabigo; i++) {
			caracterRepetido += string;
		}
		return caracterRepetido;
	}
	
	public String descomponerNumerArabigo(int numeroArabigo) {
		String resultado="";
		int unidades = numeroArabigo % 10;
		int descenas =numeroArabigo/10;
		if (descenas >10) {
			descenas = descenas % 10;
		}
		int centenas = numeroArabigo/100;
		if (centenas>10) {
			centenas = centenas % 10;
		}
		int millares = numeroArabigo/1000;
		
		return resultado = descomponerNumerArabigo(millares,"M","","") + descomponerNumerArabigo(centenas,"C","D","M") + descomponerNumerArabigo(descenas,"X","L","C") + descomponerNumerArabigo(unidades,"I","V","X");
		
	}
	
	

}
