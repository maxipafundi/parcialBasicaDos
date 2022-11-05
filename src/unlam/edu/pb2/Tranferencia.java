package unlam.edu.pb2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Tranferencia extends TransaccionesMonetarias implements Alertable, Rechazable {

	private ArrayList<Denunciable> denunciables;
	private Cliente clienteOrigen;
	private Double saldoDeLaTransferencia;
	private Cliente clienteDestino;
	private Integer score = 0;
	
	
	
	public Tranferencia(Cliente cliente, Dispositivo dispositivo , Cliente clienteOrigen, Double saldoDeLaTransferencia, Cliente clienteDestino, Integer score) {
		super(cliente, dispositivo);
		
		this.clienteOrigen = clienteOrigen;
		this.saldoDeLaTransferencia = saldoDeLaTransferencia;
		this.clienteDestino = clienteDestino;
		this.score = score;
		
		}

	
	
	public void realizarTransferencia(Cliente clienteOrigen, Double dineroATransferir, Cliente clienteDestino) {
		 
			if(clienteOrigen.getFondos()>=dineroATransferir) {
				Double dineroEnLaCuentaOrigen = clienteOrigen.getFondos() - dineroATransferir;
				clienteOrigen.setFondos(dineroEnLaCuentaOrigen);
				clienteDestino.setFondos(dineroEnLaCuentaOrigen + clienteDestino.getFondos());
			}
		}
	
	

	@Override
	public void marcarComoCasoSospechoso(Cliente cliente) {
		if(calcularScore()> 50) {
			this.denunciables.add(cliente);
		} 
		
	}

	


	@Override
	public void confirmarSiFueFraude(Boolean fueFraude) {

		
	}
	
	

	
	public Integer getScore() {
		return score;
	}



	public void setScore(Integer score) {
		this.score = score;
	}



	
	/*public Boolean monitorear(Set<Denunciable> listaNegra) throws FraudeException{
		if(listaNegra.contains(cliente)){
			score+=80;
		}
		if(score >=80) {
			throw new FraudeException();
		}
		return true;
	}*/


	
	public Integer calcularScore() {
		if(clienteOrigen.getFondos()==0.0) {
			this.score +=40;
		} return getScore();
	}
	
	

	/*@Override
	public void calcularScore(ArrayList<Denunciable> listaNegra) {
		if(listaNegra.contains(cliente)) {
			this.score += 80;
		} if(listaNegra.contains(dispositivo)) {
			this.score += 80;
		}
		
	}*/



	

	



	public Double getSaldoDeLaTransferencia() {
		return saldoDeLaTransferencia;
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


}
	




	
	

	
	

	
	
	

