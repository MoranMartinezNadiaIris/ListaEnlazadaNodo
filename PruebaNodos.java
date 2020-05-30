import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PruebaNodos {
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Nodo n1=new Nodo(null,"a");
		Nodo n2 = new Nodo(null,"b");
		Nodo n3 = new Nodo(null,"c");
		//Funcionamiento de la referencia
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		//enlazar nodo1 al nodo2
		System.out.println("#####################");
		n1.Siguiente=n2;
		System.out.println(n1.Siguiente);
		n2.Siguiente=n3;
		System.out.println(n2.Siguiente);
		///////////////////
		System.out.println("#####################");
		System.out.println(n1);
		System.out.println(n1.Siguiente);
		System.out.println(n1.Siguiente.Siguiente);
		/////////////////////
		n2=null;
		n3=null;
		///////////////////////
		System.out.println("--------------------");
		System.out.println(n1);
		System.out.println(n1.Siguiente);
		System.out.println(n1.Siguiente.Siguiente);
		////////////////////////////////
		Nodo ref=n1;
		while (ref != null) {
			System.out.println("Valor " +ref);
			ref=ref.Siguiente;
			
		}
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader Teclado=new BufferedReader(r);
		String Num;
		String resp="";
		Nodo Inicial=null;
		Nodo sigNod=null;
		Nodo Actual=null;
		System.out.println("Bienvenido vamos a guardar Letras");
		do {
			System.out.println("Dame un palabra");
			Num=Teclado.readLine();
			if(Inicial==null) {
				Inicial= new Nodo(null,Num);
				Actual=Inicial;
			}else {
				sigNod=new Nodo(null,Num);
				Actual.Siguiente=sigNod;
				Actual=sigNod;
			}
			System.out.println("Deseas continuar S/N");
			resp=Teclado.readLine();
		
		}while(resp.compareToIgnoreCase("S")==0);
		ref=Inicial;
		while (ref != null) {
			System.out.println("Valor " +ref);
			ref=ref.Siguiente;
			
		}
	}
}
