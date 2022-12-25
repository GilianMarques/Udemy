import domain.Quadrado
import domain.Retangulo

fun main() {


    /*Nessa refatoração o professor optou por nao extender as classes retangulo e quadrado de poligono
    * e sim usar a classe poligono para calcular a area de uma instancia de uma dessas duas.
    * Apos alguma ponderaçao, optei por fazer a herança ja que ambas as classes tem a funçao de calcular
    * area e sobrescrever essa funçao nao impediria que alguma das classes filha fosses usada no lugar
    * da classe pai, que é o pilar do LSP.
    * */
    val retangulo = Retangulo()

    retangulo.altura = 5f
    retangulo.largura = 10f
    val areaR = retangulo.getArea()

    println("Area do retangulo = $areaR")


    val quadrado = Quadrado()

    quadrado.tamanho = 5f
    val areaQ = quadrado.getArea()

    println("Area do quadrado = $areaQ")


}