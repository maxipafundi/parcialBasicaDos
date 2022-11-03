package unlam.edu.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

	@Test
	public void queSePuedaCrearUnCliente() {
		
		String nombre = "Maxi";
		Integer cuit = 112233;
		
		Cliente cliente1 = new Cliente(nombre, cuit , 50);
		
		Integer re = 112233;
		Integer ro = cliente1.getCuil();
		
		assertEquals(re, ro);
	}
	
	@Test
	public void queSePuedaCrearUnDispositivo(){
		
		Dispositivo dispositivo1 = new Dispositivo("Samsung");
		
		String re = "Samsung";
		String ro = dispositivo1.getMarca();
		
		assertEquals(re, ro);
		
	}
	
	@Test
	public void queSePuedaCrearUnSistema(){
		
		Sistema sistemaActual = new Sistema();
		
		assertNotNull(sistemaActual);
		
	}
	

	
	@Test
	public void queSePuedaMonitorearUnaTranferencia(){

		Sistema sistemaActual = new Sistema();
		

		
		Cliente cliente1 = new Cliente("Maxi", 01, 50);
		Celular celular1= new Celular ("Lg",124,TipoRegistro.HUELLA);
		Tranferencia tranferencia = new Tranferencia(01 , 0 , 50);
		
		
		
		cliente1.realizarTransaccion(tranferencia);
		celular1.realizarTransaccion(tranferencia);
		
			
		
	}
}


