package unlam.edu.pb2;

import java.util.ArrayList;

public class Cliente implements Denunciable {

	private String nombre;
	
	private Integer fondos;
	private Integer cuil;
	private ArrayList <Dispositivo> dispositivos;
	private ArrayList <Transaccion> transacciones = new ArrayList <>();

	public Cliente(String nombre, Integer cuil, Integer fondos) {
		
		this.nombre = nombre;
		this.cuil = cuil;
		this.fondos = fondos;
		this.dispositivos = new ArrayList<>();
	}

	
	public void agregarDispositivo(Dispositivo dispositivo){
		this.dispositivos.add(dispositivo);
	}
	
	public void realizarTransaccion (Transaccion transacionARealizar){
		this.transacciones.add(transacionARealizar);
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


	public Integer getFondos() {
		return fondos;
	}


	public void setFondos(Integer fondos) {
		this.fondos = fondos;
	}



	
	
}
