import domain.Mensageiro
import domain.Mensageiro.Canal.Email
import domain.Mensageiro.Canal.Sms

fun main() {

    // Mensageiro é a classe de alto nivel por que ela tem as instâncias das dependencias
    // que usa que sao Email e Sms, essas, sao classes de baixo nivel.
    // De acordo com o DIP, classes de alto e baixo nivel devem depender de abstraçoes
    // que por sua vez podem ser classes abstratas ou interfaces

    Mensageiro(Email).enviar()

    Mensageiro(Sms).enviar()

}