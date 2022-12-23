package domain

class CarrinhoCompra {

    private val itens = ArrayList<Item>()

    fun adicionarItem(item: Item) {
        itens.add(item)
    }

    fun getItens() = itens

    fun getValorTotalItens() = itens.sumOf { it.valor.toDouble() }

    fun validarCarrinho() = itens.size > 0

    fun exibirItens() = itens
    /*
        fun addItem(item: String, valor: Float): Boolean {
            itens.add(item to valor)
            valorTotal += valor
            return true
        }*/


}