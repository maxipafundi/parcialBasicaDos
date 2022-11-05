package unlam.edu.pb2;

import java.util.ArrayList;
import java.util.HashSet;

public class PagoConQR extends TransaccionesMonetarias implements Rechazable, Alertable {

	private Integer score = 0;
	private Cliente clienteOrigen;
	private Double saldoDeLaTransferencia;
	private Cliente clienteDestino;
	
	public PagoConQR(Cliente cliente, Dispositivo dispositivo , Cliente clienteOrigen, Double saldoDeLaTransferencia, Cliente clienteDestino, Integer score) {
		super(cliente, dispositivo);
		this.clienteOrigen = clienteOrigen;
		this.saldoDeLaTransferencia = saldoDeLaTransferencia;
		this.clienteDestino = clienteDestino;
		this.score = score;
	}

	
	
	public void realizarPagoConQR(Cliente clienteOrigen, Double dineroAPagar, Cliente clienteDestino) {
		 
		if(clienteOrigen.getFondos()>=dineroAPagar) {
			Double dineroEnLaCuentaOrigen = clienteOrigen.getFondos() - dineroAPagar;
			clienteOrigen.setFondos(dineroEnLaCuentaOrigen);
			clienteDestino.setFondos(dineroEnLaCuentaOrigen + clienteDestino.getFondos());
		}
	}
	
	
	
	
	@Override
	public void confirmarSiFueFraude(Boolean fueFraude) {
		 
		
	}

	@Override
	public Boolean monitorear(HashSet<Cliente> listaNegra) throws FraudeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean monitorear() throws FraudeException {
		if(calcularScore()== 0) {
			return true;
		} 
		throw new FraudeException();
		
	}

	@Override
	public void calcularScore(ArrayList<Denunciable> listaNegra) {
		// TODO Auto-generated method stub
		
	}

	public Integer getScore() {
		return score;
	}


	public Integer calcularScore() {
		if(cliente.getFondos()==0.0) {
			this.score +=40;
		} return getScore();
	}

	public void setScore(Integer score) {
		this.score = score;
	}
	
}
