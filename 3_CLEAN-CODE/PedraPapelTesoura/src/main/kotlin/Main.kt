import kotlin.random.Random

/**
 *
 * O proposito desse projeto é praticar a habilidade de resolver problemas usando classes e orientação a objetos
 *
 * Classes:
 *  PedraPapelTesoura: recebe um par de jogadores e um numero de partidas, controla o fluxo do jogo
 *  Partida: recebe um par de jogadores e avalia quem venceu ou se deu empate
 *  Jogador: recebe um nome e da uma mao aleatoria
 *  Mao (Enum) : pode ser pedra, papel ou tesoura
 *
 * A classe PedraPapelTesoura itera pela quantidade de partidas , usando a classe Partida para comparar as maos e obter um
 * vencedor (caso haja), contabilizando o resultado e ao fim de cada partida verifica se ja existe um vencedor e
 * interrompe o jogo em caso de vitoria antecipada
 */
fun main() {

    val j1 = Jogador("Jogador 1")
    val j2 = Jogador("Jogador 2")

    PedraPapelTesoura(j1, j2, 5).jogar()

}

interface IJogador {
    val nome: String
    fun maoAleatoria(): Mao
}

data class Jogador(override val nome: String) : IJogador {
    override fun maoAleatoria() = Mao.values()[Random.nextInt(3)]
}

enum class Mao {
    PEDRA,
    PAPEL,
    TESOURA;

    /**
     * @return false se a mao atual nao vence ou empata com a mao recebida
     * */
    fun vence(outraMao: Mao) = when (this) {
        //Pedra vence Tesoura, Tesoura vence Papel, Papel vence Pedra
        PEDRA -> outraMao == TESOURA
        TESOURA -> outraMao == PAPEL
        PAPEL -> outraMao == PEDRA
    }

}

class Partida(val jogador1: IJogador, val jogador2: IJogador) {

    var j2Mao: Mao
        private set

    var j1Mao: Mao
        private set

    init {
        j1Mao = jogador1.maoAleatoria()
        j2Mao = jogador2.maoAleatoria()
        exibirJogadas()
    }

    private fun exibirJogadas() {
        print("${jogador1.nome} escolheu ${j1Mao.name}, ${jogador2.nome} escolheu ${j2Mao.name}: ")
    }

    fun getVencedor(): IJogador? {
        return if (j1Mao == j2Mao) null
        else if (j1Mao.vence(j2Mao)) jogador1
        else jogador2

    }
}

class PedraPapelTesoura(val jogador1: IJogador, val jogador2: IJogador, val partidas: Int) {

    private var vitoriasJogador1 = 0
    private var vitoriasJogador2 = 0

    fun jogar() {
        for (i in 0 until partidas) {
            val partida = Partida(jogador1, jogador2)

            contabilizarResultado(partida)
            if (houveVitoriaAntecipada()) break
        }

        exibirPossivelVencedor()
    }

    private fun contabilizarResultado(partida: Partida) {

        val vencedor = partida.getVencedor()

        if (vencedor == null) println("Empate")
        else if (vencedor == jogador1) {
            vitoriasJogador1++
            println("${jogador1.nome} venceu rodada")
        } else {
            vitoriasJogador2++
            println("${jogador2.nome} venceu rodada")
        }

    }

    private fun houveVitoriaAntecipada(): Boolean {
        return ((vitoriasJogador1 != vitoriasJogador2)
                && (vitoriasJogador1 > (partidas / 2)
                || vitoriasJogador2 > (partidas / 2)))
    }

    private fun exibirPossivelVencedor() {
        println("\n")
        if (vitoriasJogador1 == vitoriasJogador2)
            println("Empate! $vitoriasJogador1/$vitoriasJogador2")
        else {
            val vencedor = if (vitoriasJogador1 > vitoriasJogador2) jogador1 else jogador2
            println(
                "Vencedor da partida é o ${vencedor.nome}: " +
                        "${vitoriasJogador1.coerceAtLeast(vitoriasJogador2)}" +
                        "/" +
                        "${vitoriasJogador1.coerceAtMost(vitoriasJogador2)}"
            )
        }

    }


}