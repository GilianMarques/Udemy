package domain.interfaces

import domain.Log
import domain.Notificacao

interface ILog {

    fun registrar(log: Log)
}