import domain.ArquivoCsv
import domain.ArquivoTxt
import domain.Leitor

fun main(args: Array<String>) {

    println("Lendo txt:")
    val arquivoTxt = ArquivoTxt("/arquivos", "dados.txt")
    val leitorTxt = Leitor(arquivoTxt)
    println(leitorTxt.lerArquivo().joinToString("\n"))

    println("\nLendo csv:")
    val arquivoCsv = ArquivoCsv("/arquivos", "dados.csv")
    val leitorCsv = Leitor(arquivoCsv)
    println(leitorCsv.lerArquivo().joinToString("\n"))

}