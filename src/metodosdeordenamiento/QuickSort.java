package metodosdeordenamiento;

public class QuickSort 
{	
	public int[] solucionMetodoQuickSort(int vector[], int primero, int ultimo) 
	{
		int pivote, i, j, temporal;
		
		i = primero;
		j = ultimo;
		pivote = (vector[i] + vector[j]) / 2;
		
		while(i < j) 
		{
			while(vector[i] < pivote)
				i++;
				
			while(vector[j] > pivote)
				j--;
			
			if(i <= j)
			{
				temporal = vector[j];
				vector[j] = vector[i];
				vector[i] = temporal;
				i++;
				j--;
			}
		}
		
		if(primero < j)
		{
			vector = solucionMetodoQuickSort(vector, primero, j);
		}
		
		if(ultimo > i)
		{
			vector = solucionMetodoQuickSort(vector, i, ultimo);
		}
		
		return vector;
	}
	
	public void imprimirVectorOrdenado(int vector[])
	{
		for(int i : vector) {
			System.out.print(i + " ");
		}
	}
}
