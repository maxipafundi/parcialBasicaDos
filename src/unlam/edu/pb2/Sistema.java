package unlam.edu.pb2;

import java.util.ArrayList;
import java.util.HashSet;

public class Sistema  {

	private HashSet<Cliente> clientes = new HashSet <>();
	private ArrayList <Transaccion> transacciones = new ArrayList <>();
	private HashSet <Cliente> listaNegra = new HashSet<>();
	
	
	public void agregarClienteAlSistema(Cliente cliente){
		this.clientes.add(cliente);
	}
	
	public Integer getCantidadClientesSistema(){
		return this.clientes.size();
	}

	
	

	
	
		
	}
	
	
	

