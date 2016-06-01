import static org.junit.Assert.*;

import java.util.ArrayList;




import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class PoligonoTest {

	int arearectangulo,lado1,lado2;
	Poligono p ;
	
	public PoligonoTest(int arearectangulo,int lado1,int lado2) {
		super();
		this.arearectangulo = arearectangulo;
		this.lado1 = lado1;
		this.lado2 = lado2;
		
		
		
		
	}
	
	

	@Parameters
	public static ArrayList<Integer[]> datos()
	{
		ArrayList<Integer[]> dato=new ArrayList<Integer[]>();
		Integer[] dato1=new Integer[3];
		dato1[0]=25; //area
		dato1[1]=5; //lado1
		dato1[2]=5; //lado2
		dato.add(dato1);
		

		dato2[0]=16; //area
		dato2[1]=4; //lado1
		dato2[2]=4; //lado2
		dato.add(dato2);
		
		
		return dato;
	}
	
	@Test
	public void testCalcular() {
		Poligono p = new Poligono(0,lado1,lado2);
		p.calcular();
		
		
		Assert.assertEquals(arearectangulo, p.arearectangulo);
		
		
	}

}
