package trianguloPackage;

public class Triangulos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(clasifica(3,3,3));
		System.out.println(clasifica(3,4,3));
		System.out.println(clasifica(3,4,5));
		System.out.println(clasifica(3,4,1));

	}
	
	public static String clasifica(final int a, int b, int c) {
		// Método clasifica 
		
		int match = 0;
		String resultado = "";

		if (a == b) {
			match = match + 1;
		}
		if (a == c) {
			match = match + 2;
		}
		if (b == c) {
			match = match + 3;
		}
				
		if (match == 0) {
			if (a + b <= c) {
				resultado = "No es un triángulo";
			} 
			else {
				if  (b + c <= a) {
					resultado = "No es un triángulo";
				} 
				else {
					if  (a + c <= b) {
						resultado = "No es un triángulo";
					} 
					else {
						resultado = "Escaleno";
					}
				}
			}			
		} // end of then (match == 0) 
		else { // match != 0
			if (match == 1) {
				if (a + c <= b) {
					resultado = "No es un triangulo"; 
				} // endif 
				else {
					resultado = "Isósceles";
				} 
			} //end of then (match ==1) 
			else { // match != 1
				if (match == 2) {
					if (a + c <= b) {
						resultado = "No es un triángulo";
					} // endif 
					else {
						resultado = "Isósceles"; 
					}
				} // end of then (match == 2) 
				else {
					if (match == 3) {
						if (b + c < a) { 
							resultado = "No es un triángulo";
						} // endif 
						else {
							resultado = "Isósceles";
						}
					} // end of then (match == 3) 
					else { // match != 3
						resultado = "Equilátero";
					}
				}
			}
		}
		return resultado;
	}
}
 