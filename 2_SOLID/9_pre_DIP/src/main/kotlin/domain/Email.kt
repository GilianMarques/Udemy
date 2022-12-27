package domain

import domain.interfaces.IMensagemToken

class Email: IMensagemToken {
    override fun enviarToken() {
        println("Token enviado via Email...")
    }
}