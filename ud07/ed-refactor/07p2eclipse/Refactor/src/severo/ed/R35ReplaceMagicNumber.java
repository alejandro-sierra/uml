    package severo.ed;

public class R35ReplaceMagicNumber {

    static final double CONSTANTE_GRAVITACIONAL = 9.81;
    
	double energiaPotencial(double masa, double altura) {
		return masa * altura * CONSTANTE_GRAVITACIONAL;
	}
}
