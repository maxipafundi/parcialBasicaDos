package unlam.edu.pb2;

public class Celular extends Dispositivo {

	

	private Integer imei;
	private TipoRegistro tipoRegistro;
	
	
	
	public Celular(String sistemaOperativo, String direccionIp, Localidad lugarDeConexion , Integer imei , TipoRegistro tipoRegistro) {
		super(sistemaOperativo, direccionIp, lugarDeConexion);
		this.imei = imei;
		this.tipoRegistro = tipoRegistro;
	}

	

	public Integer getImei() {
		return imei;
	}

	public void setImei(Integer imei) {
		this.imei = imei;
	}

	public TipoRegistro getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(TipoRegistro tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}



	@Override
	public void add(Denunciable denunciable) {
		// TODO Auto-generated method stub
		
	}

	
	
}
