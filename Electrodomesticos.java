package Evaluacion_individual;

public class Electrodomesticos {
	//atributos
	protected double p_base;
	protected String color;
	protected char c_energetico;
	protected double peso;//kg;
	
//constantes en mayusc
protected final static double P_base = 100000;
protected final static String Color = "blanco";
protected final static char C_energetico = 'F';
protected final static double Peso = 5 ;
private static final char '' = 0;




public Electrodomesticos() {
	this(P_base,Color,C_energetico,Peso);
}

//constructor con peso y precio
public Electrodomesticos(double p_base, double peso) {
	super();
	this.p_base = p_base;
	this.peso = peso;
}

//constructor todos los atributos definido e inicializado
public Electrodomesticos(double p_base, String color, char c_energetico, double peso) {
	super();
	this.p_base = p_base;
	this.color = color;
	this.c_energetico = c_energetico;
	this.peso = peso;
}


//getters  de todos los atributos
public double getP_base() {
	return p_base;
}


public void setP_base(double p_base) {
	this.p_base = p_base;
}


public String getColor() {
	return color;
}


public void setColor(String color) {
	this.color = color;
}


public char getC_energetico() {
	return c_energetico;
}


public void setC_energetico(char c_energetico) {
	this.c_energetico = c_energetico;
}


public double getPeso() {
	return peso;
}


public void setPeso(double peso) {
	this.peso = peso;
}
//METODO Consumo energetico
public void consumoEnerg(char consumo) {
if(c_energetico=='A') {
	System.out.println(85.000);
}
switch (C_energetico) {

}
	
	

}
//METODO COMPROBAR COLOR 

}
//METODO PRECIO FINAL
