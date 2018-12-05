
   
// javac 
// javac -cp .:../../hamcrest-core-1.3.jar:../../junit-4.12.jar AllTests.java
// java -cp .:../../hamcrest-core-1.3.jar:../../junit-4.12.jar AllTests
import java.util.*;

public class RomanNumeral {
// Parámetro: s es un número romano.
// Devuelve : s en base 10
//No se especifica qué ocurre si el número no es romano


//Si a la derecha de una cifra romana se escribe otra igual o menor, el valor de ésta se suma a la anterior.
//Si un símbolo está a la izquierda inmediata de otro de mayor valor, se resta al valor del segundo el valor del primero.
//Se permiten a lo sumo tres repeticiones consecutivas del mismo símbolos I, X y C.
//No se permite la repetición de una misma símbolos V, L y D. (Muchos relojes el uso de IIII para el numeral 4, en lugar del correcto IV.)
//La cifra I colocada delante de la V o la X, les resta una unidad; la X, precediendo a la L o a la C, les resta diez unidades y la C, delante de la D o la M, les resta cien unidades.


	private static int valueFromRoman(char z){
		int val;
		
		int m = 0;
		int d = 0;
		int c = 0;
		int l = 0;
		int x = 0;
		int v = 0;
		int i = 0;
		
		
		val = 0;

		switch(z){
		case 'I': val = 1;
			i= i +1;
			break;
		case 'V': val = 5;
			v= v +1;
			break;
		case 'X': val = 10;
			x = x + 1;
			break;
		case 'L': val = 50;
			l= l +1;
			break;
		case 'C': val = 100;
			c = c + 1;
			break;
		case 'D': val = 500;
			d= d +1;
			break;
		case 'M': val = 1000;
			m= m +1;
			break;
		default: val = 0;
			break;
		}
		if (z!= 'I' && z!= 'V' && z!= 'X'&& z!= 'L'&&z!= 'C'&&z!= 'D'&& z!= 'M') {
				throw new RuntimeException("Número romano no existente");
			}
		if (i>3 ||v>3 ||x>3 ||l>3 || c>3 ||d>3 || m>3) {
			throw new RuntimeException("Número romano no válido(tiene + de 3 letras =)");
		}
		return val;
	}

	public static int convierte(String s){
		char charActual, charAnt;
		charActual = 'Z';
		charAnt = 'Z';
		int total;

		total = 0;

		for (int n = s.length()-1 ; n>=0; n--){
			char c = s.charAt (n); 
			System.out.println (valueFromRoman(c));

			if(n!=s.length()-1){
				charAnt = charActual;
				charActual = c;
			}else{
				charActual = c;
				charAnt = c;
			}

			if((int) valueFromRoman(charActual) >= valueFromRoman(charAnt)){
				total = total + valueFromRoman(charActual);
			}else{
				total = total - valueFromRoman(charActual);
			}
			System.out.println("La cuenta va en: " + total);
		}
		
		return total;
	}

	public static void main(String[] args){
//		String str = "MCDLXXIIX";
		String str = "MCDLXIV";
		RomanNumeral rn = new RomanNumeral();
		System.out.println("El número es: " + rn.convierte(str));
	}
}
