package severo.ed;

public class R31SelfEncapsulateField {

	private int bajo, alto;

	boolean incluye(int arg) {
		return arg >= bajo && arg <= alto;
	}

}
