package domain

import domain.interfaces.IMensagemToken

class Sms:IMensagemToken {
    override fun enviarToken() {
        println("Token enviado via Sms...")
    }
}