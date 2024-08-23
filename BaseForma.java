package entidade;

public class BaseForma {

    public double base;
	
	public double largura;
	 
	public double altura;
	
	public String tipo;
	
	public BaseForma(double base, double largura, double altura) {
		this.base = base;
		this.largura = largura; 
		this.altura = altura;
		this.tipo = tipo;
		
	}
	public double calcularArea() {
		return base * altura;
		
	}
	
	public void mostrarInfo() {
		System.out.println("Tipo de forma: " + tipo);
		System.out.println("Área: " + calcularArea());
	}
	
}


