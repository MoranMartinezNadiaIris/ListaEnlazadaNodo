
public class Nodo {
	public Nodo Siguiente;
	private String Data;
	public Nodo(Nodo Sig,String Data) {
		this.Siguiente=Sig;
		this.Data=Data;
	}
	public String obtenerData() {
		return Data;
	}
	public void colocarData(String Data) {
		this.Data=Data;
	}
	@Override
	public String toString() {
		return "Data : " + Data;
	}
}
