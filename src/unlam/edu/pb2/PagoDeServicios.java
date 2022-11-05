package unlam.edu.pb2;

import java.util.HashSet;

public class PagoDeServicios extends TransaccionesMonetarias implements Alertable {

	
	private Integer score = 0;
	private Cliente clienteOrigen;
	private Double saldoDeLaTransferencia;
	private Cliente clienteDestino;
	private HashSet <Cliente> sospechosos = new HashSet<>();
	
	public PagoDeServicios(Cliente cliente, Dispositivo dispositivo , Cliente clienteOrigen, Double saldoDeLaTransferencia, Cliente clienteDestino, Integer score) {
		super(cliente, dispositivo);
		this.clienteOrigen = clienteOrigen;
		this.saldoDeLaTransferencia = saldoDeLaTransferencia;
		this.clienteDestino = clienteDestino;
		this.score = score;
	}


	public void realizarPagoDeServicios(Cliente clienteOrigen, Double dineroAPagar, Cliente clienteDestino) {
		 
		if(clienteOrigen.getFondos()>=dineroAPagar) {
			Double dineroEnLaCuentaOrigen = clienteOrigen.getFondos() - dineroAPagar;
			clienteOrigen.setFondos(dineroEnLaCuentaOrigen);
			clienteDestino.setFondos(dineroEnLaCuentaOrigen + clienteDestino.getFondos());
		}
	}
	
	@Override
	public Boolean monitorear() {
		if(calcularScore()>0) {
		return true;
		}
		return false; 
		
		
		
	}

	public Integer calcularScore() {
		if(cliente.getFondos()==0.0) {
			this.score +=10;
		} return getScore();
	}
	

	public Integer getScore() {
		return score;
	}

	
	@Override
	public void confirmarSiFueFraude(Boolean fueFraude) {
		// TODO Auto-generated method stub
		
	}

	public void marcarComoCasoSospechoso(Cliente cliente) {
		this.sospechosos.add(cliente);
	}
	
	public Integer getCantidadDeSospechososDePagosDeServicios() {
		return this.sospechosos.size();
	}
	
	
}
