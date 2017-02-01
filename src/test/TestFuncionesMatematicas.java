import org.junit.*;
import org.junit.Assert.*;
import java.lang.IllegalArgumentException;

public class TestFuncionesMatematicas {

	@Test
	public void testSuma(){
		Integer res = FuncionesMatematicas.suma(3, 3);
		
		Assert.assertTrue(res==6);
	}
	
	@Test void testResta(){
		Integer res = FuncionesMatematicas.resta(3, 3);
		
		Assert.assertTrue(res==0);
	}
	
}