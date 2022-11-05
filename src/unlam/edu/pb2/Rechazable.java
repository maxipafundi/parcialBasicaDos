package unlam.edu.pb2;

import java.util.ArrayList;
import java.util.HashSet;



public interface Rechazable {
	
	public Boolean monitorear(HashSet<Cliente> listaNegra) throws FraudeException;
	public Boolean monitorear() throws FraudeException;
	public void calcularScore (ArrayList <Denunciable> listaNegra);
}
