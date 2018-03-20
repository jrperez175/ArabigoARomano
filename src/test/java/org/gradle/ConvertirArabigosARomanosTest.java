package org.gradle;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class ConvertirArabigosARomanosTest {
	
	public ConvertirArabigosARomanos convertirArabigosARomanos;
	
	@Before
	public void setup() {
		convertirArabigosARomanos = new ConvertirArabigosARomanos();
	}
	
	@Test
	public void ingresoArabigo1yRetornoRomanoI(){
	//Arrange
	int numeroArabigo = 1;
	
	//Act
	
	String resultado = convertirArabigosARomanos.descomponerNumerArabigo(numeroArabigo);
	
	//Assert
	assertEquals(resultado,"I");
	}
	
	@Test
	public void ingresoArabigo2yRetornoRomanoII(){
	//Arrange
	int numeroArabigo = 2;
	
	//Act
	
	String resultado = convertirArabigosARomanos.descomponerNumerArabigo(numeroArabigo);
	
	//Assert
	assertEquals(resultado,"II");
	}
	
	@Test
	public void ingresoArabigo3yRetornoRomanoIII(){
	//Arrange
	int numeroArabigo = 3;
	
	//Act
	
	String resultado = convertirArabigosARomanos.descomponerNumerArabigo(numeroArabigo);
	
	//Assert
	assertEquals(resultado,"III");
	}
	
	@Test
	public void ingresoArabigo4yRetornoRomanoIV(){
	//Arrange
	int numeroArabigo = 4;
	
	//Act
	
	String resultado = convertirArabigosARomanos.descomponerNumerArabigo(numeroArabigo);
	
	//Assert
	assertEquals(resultado,"IV");
	}
	
	@Test
	public void ingresoArabigo5yRetornoRomanoV(){
	//Arrange
	int numeroArabigo = 5;
	
	//Act
	
	String resultado = convertirArabigosARomanos.descomponerNumerArabigo(numeroArabigo);
	
	//Assert
	assertEquals(resultado,"V");
	}
	
	@Test
	public void ingresoArabigo6yRetornoRomanoVI(){
	//Arrange
	int numeroArabigo = 6;
	
	//Act
	
	String resultado = convertirArabigosARomanos.descomponerNumerArabigo(numeroArabigo);
	
	//Assert
	assertEquals(resultado,"VI");
	}
	
	@Test
	public void ingresoArabigo7yRetornoRomanoVII(){
	//Arrange
	int numeroArabigo = 7;
	
	//Act
	
	String resultado = convertirArabigosARomanos.descomponerNumerArabigo(numeroArabigo);
	
	//Assert
	assertEquals(resultado,"VII");
	}
	
	@Test
	public void ingresoArabigo8yRetornoRomanoVIII(){
	//Arrange
	int numeroArabigo = 8;
	
	//Act
	
	String resultado = convertirArabigosARomanos.descomponerNumerArabigo(numeroArabigo);
	
	//Assert
	assertEquals(resultado,"VIII");
	}
	
	@Test
	public void ingresoArabigo9yRetornoRomanoIX(){
	//Arrange
	int numeroArabigo = 9;
	
	//Act
	
	String resultado = convertirArabigosARomanos.descomponerNumerArabigo(numeroArabigo);
	
	//Assert
	assertEquals(resultado,"IX");
	}

	@Test
	public void ingresoArabigo10yRetornoRomanoX(){
	//Arrange
	int numeroArabigo = 10;
	
	//Act
	
	String resultado = convertirArabigosARomanos.descomponerNumerArabigo(numeroArabigo);
	
	//Assert
	assertEquals(resultado,"X");
	}
	
	@Test
	public void ingresoArabigo11yRetornoRomanoXI(){
	//Arrange
	int numeroArabigo = 11;
	
	//Act
	
	String resultado = convertirArabigosARomanos.descomponerNumerArabigo(numeroArabigo);
	
	//Assert
	assertEquals(resultado,"XI");
	}
	
	
	@Test
	public void ingresoArabigo18yRetornoRomanoXVIII(){
	//Arrange
	int numeroArabigo = 18;
	
	//Act
	
	String resultado = convertirArabigosARomanos.descomponerNumerArabigo(numeroArabigo);
	
	//Assert
	assertEquals(resultado,"XVIII");
	}
	
	@Test
	public void ingresoArabigo90yRetornoRomanoXC(){
	//Arrange
	int numeroArabigo = 90;
	
	//Act
	
	String resultado = convertirArabigosARomanos.descomponerNumerArabigo(numeroArabigo);
	
	//Assert
	assertEquals(resultado,"XC");
	}
	
	@Test
	public void ingresoArabigo99yRetornoRomanoXCIX(){
	//Arrange
	int numeroArabigo = 99;
	
	//Act
	
	String resultado = convertirArabigosARomanos.descomponerNumerArabigo(numeroArabigo);
	
	//Assert
	assertEquals(resultado,"XCIX");
	}
	
	@Test
	public void ingresoArabigo100yRetornoRomanoC(){
	//Arrange
	int numeroArabigo = 100;
	
	//Act
	
	String resultado = convertirArabigosARomanos.descomponerNumerArabigo(numeroArabigo);
	
	//Assert
	assertEquals(resultado,"C");
	}
	
	@Test
	public void ingresoArabigo149yRetornoRomanoCXLIX(){
	//Arrange
	int numeroArabigo = 149;
	
	//Act
	
	String resultado = convertirArabigosARomanos.descomponerNumerArabigo(numeroArabigo);
	
	//Assert
	assertEquals(resultado,"CXLIX");
	}
	
	@Test
	public void ingresoArabigo545yRetornoRomanoDXLV(){
	//Arrange
	int numeroArabigo = 545;
	
	//Act
	
	String resultado = convertirArabigosARomanos.descomponerNumerArabigo(numeroArabigo);
	
	//Assert
	assertEquals(resultado,"DXLV");
	}
	
	@Test
	public void ingresoArabigo3000yRetornoRomanoMMM(){
	//Arrange
	int numeroArabigo = 3000;
	
	//Act
	
	String resultado = convertirArabigosARomanos.descomponerNumerArabigo(numeroArabigo);
	
	//Assert
	assertEquals(resultado,"MMM");
	}
	
	@Test
	public void ingresoArabigo3500yRetornoRomanoMMMD(){
	//Arrange
	int numeroArabigo = 3500;
	
	//Act
	
	String resultado = convertirArabigosARomanos.descomponerNumerArabigo(numeroArabigo);
	
	//Assert
	assertEquals(resultado,"MMMD");
	}
}
