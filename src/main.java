import java.util.Date;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaArreglo a1=new ListaArreglo(10000);
		
//		a1.array[0]=8;
//		a1.array[1]=5;
//		a1.array[2]=2;
//		a1.array[3]=6;
//		a1.array[4]=9;
//		a1.array[5]=3;
//		a1.array[6]=1;
//		a1.array[7]=4;
//		a1.array[8]=0;
//		a1.array[9]=7;
		
		for (int i = 0; i < a1.array.length; i++) {
			a1.array[i]=(int) Math.floor(Math.random() * 101);			
		}
		
		Date v_start = new Date();
		
		a1.mergesort(0,9999);//EL merge es mnuy bueno cuando la cantidad de elementos en el arreglo es chica, 		
		//gasta mucho mas espacio ya que necesita de otro arreglo para ir subdividiendose 
		
		Date v_end = new Date();
		
		System.out.println("Tiempo de Ejecución: " + (v_end.getTime() - v_start.getTime()));
		
		
		//a1.OrdenamientoSeleccion();
		
		System.out.println(a1.array[0]);
		System.out.println(a1.array[1]);
		System.out.println(a1.array[2]);
		System.out.println(a1.array[3]);
		System.out.println(a1.array[4]);
		System.out.println(a1.array[5]);
		System.out.println(a1.array[6]);
		System.out.println(a1.array[7]);
		System.out.println(a1.array[8]);
		System.out.println(a1.array[9]);		
	}
}

