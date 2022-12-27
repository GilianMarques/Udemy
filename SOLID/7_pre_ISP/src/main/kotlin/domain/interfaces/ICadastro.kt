package domain.interfaces

import domain.Log
import domain.Notificacao

interface ICadastro {

    fun salvar()

    fun registrar(log: Log)

    fun enviarNotificacao(notificacao: Notificacao)

}