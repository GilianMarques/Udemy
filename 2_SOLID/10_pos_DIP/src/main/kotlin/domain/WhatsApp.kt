package domain

import domain.interfaces.IMensagemToken

class WhatsApp: IMensagemToken {
    override fun enviarToken() {
        println("Token enviado via WhatsApp...")
    }
}