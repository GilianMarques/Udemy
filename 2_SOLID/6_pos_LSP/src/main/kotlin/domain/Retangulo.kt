package domain

open class Retangulo : Poligono() {

    open var largura = 0f
    open var altura = 0f

    override fun getArea() = altura * largura

}