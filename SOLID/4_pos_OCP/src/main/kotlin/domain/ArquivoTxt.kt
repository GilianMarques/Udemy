package domain

import java.io.File

class ArquivoTxt(diretorio: String, arquivo: String) : Arquivo(diretorio, arquivo) {

    override fun lerArquivo() {
        val caminho = "$diretorio/$arquivo"
        val root = "C:\\GitHub_Desktop\\Udemy\\SOLID\\3_pre_OCP\\src\\main\\resources"

        val removerEspacosRegex = Regex("[ ]+")


        File("$root//$caminho").forEachLine { linha ->
            val cpf = linha.substring(0, 11)
            val nome = linha.substring(11, 41)
            val email = linha.substring(41, 72)

            setDados(
                removerEspacosRegex.replace(nome, " ").trim(),
                removerEspacosRegex.replace(cpf, " ").trim(),
                removerEspacosRegex.replace(email, " ").trim()
            )
        }

    }

}