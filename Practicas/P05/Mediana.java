import java.io.*;
class Mediana {
	public static void main(String[] args) {
		int array1 [];
		String tamS;
		int tamaInt;
		int i, j, aux;
		
		//Declaracion de los flujos Estandar de E/S
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader flujoE = new BufferedReader(isr);
		PrintStream flujoS = System.out;

		try {

			do {	
		    	//solicito de que tamaño es la lista de numeros
		    	aux = 1;
				flujoS.println("De Cuantos Numeros Deceas la Lista");	
				tamS = flujoE.readLine();//leeo el dato
				tamaInt = Integer.valueOf(tamS).intValue();//conviete el texto  en numeros enteros
				if(tamaInt % 2 == 0) {
					flujoS.println("La lsita tine que ser de un numero impar");
					flujoS.println("Prueba de nuevo");
					aux = 0;
				}	
			}while(aux == 0);

			//inicializo lor arrays
			array1 = new int [tamaInt]; 

			//LLeno el arrelo con datos ingresados por entrada Estandar(teclado)
			for(i=0; i<tamaInt; i++) {
				flujoS.println("Dame un valor");
				tamS = flujoE.readLine();
				array1[i] = Integer.valueOf(tamS).intValue();
			}

			//ordeno el arreglo de menor a mayor
			for(i=0; i < tamaInt; i++) {
				for(j = i + 1; j < tamaInt; j++) {
					if(array1[i] > array1[j]) {
						aux = array1[i];
						array1[i] = array1[j];
						array1[j] = aux;
					}
				}
			}

			flujoS.println("");
			flujoS.print("(");

			//muestro por salida Estandar (pantalla) la lista	
			for(i=0;i < tamaInt;i++) {
				flujoS.print(array1[i] + ",");
			}

			flujoS.print(")");
			flujoS.println("");

			// muestro por salida Estandar (pantalla) la mediana
			flujoS.println("La mediana es: " + array1[tamaInt/2]);

		}catch(IOException e) {}	
	}
}