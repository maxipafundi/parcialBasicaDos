package unlam.edu.pb2;

public class Computadora extends Dispositivo {

	private String sistemaOperativo;
	private Integer direccionIp;
	private Localidad lugarDeConexion;
	
	public Computadora(String marca, String sistemaOperativo ,Integer direccionIp, Localidad lugarDeConexion) {
		super(marca);
		this.sistemaOperativo = sistemaOperativo;
		this.direccionIp = direccionIp;
		this.lugarDeConexion = lugarDeConexion;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public Integer getDireccionIp() {
		return direccionIp;
	}

	public void setDireccionIp(Integer direccionIp) {
		this.direccionIp = direccionIp;
	}

	public Localidad getLugarDeConexion() {
		return lugarDeConexion;
	}

	public void setLugarDeConexion(Localidad lugarDeConexion) {
		this.lugarDeConexion = lugarDeConexion;
	}

	
	
}
