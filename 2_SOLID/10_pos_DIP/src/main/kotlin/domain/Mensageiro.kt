package domain

import domain.interfaces.IMensagemToken

class Mensageiro(private val mensageiro: IMensagemToken) {

    fun enviar() {
        mensageiro.enviarToken()
    }

}