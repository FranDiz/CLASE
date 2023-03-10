package Compra

abstract class Producto(nombre:String, precio:Double) {
    var nombre= "producto"
    var precio:Double = 0.0
        get() {
            return field
        }

        set(value) {
            return field = value
        }

    open fun Calcular(cant_prod:Int): Double {
        return cant_prod*precio
    }

}