package unlam.edu.pb2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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
		String nombre = "Maxi";
		Integer cuit = 112233;
		Cliente cliente1 = new Cliente(nombre, cuit , 50);
		Celular celular1 = new Celular ("Android", "111.223.456", Localidad.BUENOS_AIRES, 2333, TipoRegistro.HUELLA);
		
		cliente1.agregarDispositivo(celular1);
		
		String re = "Android";
		String ro = celular1.getSistemaOperativo();
		
		
		
		assertEquals(re, ro);
		
	}
	
	@Test
	public void queSePuedaCrearUnSistema(){
		
		Sistema sistemaActual = new Sistema();
		
		assertNotNull(sistemaActual);
		
	}
	

	
	@Test
	public void queSePuedaMonitorearUnaExtraccion() throws FraudeException{

		Sistema sistemaActual = new Sistema();
		
		Cliente cliente1 = new Cliente("Maxi", 01, 50.0);
		Celular samsungA51 = new Celular ("Android", "111.223.456", Localidad.BUENOS_AIRES, 2333, TipoRegistro.HUELLA);
		
		cliente1.agregarDispositivo(samsungA51);
		Extraccion extraccion1 = new Extraccion(cliente1 , samsungA51, 0);
		
		extraccion1.realizarExtraccion(cliente1, 25.0);
		extraccion1.monitorear(cliente1 , samsungA51);
		
		
		
		Double valorEsperado = 25.0;
		Double valorObtenido = cliente1.getFondos();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	
	@Test (expected = FraudeException.class)
	
	public void queSePuedaMonitorearUnaTranferencia() throws FraudeException  {
		
		
		Cliente cliente1 = new Cliente("Maxi", 13333, 50.0);
		Cliente cliente2 = new Cliente("Jorge", 92112, 50.0);
		Celular samsungA51 = new Celular ("Android", "111.223.456", Localidad.BUENOS_AIRES, 2333, TipoRegistro.HUELLA);
		Computadora lenovo = new Computadora ("Windows 10", "123.444.555", Localidad.CHACO);
		
		cliente1.agregarDispositivo(samsungA51);
		cliente2.agregarDispositivo(lenovo);
		
	
		
		Tranferencia tranferencia1 = new Tranferencia(cliente1, samsungA51 , cliente1, 50.0, cliente2, 0);
		
		tranferencia1.realizarTransferencia(cliente1, 50.0, cliente2);
		
		
		
		tranferencia1.monitorear();
		
		
		
		//si el score suma 40 lo considere como fraude
		System.out.println(tranferencia1.getScore());
		
	
	}

	@Test (expected = FraudeException.class)
	
	public void queSePuedaMonitorearUnPagoConQR () throws FraudeException {
		
		Cliente cliente1 = new Cliente("Maxi", 13333, 50.0);
		Cliente cliente2 = new Cliente("Jorge", 92112, 50.0);
		Celular samsungA51 = new Celular ("Android", "111.223.456", Localidad.BUENOS_AIRES, 2333, TipoRegistro.HUELLA);
	
		
		cliente1.agregarDispositivo(samsungA51);
		
		
		PagoConQR pagoQR = new PagoConQR(cliente1, samsungA51,cliente1,50.0,cliente2,0);
		
		
		pagoQR.realizarPagoConQR(cliente1, 50.0, cliente2);
		
		pagoQR.monitorear();
	}
	
	@Test
	public void queSePuedaMonitorearUnPagoDeServicio() {
		
		Cliente cliente1 = new Cliente("Maxi", 13333, 50.0);
		Cliente cliente2 = new Cliente("Jorge", 92112, 50.0);
		Celular samsungA51 = new Celular ("Android", "111.223.456", Localidad.BUENOS_AIRES, 2333, TipoRegistro.HUELLA);
	
		
		cliente1.agregarDispositivo(samsungA51);
		
		
		PagoDeServicios pagoServicios = new PagoDeServicios(cliente1, samsungA51,cliente1,50.0,cliente2,0);
		
	
			pagoServicios.realizarPagoDeServicios(cliente1, 50.0, cliente2);
			pagoServicios.monitorear();
			pagoServicios.marcarComoCasoSospechoso(cliente1);
			Integer resultadoEsperado = 1;
			Integer resultadoObtenido = pagoServicios.getCantidadDeSospechososDePagosDeServicios();
		
		assertEquals(resultadoEsperado,resultadoObtenido);
		System.out.println(pagoServicios.getScore());
			// TODO Auto-generated catch block
		
		
		
		
	}
		
	}
	



