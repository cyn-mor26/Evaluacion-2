package Evaluacion_individual;

public class Television extends Electrodomesticos{
//atributos
	private double resolucion;
	private boolean sintonizador_TDT;
//constante
	protected final static double Resolucion= 20;//PULGADAS
	protected final static boolean Sintonizador_TDT= false;
	 
	//constructor SUPER CLASS
	public Television(double p_base, String color, char c_energetico, double peso, double resolucion, boolean sintonizador_TDT) {
			super(p_base,color,c_energetico,peso);
			this.resolucion= resolucion;
			this.sintonizador_TDT=sintonizador_TDT;
	}
	//CONSTRUCTOR CLASE
	public Television(double resolucion, boolean sintonizador_TDT) {
		this.resolucion = resolucion;
		this.sintonizador_TDT = sintonizador_TDT;
	}
	public double getResolucion() {
		return resolucion;
	}
	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}
	public boolean isSintonizador_TDT() {
		return sintonizador_TDT;
	}
	public void setSintonizador_TDT(boolean sintonizador_TDT) {
		this.sintonizador_TDT = sintonizador_TDT;
	}
	//METODO FINAL
	public double precioFinal2(double precioF) {
		if(resolucion)
		
	}
	

	
	
	


