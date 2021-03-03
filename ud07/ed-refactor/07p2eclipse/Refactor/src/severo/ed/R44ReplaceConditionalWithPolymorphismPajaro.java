package severo.ed;

public class R44ReplaceConditionalWithPolymorphismPajaro {

	private int cantidadCocos;
	private double voltaje;
	private boolean isNailed;

	enum Tipo {
		EUROPEO, AFRICANO, NORUEGO_AZUL;
	}

	double getSpeed(Tipo tipo) {
		switch (tipo) {
		case EUROPEO:
			return getVelocidadBase();
		case AFRICANO:
			return getVelocidadBase() - getFactorCarga() * cantidadCocos;
		case NORUEGO_AZUL:
			return (isNailed) ? 0 : getVelocidadBase(voltaje);
		}
		throw new RuntimeException("Error, no debería llegar aquí");
	}

	private double getVelocidadBase(double voltaje) {
		// TODO Auto-generated method stub
		return 0;
	}

	private double getVelocidadBase() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private int getFactorCarga() {
		// TODO Auto-generated method stub
		return 0;
	}


}
