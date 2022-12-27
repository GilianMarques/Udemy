import domain.Leitor

fun main(args: Array<String>) {

    println("Lendo txt:")
    val leitorTxt = Leitor(diretorio = "/arquivos", arquivo = "dados.txt")
    println(leitorTxt.lerArquivo().joinToString("\n"))

    println("\nLendo csv:")
    val leitorCsv = Leitor(diretorio = "/arquivos", arquivo = "dados.csv")
    println(leitorCsv.lerArquivo().joinToString("\n"))

}