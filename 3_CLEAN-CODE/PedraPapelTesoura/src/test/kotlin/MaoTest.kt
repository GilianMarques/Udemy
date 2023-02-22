import junit.framework.TestCase

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MaoTest : TestCase(){

    @Test
    fun verificarQualMaoVenceQual() {

        assertTrue(Mao.PEDRA.vence(Mao.TESOURA))
        assertTrue(Mao.TESOURA.vence(Mao.PAPEL))
        assertTrue(Mao.PAPEL.vence(Mao.PEDRA))

    }
}