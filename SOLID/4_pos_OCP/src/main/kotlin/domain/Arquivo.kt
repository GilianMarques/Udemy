package domain

abstract class Arquivo(
    protected val diretorio: String,
    protected val arquivo: String
) {

    val dados = ArrayList<Triple<String, String, String>>()

    abstract fun lerArquivo()

    protected fun setDados(nome: String, cpf: String, email: String) {
        dados.add(Triple(nome, cpf, email))
    }

}