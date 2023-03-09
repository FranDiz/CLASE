package Almacen

abstract class Bebida (litros:Double, precio:Double, marca:String){
    var id:Int
    var litros:Double
    var precio:Double
    var marca:String
    init{
        id= idActual++
        this.litros=litros
        this.precio=precio
        this.marca=marca
    }

    override fun toString(): String {
        return "Bebida: id$id, litros$litros, precio$precio, marca$marca"
    }
    companion object{
        var idActual=1
    }
    open fun Calcular(cant_prod:Int):Double{
        return cant_prod*precio
    }
}