package domain

class EmailService(
    val de: String = "contato@site.com.br",
    val para: String,
    val assunto: String,
    val conteudo: String
) {

    companion object {
        fun enviarEmailConfirmacao() {
            println("\n.... envia e-mail de confirmação ...\n")
        }
    }

}