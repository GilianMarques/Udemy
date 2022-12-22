class CarrinhoDeCompras {

    private val itens = ArrayList<Pair<String, Float>>()
    private var status = ""
    private var valorTotal = 0f

    fun exibirItens() = itens

    private fun validarItem(item: String, valor: Float): Boolean {
        if (item.isEmpty()) return false
        if (valor <= 0f) return false
        return true
    }


    fun addItem(item: String, valor: Float): Boolean {

        if (validarItem(item, valor)) {
            itens.add(item to valor)
            valorTotal += valor
            return true
        }

        return false
    }

    fun exibirValorTotal() = valorTotal

    fun exibirStatus() = status

    fun confirmarPedido(): Boolean {
        if (validarCarrinho()) {
            status = "confirmado"
            enviarEmailConfirmacao()
            return true
        }
        return false
    }

    private fun enviarEmailConfirmacao() {
        println("\n.... envia e-mail de confirmação ...\n")
    }

    fun validarCarrinho(): Boolean {
        return itens.size > 0
    }

}