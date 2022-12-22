import domain.EmailService
import domain.Item
import domain.Pedido

fun main() {

    val pedido = Pedido()

    val item1 = Item().also { item1 ->
        item1.descricao = "Porta copos"
        item1.valor = 4.55f
    }

    val item2 = Item().also { item2 ->
        item2.descricao = "Lampada"
        item2.valor = 8.32f
    }

    pedido.carrinho.adicionarItem(item1)
    pedido.carrinho.adicionarItem(item2)

    /****************************************************************************************/

    println("Itens do carrinho:")
    pedido.carrinho.getItens().forEach { println(it) }
    println("")

    /****************************************************************************************/

    println("Valor do pedido:")
    val valorTotal =
        pedido.carrinho.getItens().sumOf { it.valor.toDouble() }
    println(valorTotal)
    println("")

    /****************************************************************************************/

    println("Carrinho esta valido? ${pedido.carrinho.validarCarrinho()}")

    /****************************************************************************************/

    println("Status do do pedido: ${pedido.status}")

    /****************************************************************************************/

    println("Confirmando pedido... ${pedido.confirmar()}")

    println("Statudo do pedido: ${pedido.status}")

    /****************************************************************************************/

    if (pedido.status == "confirmado") EmailService.enviarEmailConfirmacao()

}