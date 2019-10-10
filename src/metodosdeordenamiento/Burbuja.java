package metodosdeordenamiento;


public class Burbuja 
{
	private int vector[] = new int[8];
	
	public Burbuja(int vector[])
	{
		this.vector = vector;
	}
	
	public int[] solucionMetodoBurbuja()
	{
		boolean permutacion = true;
		int temporal, tope=0, tamano = vector.length;
		
		while(permutacion == true)
		{
			permutacion = false;
			tope++;
			for (int i = 0; i < tamano-tope; i++) 
			{
				if (vector[i] > vector[i+1]) 
				{
					permutacion = true;
					temporal = vector[i];
					vector[i] = vector[i+1];
					vector[i+1] = temporal;
				}
			}
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
