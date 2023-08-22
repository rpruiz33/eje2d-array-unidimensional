package modelo;

public class ArregloUnidimensional {
private int[] vector;

public int[] getVector() {
	return vector;
}

public void setVector(int[] vector) {
	this.vector = vector;
}

public ArregloUnidimensional(int[] vector) {
	super();
	this.vector = vector;
}

public int traerElMenor() {

	int menor=vector[0];
	for (int i = 0; i < vector.length; i++) {
		if(menor>vector[i]) {
			menor=vector[i];
		}
		
	}
	
	return menor;
}
public int traerElMayor() {

	int mayor=vector[0];
	for (int j = 0; j < vector.length; j++) {
		if(mayor<vector[j]) {
			mayor=vector[j];
		}
		
	}
	
	return mayor;
}
public double calcularPromedio() {

	double acum=0;
	for (int j = 0; j < vector.length; j++) {
			acum+=vector[j];
		}
	return (double)acum/ vector.length;
		
	}
	
	

public int[] ordenarAscendente() {
	int aux;
	for (int i = 0; i < vector.length; i++) {
		for (int j = 0; j < vector.length-i-1; j++) {
			if(vector[j]>vector[j+1]) {
				aux=vector[j+1];
				vector[j+1]=vector[j];
				vector[j]=aux;
			}
		}
	}
	return vector;
	
}
public int[] ordenarDescendente() {
	int aux;
	for (int i = 0; i < vector.length; i++) {
		for (int j = 0; j < vector.length-i-1; j++) {
			if(vector[j]<vector[j+1]) {
				aux=vector[j+1];
				vector[j+1]=vector[j];
				vector[j]=aux;
			}
		}
	}
	return vector;
	
}

public double traerFrecuecia(int numero) {
	double contador=0;
	double frecuencia=0;
	for (int i = 0; i < vector.length; i++) {
		if(vector[i]==numero) {
			contador++;
		}
		
		
	}
frecuencia=contador/vector.length;
	return frecuencia ;
}
public int traerModa() {
	int pos=0;
	double contador2=0;
	double contador=0;

	for (int j = 0; j < vector.length; j++) {
		contador=0;
		for (int i = 0; i < vector.length; i++) {
			if(vector[i]==vector[j]) {
				contador++;
			}
		
		}
		if(contador2 < contador) {
			contador2=contador;
			pos=j;
		}
	}

	return vector[pos] ;
}
}