package domain.interfaces

import domain.Log
import domain.Notificacao

interface INotificacao {

    fun enviarNotificacao(notificacao: Notificacao)

}