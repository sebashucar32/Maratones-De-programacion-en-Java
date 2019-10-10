package metodosdeordenamiento;

public class CountingSort 
{
	public int[] solucionMetodoCountingSort(int vector[], int tamano)
	{
		int menor=10000, mayor=0, limite, dato, indice;
		
		for(int i=0; i < vector.length; i++) 
		{
			if(vector[i] < menor) {
				menor = vector[i];
			}
			
			if(vector[i] > mayor) {
				mayor = vector[i];
			}
		}

		limite = (mayor - menor) + 1;
		int rango[] = new int[limite];
		int vectorResultado[] = new int[tamano];
		
		for(int i=0; i < rango.length; i++) {
			rango[i] = 0;
		}
		
		for (int i = 0; i < vector.length; i++) {
			dato = vector[i] - menor;
			rango[dato] = rango[dato] + 1;
		}
				
		for(int i = 1; i < rango.length; i++){
			rango[i] = rango[i] + rango[i-1];
		}
		
		for (int i = 0; i < vector.length; i++) {
			dato = vector[i] - menor;
			indice = rango[dato];
			rango[dato]--;
			vectorResultado[indice-1] = vector[i];
		}
		
		for (int i : vectorResultado) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
	    return vector;
	}
}
