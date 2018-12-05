import java.util.*;

public class BisiestosModificado {
	public static boolean esBisiesto(int año) {

		boolean condicion_1 = ((año % 4) == 0);
		boolean condicion_2 = ((año % 100) != 0);
		boolean condicion_3 = ((año % 400) == 0);
		
		//https://es.wikibooks.org/wiki/Algoritmo_bisiesto
		if((año < 0) || (año == 0)){
			throw new IllegalArgumentException();
		}else if (condicion_1 && (condicion_2 || condicion_3)){
			return true;
		} else {
			return false;
		}
	}
		
	public static void main(String[] args){
		;
	}

}
