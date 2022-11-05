package unlam.edu.pb2;

import java.util.Set;

public abstract class TransaccionesMonetarias extends Transaccion implements Monitoreable {

	

	public TransaccionesMonetarias(Cliente cliente, Dispositivo dispositivo) {
		super(cliente, dispositivo);
		// TODO Auto-generated constructor stub
	}

	

	public Boolean monitorear(Cliente cliente , Dispositivo dispositivo) throws FraudeException {
		// TODO Auto-generated method stub
		return null;
	}

	public void marcarComoCasoSospechoso() {
		// TODO Auto-generated method stub
		
	}

	public Boolean monitorear(Set<Denunciable> listaNegra) throws FraudeException {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

	
	
	


	

	
	
	

}
