package domain

import domain.interfaces.IMensagemToken

// classe de alto nivel. Ela tem as instancias  das dependencias que usa
class Mensageiro  (private val canal: Canal) {

    fun enviar() {
        when (canal) {
            Canal.Email -> Email().enviarToken() // classe de baixo nivel
            Canal.Sms -> Sms().enviarToken() // classe de baixo nivel
        }
    }

    enum class Canal(val c: Int) {
        Email(0),
        Sms(1)
    }
}