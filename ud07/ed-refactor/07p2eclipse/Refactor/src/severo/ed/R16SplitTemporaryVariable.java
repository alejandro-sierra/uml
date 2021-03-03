package severo.ed;

public class R16SplitTemporaryVariable {

	public void ejemplo(double altura, double anchura) {
		double temp = 2 * (altura + anchura);
		System.out.println(temp);
		temp = altura * anchura;
		System.out.println(temp);
	}
}
