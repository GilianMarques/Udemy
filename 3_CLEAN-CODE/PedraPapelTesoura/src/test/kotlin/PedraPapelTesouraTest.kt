import junit.framework.TestCase

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class PedraPapelTesouraTest : TestCase() {
    @Test
    fun testarVitoriaAntecipada() {
        val j1 = MockJogador(Mao.TESOURA).apply { nome = "mJogador 1" }
        val j2 = MockJogador(Mao.PAPEL).apply { nome = "mJogador 2" }
        val jogo = PedraPapelTesoura(j1, j2, 5)
        jogo.jogar()

        assertEquals(j1, jogo.getVencedorSeHouver())
        assertEquals(3, jogo.partidasJogadas)
    }
}