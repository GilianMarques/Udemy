import domain.Email
import domain.Mensageiro
import domain.Sms
import domain.WhatsApp

fun main() {
    /*
    * Agora que a classe 'Mensageiro' depende de da 'IMensagemToken' (uma abstração) é possivel extender a quantidade
    * de metodos de envio de tokens apenas criando uma nova classe que implemente 'IMensagemToken' e
    * injetando-a via construtor na 'Mensageiro' como feito com a classe 'WhatsApp'.
    */
    Mensageiro(Email()).enviar()

    Mensageiro(Sms()).enviar()

    Mensageiro(WhatsApp()).enviar()

}