package domain

class Leitor(
    val diretorio: String = "/arquivos", val arquivo: String = "dados.csv"
) {

    fun lerArquivo(): ArrayList<Triple<String, String, String>> {
        val arquivoImpl = Arquivo()

        when (arquivo.split(".")[1]) {
            "csv" -> arquivoImpl.lerArquivoCsv("$diretorio/$arquivo")
            "txt" -> arquivoImpl.lerArquivoTxt("$diretorio/$arquivo")
        }

        return arquivoImpl.dados
    }


}