package programação_orientada_a_objetos.aula07.ObjetoPrincipal.Exemplo;

import programação_orientada_a_objetos.aula07.Enum.Exemplo.StatusPedidos;

public class PedidoPrincipa {

	public static void main(String[] args) {
		StatusPedidos pedido = StatusPedidos.AGUARDANDO_PAGAMENTO;
		System.out.println("Seu pedido está: " + pedido);

	}

}
