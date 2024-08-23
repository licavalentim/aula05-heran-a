package entidade;

public class Retangulo extends BaseForma{

	public static void main(String[] args) {
		
	}
		
		public Retangulo(double base, double largura, double altura) {
			super(base, largura, altura);

	}
		public double calcularArea() {
			return largura * altura;
		}

}
