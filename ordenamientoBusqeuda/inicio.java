package pqtOrdenamiento;

public class inicio {

	public static void main(String[] args) {
		
		
		//int[] vector = {3,9,11,4,1};
		int[] vector = {17,89,45,76,3,94,11,4,9,77,54,34,12,13,14};
				
		//ordenar por burbuja
		System.out.print("\n...M�todo Ordenamiento Burbuja...");
		burbuja.ordenarBurbuja(vector);
		verVector(vector);
		System.out.print("\nTiempo (Nano): "+burbuja.tDelta);
		///
		
		//ordenar por inserci�n
		//int[] vector2 = {3,9,11,4,1};
		int[] vector2 = {17,89,45,76,3,94,11,4,9,77,54,34,12,13,14};
		System.out.print("\n\n...M�todo Ordenamiento Inserci�n...");
		insercion.ordenarInsercion(vector2);
		verVector(vector2);
		System.out.print("\nTiempo (Nano): "+insercion.tDelta);
		///
		
		//ordenar por inserci�n
		//int[] vector3 = {3,9,11,4,1};
		int[] vector3 = {17,89,45,76,3,94,11,4,9,77,54,34,12,13,14};
		System.out.print("\n\n...M�todo Ordenamiento Selecci�n...");
		seleccion.ordenarSeleccion(vector3);
		verVector(vector3);
		System.out.print("\nTiempo (Nano): "+seleccion.tDelta);
				///
		

	}//main
	
	static void verVector(int[] ve){
		System.out.print("\n");
		for (int i = 0; i < ve.length; i++){ 
			System.out.print(ve[i]+" ");
		}
	}//verVector

}//clase
