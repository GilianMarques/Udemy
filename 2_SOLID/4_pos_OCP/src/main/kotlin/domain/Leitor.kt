package domain

class Leitor(private val arquivo: Arquivo) {

    fun lerArquivo(): ArrayList<Triple<String, String, String>> {
        arquivo.lerArquivo()
        return arquivo.dados
    }


}