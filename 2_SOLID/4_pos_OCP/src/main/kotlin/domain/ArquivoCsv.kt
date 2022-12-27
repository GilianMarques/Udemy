package domain

import java.io.File

class ArquivoCsv(diretorio: String, arquivo: String) : Arquivo(diretorio, arquivo) {

    override fun lerArquivo() {
        val caminho = "$diretorio/$arquivo"
        val root = "C:\\GitHub_Desktop\\Udemy\\SOLID\\3_pre_OCP\\src\\main\\resources"

        File("$root//$caminho").forEachLine { linha ->
            val (nome, cpf, email) = linha.split(";")
            setDados(nome, cpf, email)
        }

    }

}