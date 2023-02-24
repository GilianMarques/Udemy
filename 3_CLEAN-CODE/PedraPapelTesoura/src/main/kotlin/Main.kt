import kotlin.random.Random

/**
 *
 * O proposito desse projeto é praticar a habilidade de resolver problemas usando classes e orientação a objetos
 *
 * Classes:
 *  PedraPapelTesoura: recebe um par de jogadores e um numero de partidas, controla o fluxo do jogo
 *  Partida: recebe um par de jogadores e avalia quem venceu ou se deu empate
 *  Jogador: recebe um nome, armazena sua pontuaçao e da uma mao aleatoria
 *  Mao (Enum) : pode ser pedra, papel ou tesoura
 *
 * A classe PedraPapelTesoura itera pela quantidade de partidas , usando a classe Partida para comparar as maos e obter um
 * vencedor (caso haja), contabilizando o resultado e ao fim de cada partida verifica se ja existe um vencedor e
 * interrompe o jogo em caso de vitoria antecipada
 */
fun main() {

    val jogador1 = Jogador("Jogador 1")
    val jogador2 = Jogador("Jogador 2")

    PedraPapelTesoura(jogador1, jogador2, 5).jogar()

    exibirResultado(jogador1, jogador2)

}

private fun exibirResultado(jogador1: IJogador, jogador2: IJogador) {
    println("\n")
    if (jogador1.vitorias == jogador2.vitorias)
        println("Empate! ${jogador1.vitorias}/${jogador2.vitorias}")
    else {
        val vencedor = if (jogador1.vitorias > jogador2.vitorias) jogador1 else jogador2
        println(
            "Vencedor da partida é o ${vencedor.nome}: " +
                    "${jogador1.vitorias.coerceAtLeast(jogador2.vitorias)}" +
                    "/" +
                    "${jogador1.vitorias.coerceAtMost(jogador2.vitorias)}"
        )
    }

}

interface IJogador {
    val nome: String
    var vitorias: Int

    fun maoAleatoria(): Mao
}

data class Jogador(override val nome: String) : IJogador {
    override var vitorias = 0
    override fun maoAleatoria() = Mao.values()[Random.nextInt(3)]
}

enum class Mao {
    PEDRA,
    PAPEL,
    TESOURA;

    /**
     * @return false se a mao atual nao vence ou empata com a mao recebida
     * */
    infix fun vence(outraMao: Mao) = when (this) {
        //Pedra vence Tesoura, Tesoura vence Papel, Papel vence Pedra
        PEDRA -> outraMao == TESOURA
        TESOURA -> outraMao == PAPEL
        PAPEL -> outraMao == PEDRA
    }

}

class Partida(val jogador1: IJogador, val jogador2: IJogador) {

    var maoJogador2: Mao
        private set

    var maoJogador1: Mao
        private set

    init {
        maoJogador1 = jogador1.maoAleatoria()
        maoJogador2 = jogador2.maoAleatoria()
        exibirJogadas()
    }

    private fun exibirJogadas() {
        print("${jogador1.nome} escolheu ${maoJogador1.name}, ${jogador2.nome} escolheu ${maoJogador2.name}: ")
    }

    fun getVencedorSeHouver(): IJogador? {
        return if (maoJogador1 == maoJogador2) null
        else if (maoJogador1 vence maoJogador2) jogador1
        else jogador2

    }
}

class PedraPapelTesoura(val jogador1: IJogador, val jogador2: IJogador, val partidas: Int) {

    var partidasJogadas = 0
        private set

    fun jogar() {
        for (i in 0 until partidas) {
            val partida = Partida(jogador1, jogador2)
            partidasJogadas++

            contabilizarResultado(partida)
            if (houveVitoriaAntecipada()) break
        }
    }

    private fun contabilizarResultado(partida: Partida) {

        val vencedor = partida.getVencedorSeHouver()

        if (vencedor == null) println("Empate")
        else if (vencedor == jogador1) {
            jogador1.vitorias++
            println("${jogador1.nome} venceu rodada")
        } else {
            jogador2.vitorias++
            println("${jogador2.nome} venceu rodada")
        }

    }

    private fun houveVitoriaAntecipada(): Boolean {
        return ((jogador1.vitorias != jogador2.vitorias)
                && (jogador1.vitorias > (partidas / 2)
                || jogador2.vitorias > (partidas / 2)))
    }


    fun getVencedorSeHouver(): IJogador? {
        return if (jogador1.vitorias == jogador2.vitorias) null
        else if (jogador1.vitorias > jogador2.vitorias) jogador1
        else jogador2

    }


}