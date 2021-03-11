package severo.ed;

/**
 * 
 * @author Alejandro Ballesta Sierras
 */

/**
 * Teniamos una variable para almacenar varios datos, y hemos creado dos 
 * vaiables finales para poder reutilizarlas si fuera necesario.
 */

/*
package severo.ed;

public class R16SplitTemporaryVariable {

	public void ejemplo(double altura, double anchura) {
		double temp = 2 * (altura + anchura);
		System.out.println(temp);
		temp = altura * anchura;
		System.out.println(temp);
	}
}

*/

public class R16SplitTemporaryVariable {

	public void ejemplo(double altura, double anchura) {
            final double perimetro = 2 * (altura + anchura);
            System.out.println("perimetro = " + perimetro);
            final double area = altura * anchura;
            System.out.println("area = " + area);
	}
}
