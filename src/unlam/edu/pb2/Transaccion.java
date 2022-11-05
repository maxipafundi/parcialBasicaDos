package unlam.edu.pb2;

import java.util.Set;

public abstract class Transaccion {

	private Integer numeroTransaccion;
	protected Cliente cliente;
	protected Dispositivo dispositivo;

	public Transaccion(Cliente cliente, Dispositivo dispositivo) {
		super();
		this.cliente = cliente;
		this.dispositivo = dispositivo;
		
	}

	public Integer getNumeroTransaccion() {
		return numeroTransaccion;
	}

	public void setNumeroTransaccion(Integer numeroTransaccion) {
		this.numeroTransaccion = numeroTransaccion;
	}

	public Boolean monitorear(Set<Denunciable> listaNegra) throws FraudeException {
		// TODO Auto-generated method stub
		return null;
	}

	public Dispositivo getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void marcarComoCasoSospechoso(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
