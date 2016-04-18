package ar.edu.unlam.tp1;

import org.junit.Test; 

import static org.junit.Assert.*;



public class CirculoTest {

	@Test
	public void crearcirculoConRadio2(){
	  
	Circulo micirculo1=new Circulo(2.0);
	   
	   assertEquals(2.0,micirculo1.getRadio(),0.01);
   }
@Test
public void  crearUnCirculoConRadio3Punto7(){
	
	Circulo micirculo2=new Circulo(3.7);
	
	assertEquals(3.7,micirculo2.getRadio(),0.01);
}
@Test
public void crearUnCirculoConRadio5(){
	
	Circulo micirculo3=new Circulo();
	
	assertEquals(5.0,micirculo3.getRadio(),0.01);
}
@Test
public void crearUnCirculoConRadio10Punto9(){
	
	Circulo micirculo4=new Circulo(10.9);
    
	assertEquals(10.9,micirculo4.getRadio(),0.01);
}
@Test 
public void queElAreaDeUnCirculoConRadio9Punto8es615Punto73(){
	
	Circulo micirculo5=new Circulo(9.8);
	
	assertNotEquals(615.73,micirculo5.carcularArea(),0.01);
   
	assertEquals(301.71,micirculo5.carcularArea(),0.01);
}
@Test
public void queElAreaDeUnCirculoConRadio16Punto6es865Punto69(){
	
	Circulo micirculo6= new Circulo(16.6);
	
	assertEquals(865.69,micirculo6.carcularArea(),0.01);

}
@Test
public void elPerimetroDeUncirculoConRadio9Punto8es615Punto73(){
 
	Circulo micirculo7=new Circulo(9.8);
	
  assertNotEquals(615.73,micirculo7.calcularPerimetro(),0.01);
	 
	assertEquals(61.57,micirculo7.calcularPerimetro(),0.01);
}

@Test 
public void elPerimetroDeUnCirculoConRadio16Punto6es865Punto67(){
	
	Circulo micirculo8=new Circulo(16.6);
    
	assertNotEquals(865.67,micirculo8.calcularPerimetro(),0.01);
	
	assertEquals(104.30,micirculo8.calcularPerimetro(),0.01);
}
	
	
}
