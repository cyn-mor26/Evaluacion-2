package Evaluacion_individual;

public class lavadora extends Electrodomesticos {

	//atributo
private double carga;

//constante
protected final static double Carga= 5;

// constructor por defecto
public lavadora(double carga) {
	this.carga= carga;
}

public lavadora(double p_base, String color, char c_energetico, double peso, double carga) {
	super(p_base, color, c_energetico, peso);
	this.carga= carga;
}
//constructor con precio y peso
public lavadora(double p_base, double peso) {
	super();
	// TODO Auto-generated constructor stub

}

public double getCarga() {
	return carga;
}

public void setCarga(double carga) {
	this.carga = carga;
}

//metodo precio final
public double precioFinal(double precio) {
	if (Carga >30 *(+140000)) {
		return precio;
	}else 
	return this.p_base;
}

@Override
public String toString() {
	return "lavadora [carga=" + carga + "]";
}
}



