package unlam.edu.pb2;

import java.util.ArrayList;



public class Cliente implements Denunciable {

	private String nombre;
	
	private double fondos;
	private Integer cuil;
	private ArrayList <Dispositivo> dispositivos;
	private ArrayList <Transaccion> transacciones = new ArrayList <>();

	public Cliente(String nombre, Integer cuil, double fondos) {
		
		this.nombre = nombre;
		this.cuil = cuil;
		this.fondos = fondos;
		this.dispositivos = new ArrayList<>();
	}

	
	public void agregarDispositivo(Dispositivo dispositivo){
		this.dispositivos.add(dispositivo);
	}
	
	public Integer cantidadDispositivos () {
		return this.dispositivos.size();
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCuil() {
		return cuil;
	}

	public void setCuil(Integer cuil) {
		this.cuil = cuil;
	}


	public double getFondos() {
		return fondos;
	}


	public void setFondos(Double fondos) {
		this.fondos = fondos;
		
	}

	@Override
	public void add(Denunciable denunciable) {
		
		
	}


	





	

	


	


	
	
}
