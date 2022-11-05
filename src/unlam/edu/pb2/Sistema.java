package unlam.edu.pb2;

import java.util.ArrayList;
import java.util.HashSet;

public  class Sistema {

	private HashSet<Cliente> clientes = new HashSet <>();
	private ArrayList <Monitoreable> transaccionesMonitoreables = new ArrayList <>();
	private ArrayList<Denunciable> listaNegra= new ArrayList<Denunciable> ();
	
	


	
	public void agregarALaListaNegra(Denunciable denunciable, Monitoreable transaccion) {
		listaNegra.add(denunciable);
		this.transaccionesMonitoreables.add(transaccion);
		
	}

	public void agregarALalistaNegra(Cliente clienteParaAgregar) {
		listaNegra.add(clienteParaAgregar);
	}
	
	
	
	public void agregarClienteAlSistema(Cliente cliente){
		this.clientes.add(cliente);
	}
	
	public Integer getCantidadClientesSistema(){
		return this.clientes.size();
	}

	
	

	

	
	
		
	}
	
	
	

