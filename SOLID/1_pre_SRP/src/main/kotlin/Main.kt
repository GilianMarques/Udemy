fun main() {

    val carrinho1 = CarrinhoDeCompras();

    println(carrinho1.exibirItens());
    println("Valor total: ${carrinho1.exibirValorTotal()}")


    carrinho1.addItem("Bicicleta", 750.10f)
    carrinho1.addItem("Galadeira", 1950.15f)
    carrinho1.addItem("Tapete", 350.20f)


    println("<br />")
    println(carrinho1.exibirItens());
    println("Valor total recalculado: ${carrinho1.exibirValorTotal()}")

    println("<br />")
    println("status: ${carrinho1.exibirStatus()}")


    carrinho1.addItem("Televisão 65", 3570.25f)

    println("<br />")
    if (carrinho1.confirmarPedido()) {
        println("Pedido realizado com sucesso!")
    } else {
        println("Erro na confirmação do pedido. Carrinho não possui itens")
    }
    println("<br />")
    println("status: ${carrinho1.exibirStatus()}")
}