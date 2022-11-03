package unlam.edu.pb2;

public abstract class Transaccion {

	private Integer numeroTransaccion;
	private Integer score;

	public Transaccion(Integer numeroTransaccion , Integer score) {
		super();
		this.numeroTransaccion = numeroTransaccion;
		this.score = score;
	}

	public Integer getNumeroTransaccion() {
		return numeroTransaccion;
	}

	public void setNumeroTransaccion(Integer numeroTransaccion) {
		this.numeroTransaccion = numeroTransaccion;
	}
	
	
}
