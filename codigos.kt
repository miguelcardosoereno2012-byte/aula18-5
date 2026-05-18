class PedidoProcessor {
 fun processarPedido(pedido: Pedido) {
when (pedido.status) {
  "novo" -> {
     println("Pedido em processamento: ${pedido.id}")
     Thread.sleep(2000) // Simulando processamento
      }
   "processado" -> {
      println("Pedido já processado: ${pedido.id}")
       }
    else -> {
      println("Status desconhecido do pedido: ${pedido.id}")
       }
     }
 }
 }
