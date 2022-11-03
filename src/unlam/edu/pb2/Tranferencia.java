package unlam.edu.pb2;

public class Tranferencia extends TransaccionesMonetarias implements Monitoreable {

	private Integer monto;
	
	public Tranferencia(Integer numeroTransaccion, Integer score , Integer monto) {
		super(numeroTransaccion, score);
		this.monto = monto;
	}

	
	
	
	@Override
	public boolean monitorear() {
		
		return false;
	}

	
}
