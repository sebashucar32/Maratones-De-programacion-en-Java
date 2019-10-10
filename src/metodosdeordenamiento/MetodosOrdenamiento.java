package metodosdeordenamiento;

import java.util.Scanner;

public class MetodosOrdenamiento 
{
	public static void main(String[] args) 
	{
		int tamanoVector = (int)(Math.random()*(6500)+1000);
		long tiempo1I, tiempo1F, tiempo2I, tiempo2F, tiempo3I, tiempo3F; 
		double promedioTiempo;
		System.out.println(tamanoVector);
		int vector[] = new int[tamanoVector];
		int vectorQick[] = new int[tamanoVector];
		int vectorCouting[] = new int[tamanoVector];
		int numero, buscarNumero, numeroAleatorio;
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < vector.length; i++) {
			numeroAleatorio = (int)(Math.random()*(10000)+1);
			vector[i] = numeroAleatorio;
			vectorQick[i] = numeroAleatorio;
			vectorCouting[i] = numeroAleatorio;
		}
		
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");
		}
		
		System.out.println("Ejecutando metodo de burbuja");
    	tiempo1I = System.nanoTime();
		Burbuja burbuja = new Burbuja(vector);
		burbuja.solucionMetodoBurbuja();
		burbuja.imprimirVectorOrdenado(vector);
		tiempo1F = System.nanoTime();
		promedioTiempo = (double)(tiempo1F - tiempo1I) * 1.0e-9;
		System.out.println();
		System.out.println("El metodo de burbuja duro " + promedioTiempo + " " + "segundos");
		
		System.out.println("Ejecutando metodo de QuickSort");
    	tiempo2I = System.nanoTime();
    	QuickSort quickSort = new QuickSort();
    	quickSort.solucionMetodoQuickSort(vectorQick, 0, (vectorQick.length-1));
    	quickSort.imprimirVectorOrdenado(vectorQick);
    	tiempo2F = System.nanoTime();
    	promedioTiempo = (double)(tiempo2F - tiempo2I) * 1.0e-9;
		System.out.println();
		System.out.println("El metodo QuickSort duro " + promedioTiempo + " " + "segundos");
		
		System.out.println("Ejecutando metodo de CountingSort");
    	tiempo3I = System.nanoTime();
    	CountingSort countingSort = new CountingSort();
    	countingSort.solucionMetodoCountingSort(vectorCouting, tamanoVector);
    	tiempo3F = System.nanoTime();
    	promedioTiempo = (double)(tiempo3F - tiempo3I) * 1.0e-9;
		System.out.println();
		System.out.println("El metodo CountingSort duro " + promedioTiempo + " " + "segundos");
		
		System.out.println("Que numero desea buscar en el vector Ordenado: ");
		numero = entrada.nextInt();
		BusquedaBinaria busquedaBinaria = new BusquedaBinaria();
		buscarNumero = busquedaBinaria.solucionBusquedaBinaria(vector, 0, (vector.length-1), numero);
		System.out.println(buscarNumero);
		
		entrada.close();
	}
}
