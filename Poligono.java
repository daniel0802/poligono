
public class Poligono {




	int arearectangulo=0;
	int lado1= 10;
	int lado2= 5;


	public Poligono(int arearectangulo, int lado1, int lado2) {
		super();
		this.arearectangulo = arearectangulo;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}



	public void calcular(){
		arearectangulo= lado1*lado2;

	}


}
