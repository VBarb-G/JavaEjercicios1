package sesionMar;

import java.util.Scanner;

public class OperadoresYMas {

	public static void main(String[] args) {
		
		//Ejercicio 1:
		int edad = 13;
		boolean esMujer = true;
		boolean viveEnMexico = true;
		
		if (esMujer && viveEnMexico &&! (edad < 13 )) {
			
			System.out.println("¡Felicidades! Puedes suscribirte a Menstruamixes");
			
			}else {
			System.out.println("Lo siento, no cumples con los requisitos");
		}
		
		//Ejercicio 2:
		boolean hayPeras = false;
		boolean hayManzanas = true;
		
		if ( !hayPeras) {
			System.out.println("Lo siento. No hay peras");
		}else if (!hayManzanas) {
			System.out.println("Lo siento, no hay manzanas");
		}else 
			System.out.println("Se han acabado las frutas");
		
		//Ejercicio 3:
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa un número entero");
		int num = scanner.nextInt();
		
		if (num > 0) {
			System.out.println("El número es positivo");
		}else if (num == 0) {
			System.out.println("El número es 0");
		}else {
			System.out.println("El número es negativo");
		}
		
		
		//Ejercicio 4:
		System.out.println("Indica una calificación bajo los parámetros: A, B, C, D, F");
		String notaCalif = scanner.next().toUpperCase();
		switch (notaCalif) {
		case "A":
			System.out.println("Excelente");
			break;
		case "B":
			System.out.println("Bueno");
			break;
		case "C":
			System.out.println("Regular");
			break;
		case "D":
			System.out.println("Panzaso");
			break;
		case "F":
			System.out.println("Reprobaste");
			break;
			default:
				System.out.println("Calificación inválida");
		}
		
		//Ejercicio 5:
		System.out.println("Selecciona un número del 1 al 5");
		int notifNum = scanner.nextInt();
		switch (notifNum) {
		case 1:
			System.out.println("Tienes 2 recordatorios");
			break;
		case 2:
			System.out.println("Whatsapp: 3 mensajes");
			break;
		case 3:
			System.out.println("Banconfianza:Tienes una transacción aprobada");
			break;
		case 4:
			System.out.println("Instagram: 47 personas han visto tu historia");
			break;
		case 5:
			System.out.println("Youtube: IAMDDB subió 2 videos nuevos");
			break;
			default:
				System.out.println("Elige un número dentro del rango");
			
		}
		
			
	
	
	
	}
	
	
	
	

}
