package severo.ed;

import java.util.Date;

import severo.ed.helpers.Pedido;
import severo.ed.helpers.PlanPedido;

public class R53PreserveWholeObject {
	
	private Pedido pedido;
	private PlanPedido plan;

	public boolean planPorFecha() {
		Date inicio = pedido.getFechaPedido();
		Date fin = pedido.getFechaEnvio();
		return plan.dentroRango(inicio, fin);	
	}

}
