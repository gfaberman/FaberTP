package FaberTP;

public class TrabajoPractico01 {

	public static void main(String[] args) {

		System.out.println("Resolucion item A del punto 1");
		
		int numeroInicio = 0;
		int numeroFin = 14;
		
		while(numeroInicio <= numeroFin) {
			
			System.out.println(numeroInicio);
			
			numeroInicio++;
			
		}
		
		System.out.println("Resolucion item B del punto 1");
		
		numeroInicio = 5;
		numeroFin = 14;
		
		while(numeroInicio <= numeroFin) {
			
			if( (numeroInicio % 2) == 0) {
				System.out.println(numeroInicio);
			}
			
			numeroInicio++;
			
		}
		
		System.out.println("Resolucion item C del punto 1");
		
		numeroInicio = 5;
		numeroFin = 14;
		
		boolean imprimirLosPares = true; //true -> un número par ; false -> un número impar
		
		while(numeroInicio <= numeroFin) {
			
			if(numeroInicio % 2 == 0 && imprimirLosPares) {
				System.out.println(numeroInicio);
			}
			
			if(numeroInicio % 2 != 0 && !imprimirLosPares) {
				System.out.println(numeroInicio);
			}
			numeroInicio++;
			
		}
		
		
		System.out.println("Resolucion Opcional item C del punto 1");
		
		numeroInicio = 5;
		numeroFin = 14;
		
		char imprimir = 'i'; //p -> un número par ; i -> impares
		
		while(numeroInicio <= numeroFin) {
			
			switch(imprimir) {
				case 'p':
					if(numeroInicio % 2 == 0) {
						System.out.println(numeroInicio);
					}
					break;
				case 'i':
					if(numeroInicio % 2 != 0) {
						System.out.println(numeroInicio);
					}
					break;
				default:
					System.out.println("Opcion incorrecta");
				
				}
				numeroInicio++;
			}
		
		
		System.out.println("Resolucion item D del punto 1");
		
		//numeroInicio = 0;  Si uso for, podría no inicializar la variable
		numeroFin = 0;
		
		for(numeroInicio = 14;numeroInicio >= numeroFin;numeroInicio--){
			System.out.println(numeroInicio);
		}
		float ingresoMensual = 50000;
		int cantVehiculosAntMenor5Anos = 1; //vehiculos con una antiguedad menores a 5 años
		int cantInmuebles = 0;
		int cantVehiculosDeLujo = 0; // puede ser una embarcación, una aeronave o ser titular de sociedad
	
		if(
				ingresoMensual >= 489083 ||
				cantVehiculosAntMenor5Anos >= 3 ||
				cantInmuebles >= 3 ||
				cantVehiculosDeLujo > 0
				) {
			System.out.println("El hogar pertenece al segmento de clase alta");
		}else {
			System.out.println("El hogar NO pertenece al segmento de clase alta");
		}
	
		
	}

}