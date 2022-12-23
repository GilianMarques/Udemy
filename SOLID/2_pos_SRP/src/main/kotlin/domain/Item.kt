package domain


class Item() {

    var descricao: String = ""
        set(value) {
            field = Regex("[^çÇa-zA-Z0-9,. ]").replace(value, "")
        }

    var valor: Float = 0f
        set(value) {
            field = if (value > 999f) 999f
            else if (value < 0) 1f
            else value
        }

    init {
        println("Item valido? ${validarItem()}")

    }

    fun validarItem(): Boolean {
        if (descricao.isEmpty()) return false
        if (valor <= 0f) return false
        return true
    }
}