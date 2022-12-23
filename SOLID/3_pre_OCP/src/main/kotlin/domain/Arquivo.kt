package domain

import java.io.File

class Arquivo {

    val dados = ArrayList<Triple<String, String, String>>()
    fun lerArquivoCsv(caminho: String) {

        val root = "C:\\GitHub_Desktop\\Udemy\\SOLID\\3_pre_OCP\\src\\main\\resources"

        File("$root//$caminho").forEachLine { linha ->
            val (nome, cpf, email) = linha.split(";")
            setDados(nome, cpf, email)
        }

    }
    fun lerArquivoTxt(caminho: String) {

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
    private fun setDados(nome: String, cpf: String, email: String) {
        dados.add(Triple(nome, cpf, email))
    }

}