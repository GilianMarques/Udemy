import junit.framework.TestCase
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class PartidaTest : TestCase() {

    class MockJogador(val mao: Mao) : IJogador {
        override val nome: String = this.toString()
        override fun maoAleatoria(): Mao {
            return mao
        }
    }

    @Test
    fun getVencedor_DeveRetornarNull() {

        val vencedor = Partida(MockJogador(Mao.PEDRA), MockJogador(Mao.PEDRA)).getVencedor()
        assertNull(vencedor)
    }

    @Test
    fun getVencedor_DeveRetornarJogador1() {

        val j1 = MockJogador(Mao.TESOURA)
        val j2 = MockJogador(Mao.PAPEL)
        val vencedor = Partida(j1, j2).getVencedor()

        assertEquals(j1, vencedor)
    }

    @Test
    fun getVencedor_DeveRetornarJogador2() {

        val j1 = MockJogador(Mao.TESOURA)
        val j2 = MockJogador(Mao.PEDRA)
        val vencedor = Partida(j1, j2).getVencedor()

        assertEquals(j2, vencedor)
    }
}