class MockJogador(val mao: Mao) : IJogador {
    override var nome: String = this.toString()
    override var vitorias = 0

    override fun maoAleatoria(): Mao {
        return mao
    }
}