package Almacen

class AguaMineral(litros:Double, precio:Double, marca:String,origen:String):Bebida(litros, precio, marca) {
    var origen:String
    init {
        this.origen=origen
    }
}