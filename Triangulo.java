package entidade;

public class Triangulo  extends BaseForma {

	public Triangulo(double base, double largura, double altura, String tipo) {
		super(base, largura,altura);
		
		
	}
	
	public double calcularArea() {
		return base * altura;
	}

}
