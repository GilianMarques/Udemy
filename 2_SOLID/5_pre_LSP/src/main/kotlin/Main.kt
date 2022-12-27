import domain.Quadrado
import domain.Retangulo

fun main(args: Array<String>) {

    val retangulo = Retangulo()

    retangulo.altura = 5f
    retangulo.largura = 10f
    val areaR = retangulo.getArea()

    println("Area do retangulo = $areaR")


    val quadrado = Quadrado()

    quadrado.altura = 5f
    val areaQ = quadrado.getArea()

    println("Area do quadrado = $areaQ")

    /*De acordo com o LSP devemos ser capazes de ultilizar uma classe
    * filha no lugar da classe pai, por tanto, devemos ser capazes de criar um retangulo
    * usando a classe quadrado ja que esta é filha da classe retangulo, porem
    * a classe quadrado sobrescreve as funçoes da classe retangulo para forçar
    * que altura e largura seja iguais (o que torna o quadrado diferente do retangulo)
    * e isso acaba ferindo o LSP. */

    val retanguloQuadrado = Quadrado()
    retanguloQuadrado.altura = 5f
    retanguloQuadrado.altura = 10f

    val areaRQ = retanguloQuadrado.getArea()
    println(
        "Area do retanguloQuadrado = $areaRQ e deveria ser ${5 * 10}"
    )

    /*Embora matematicamente falando, o quadrado seja um retangulo, programaticamente
    * falando nao funciona. A abstraçao deve ser mais refinada e considerar o comportamento
    * interno desses objetos dentro da aplicaçao*/

}