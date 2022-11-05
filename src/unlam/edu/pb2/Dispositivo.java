package unlam.edu.pb2;



public abstract class Dispositivo implements Denunciable{

	private String sistemaOperativo;
	private String direccionIp;
	private Localidad lugarDeConexion;
	


	
	public Dispositivo(String sistemaOperativo, String direccionIp, Localidad lugarDeConexion) {
		super();
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




	public String getDireccionIp() {
		return direccionIp;
	}




	public void setDireccionIp(String direccionIp) {
		this.direccionIp = direccionIp;
	}




	public Localidad getLugarDeConexion() {
		return lugarDeConexion;
	}




	public void setLugarDeConexion(Localidad lugarDeConexion) {
		this.lugarDeConexion = lugarDeConexion;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((direccionIp == null) ? 0 : direccionIp.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dispositivo other = (Dispositivo) obj;
		if (direccionIp == null) {
			if (other.direccionIp != null)
				return false;
		} else if (!direccionIp.equals(other.direccionIp))
			return false;
		return true;
	}


	
	
	
	



	
	
	
	
	
	
}
