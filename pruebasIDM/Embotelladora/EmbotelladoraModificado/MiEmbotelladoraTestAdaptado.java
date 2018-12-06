//javac -cp .:./hamcrest-core-1.3.jar:./junit-4.12.jar MiEmbotelladoraTestAdaptado.java
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;

//ADAPTAMOS NUESTRO CÓDIGO TEST A SU EMBOTELLADORA:

public class MiEmbotelladoraTestAdaptado
{
	int pequenas, grandes, total;
	Embotelladora emb = new Embotelladora();

	//Testing b1: grandes, pequenas o total son negativos
	@Test
	public void negativeTest()
	{
		pequenas = -1;
		grandes = 0;
		total = 3;
		assertTrue ("negativeTest", emb.calculaBotellasPequenas(pequenas, grandes, total) == -1);
        //modificado para adaptarlo a su salida (-1)
	}
	
	//Testing b2: total > miCapacidad
	@Test
	public void b2Test()
	{
		pequenas = 4;
		grandes = 1;
		total = 20;
		assertTrue ("b2Test", emb.calculaBotellasPequenas(pequenas, grandes, total) == -1);
        //modificado para adaptarlo a su salida (-1)
	}
	
	//Testing b3: total <= miCapacidad y total-5*grandes<0
	@Test
	public void b3Test()
	{
		pequenas = 2;
		grandes = 5;
		total = 5;
		assertTrue ("b3Test", emb.calculaBotellasPequenas(pequenas, grandes, total) == 0);
	}
	
	//Testing b4: total <= miCapacidad y total-5*grandes>0
	@Test
	public void b4Test()
	{
		pequenas = 3;
		grandes = 1;
		total = 7;
		assertTrue ("b4Test", emb.calculaBotellasPequenas(pequenas, grandes, total) == 2);
	}
	
	//Testing b5: total <= miCapacidad y total-5*grandes=0
	@Test
	public void b5Test()
	{
		pequenas = 0;
		grandes = 4;
		total = 20;
		assertTrue ("b5Test", emb.calculaBotellasPequenas(pequenas, grandes, total) == 0);
	}
}
		
  
