package metodosdeordenamiento;

class MetodoBurbuja
{
	private int vector[] = new int[8];
	
	public MetodoBurbuja(int vector[])
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

public class Burbuja 
{
	public static void main(String[] args) 
	{
		int vector[] = new int[10];
		
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int)(Math.random()*(100));
		}
		
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");
		}

		System.out.println();
		MetodoBurbuja burbuja = new MetodoBurbuja(vector);
		burbuja.solucionMetodoBurbuja();
		burbuja.imprimirVectorOrdenado(vector);
	}
}
