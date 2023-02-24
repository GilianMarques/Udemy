import junit.framework.TestCase
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class PartidaTest : TestCase() {



    @Test
    fun getVencedor_DeveRetornarNull() {

        val vencedor = Partida(MockJogador(Mao.PEDRA), MockJogador(Mao.PEDRA)).getVencedorSeHouver()
        assertNull(vencedor)
    }

    @Test
    fun getVencedor_DeveRetornarJogador1() {

        val j1 = MockJogador(Mao.TESOURA)
        val j2 = MockJogador(Mao.PAPEL)
        val vencedor = Partida(j1, j2).getVencedorSeHouver()

        assertEquals(j1, vencedor)
    }

    @Test
    fun getVencedor_DeveRetornarJogador2() {

        val j1 = MockJogador(Mao.TESOURA)
        val j2 = MockJogador(Mao.PEDRA)
        val vencedor = Partida(j1, j2).getVencedorSeHouver()

        assertEquals(j2, vencedor)
    }
}