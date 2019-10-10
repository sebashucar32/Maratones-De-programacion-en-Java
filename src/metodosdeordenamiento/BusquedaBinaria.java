package metodosdeordenamiento;

public class BusquedaBinaria 
{
	public int solucionBusquedaBinaria(int vector[], int posicionInicial, int posicionFinal, int buscarNumero) 
	{
		int posicion;
		
		while(posicionInicial <= posicionFinal)
		{
			posicion = (posicionInicial + posicionFinal) / 2;
			
			if(vector[posicion] == buscarNumero)
	        {
	            return posicion;
	        }
	        else if(vector[posicion] < buscarNumero)
	        {
	        	posicionInicial = posicion + 1;
	        }
	        else
	        {
	        	posicionFinal = posicion - 1;
	        }
		}

	    return -1;
	}
}
