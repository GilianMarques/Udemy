package domain

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource


internal class ItemTest {

    @Test
    fun validarEstadoInicialItem() {
        val testItem = Item()
        assertEquals(testItem.descricao, "")
        assertEquals(testItem.valor, 0f)
    }

    @Test
    fun validarItem() {
        val testItem = Item()

        testItem.descricao = ""
        testItem.valor = -1f
        assertFalse(testItem.validarItem())

        testItem.descricao = "desc"
        testItem.valor = 1f
        assert(testItem.validarItem())

    }

    @Test
    fun getDescricao() {

        val testItem = Item()

        val descricao = "de#$%¨&*scriçao@ %¨&*(qualquer#*"
        testItem.descricao = descricao // setter limpa a string usando regex
        // getter retorna a string limpa que é verificada no teste
        assertEquals("descriçao qualquer", testItem.descricao)


        val descricao2 = "descriçao simples"
        testItem.descricao = descricao2
        assertEquals("descriçao simples", testItem.descricao)
    }


    @ParameterizedTest
    @MethodSource("getValorMethodSource")
    fun getValor(entrada: Float, saida: Float) {

        val item = Item()
        item.valor = entrada
        assertEquals(saida, item.valor)
    }

    companion object {
        @JvmStatic
        fun getValorMethodSource() = listOf(
            Arguments.of(45f , 45f),
            Arguments.of(-500f , 1f),
            Arguments.of(150_000f , 999f),
            Arguments.of(0f , 0f),
            Arguments.of(60f , 60f),
            Arguments.of(-2f , 1f),
            Arguments.of(1000f , 999f)
        )
    }

}