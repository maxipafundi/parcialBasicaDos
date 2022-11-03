package unlam.edu.pb2;

import java.util.ArrayList;

public class Dispositivo {

	private String marca;
	private ArrayList <Transaccion> transacciones ;

	public Dispositivo(String marca) {
		super();
		this.marca = marca;
		this.transacciones =  new ArrayList <>();
	}

	
	public void realizarTransaccion(Transaccion transaccion){
		this.transacciones.add(transaccion);
		
	}
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}




	
	
	
	
	
	
}
