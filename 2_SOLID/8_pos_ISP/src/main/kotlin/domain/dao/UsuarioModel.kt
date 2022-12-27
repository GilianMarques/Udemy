package domain.dao

import domain.BD
import domain.Log
import domain.Notificacao
import domain.interfaces.ICadastro
import domain.interfaces.ILog
import domain.interfaces.INotificacao

class UsuarioModel : BD(), ICadastro, INotificacao, ILog {
    override fun salvar() {
        TODO("Not yet implemented")
    }

    override fun registrar(log: Log) {
        TODO("Not yet implemented")
    }

    override fun enviarNotificacao(notificacao: Notificacao) {
        TODO("Not yet implemented")
    }
}