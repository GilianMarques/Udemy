package domain.dao

import domain.BD
import domain.Log
import domain.Notificacao
import domain.interfaces.ICadastro
import domain.interfaces.INotificacao

class LeadModel: BD(), ICadastro,INotificacao {
    override fun salvar() {
        TODO("Not yet implemented")
    }

    override fun enviarNotificacao(notificacao: Notificacao) {
        TODO("Not yet implemented")
    }
}