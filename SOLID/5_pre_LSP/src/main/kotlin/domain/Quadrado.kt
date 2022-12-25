package domain

class Quadrado : Retangulo() {


    override var largura = 0f
        set(value) {
            field = value
            if (altura != value) altura = value
        }

    override var altura = 0f
        set(value) {
            field = value
            if (largura != value) largura = value
        }

}
