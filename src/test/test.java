package test;

import modelo.ArregloUnidimensional;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vector1 = { 3, 1, 5, 6,4,7,3,1,1 };
		ArregloUnidimensional vector = new ArregloUnidimensional(vector1);
		System.out.println(vector.traerElMenor());
		System.out.println(vector.traerElMayor());
		System.out.println(vector.calcularPromedio());
		vector1 = vector.ordenarAscendente();
		for (int i = 0; i < vector1.length; i++) {
			System.out.print(vector1[i] + " ");
		}
		System.out.println(" ");
		vector1 = vector.ordenarDescendente();
		for (int i = 0; i < vector1.length; i++) {
			System.out.print(vector1[i] + " ");
		}
		System.out.println(" ");
		System.out.println(vector.traerFrecuecia(8));
		System.out.println(vector.traerModa());
	}

}
