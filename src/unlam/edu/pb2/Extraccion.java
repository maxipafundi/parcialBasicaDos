package unlam.edu.pb2;

import java.util.Set;

public class Extraccion extends TransaccionesMonetarias {

	private Integer score;
	
	
	public Extraccion(Cliente cliente, Dispositivo dispositivo, Integer score) {
		super(cliente, dispositivo);
		this.score = score;
	}

	

	public void realizarExtraccion(Cliente clienteDeLaOperacion, Double saldoAExtraer) {
		if(clienteDeLaOperacion.getFondos() >= saldoAExtraer) {
			Double nuevoSaldoActual = clienteDeLaOperacion.getFondos() - saldoAExtraer;
			clienteDeLaOperacion.setFondos(nuevoSaldoActual);
		}

	}

	//COMO EN EL ENUNCIADO NO HABIA NINGUNA ACLARACION DE CUANDO LA EXTRACCION PODIA SUMAR EL SCORE, LO DEJE EN 0.
	public Boolean monitorear(Cliente cliente , Dispositivo dispositivo) throws FraudeException {
		if(score== 0) {
			return true;
		}
		return false;
	}

	@Override
	public Boolean monitorear() {
		// TODO Auto-generated method stub
		return null;
	}



	public Integer getScore() {
		return score;
	}


	

	public void setScore(Integer score) {
		this.score = score;
	}

	
}
	

