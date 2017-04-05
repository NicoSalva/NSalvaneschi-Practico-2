
public class ListaArreglo {
	int [] array;
	int [] auxiliar;
	
	int num;
	
	ListaArreglo(int cant){
		array=new int[cant];
		auxiliar=new int[cant];
		
	}
	
	public void agregar(int elem, int cont){
		array[cont]=elem;
	}
	
	
	
	
	public boolean estaOrdenadoAscendente( int contador){
		if (array.length>=contador){
			return true;
		}
		else
			if(array[contador]<=array[contador+1]){
				return estaOrdenadoAscendente(contador+1);
			}
			else
				return false;
	}
	
	public boolean estaOrdenadoDescendente( int contador){
		if (array.length>=contador){
			return true;
		}
		else
			if(array[contador]>=array[contador+1]){
				return estaOrdenadoAscendente(contador+1);
			}
			else
				return false;
	}
	
	public boolean estaOrdenado(){
		int contador=0;
		if(this.estaOrdenadoAscendente(contador)){
			return true;
		}
		if(this.estaOrdenadoDescendente(contador)){
			return true;
		}
		return false;
	}
	
	public boolean BuscarOrdenadoAscendente(int elemento, int contador){
		if (contador>array.length-1){
			return false;
		}
		else{
			if(array[contador]==elemento)
				return true;
			else
				return BuscarOrdenadoAscendente(elemento, contador+1);				
		}
	}	

	
	public void OrdenamientoSeleccion(){
		 int j, menor, pos, tmp;
         for (int i = 0; i < array.length - 1; i++) { 
               menor = array[i]; 
               pos = i; 
               for (j = i + 1; j < array.length; j++){ 
                     if (array[j] < menor) { 
                         menor = array[j]; 
                         pos = j;
                     }
               }
               if (pos != i){ 
                   tmp = array[i];
                   array[i] = array[pos];
                   array[pos] = tmp;
               }
         }
		
	}
	
	public void sort(int[] valores){
		this.array=valores;
		num=valores.length;
		this.auxiliar=new int[num];
		mergesort(0,num-1);
		}
	
	public void mergesort(int low, int high){
		if(low<high){
			int middle=(low+high)/2;
			mergesort(low,middle);
			mergesort(middle+1,high);
			merge(low,middle,high);
			}
		}
	
	private void merge (int low, int middle, int high){
		for (int i = low; i <= high; i++) {
			auxiliar[i]=array[i];			
		}
		
		int i=low;
		int j=middle+1;
		int k=low;
		
		while(i<=middle&&j<=high){
			if(auxiliar[i]<=auxiliar[j]){
				array[k]=auxiliar[i];
				i++;
				}else{
					array[k]=auxiliar[j];
					j++;
				}
			k++;
		}
		
		while (i<=middle){
			array[k]=auxiliar[i];
			k++;
			i++;
		}
	}
		
	
	
	
}


