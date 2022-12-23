package domain

class Pedido {

    var status = "aberto"
    val carrinho = CarrinhoCompra()


    fun confirmar(): Boolean {
        return if (carrinho.validarCarrinho()) {
            status = "confirmado"
            true
        } else false
    }

    fun exibirStatus() = status

    fun exibirValorPedido(): Float {
        // o valor do pedido nao se limita aos itens apenas
        // futuramente podem haver descontos e frete embutidos no pedido
        return carrinho.getValorTotalItens().toFloat()
    }


}