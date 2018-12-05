//MODIFICADO
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;

@RunWith (Parameterized.class)
public class RomanNumeralTest
{
	public String roman;
	public int decimal;

	public RomanNumeralTest (String roman, int decimal)
   {
		this.roman = roman;
		this.decimal = decimal;
   }

	@Parameters
	public static Collection<Object[]> romanValues()
	{
		return Arrays.asList (new Object [][] {{"V", 5}, {"MXV", 1015}, {"CD", 400}, {"XXX", 30} ,{"V", 5}, {"MXV", 1015},{"XXX", 30}});
	}
	
	//@Parameters
	//public static Collection<Object[]> romanValues()
	//{
		//return Arrays.asList (new Object [][] { {"MXV", 5},{"XXXX", 40}, {"MXVI", 1015}, {"MXV", 5}, {"XXXX", 40} , {"MXVI", 1015}, {"Z", 5}, {"5", 5}, {"VIIII", 9}});
	//}
	
	
	
	@Test
	public void additionTest()
	{
		assertTrue ("Addition Test", decimal == RomanNumeral.convierte(roman));
	}
	//@Test
	//public void additionTest()
	//{
		//assertFalse ("Addition Test", decimal == RomanNumeral.convierte(roman));
	//}
 }
   
