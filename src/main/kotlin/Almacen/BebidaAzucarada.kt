package Almacen

class BebidaAzucarada(litros:Double, precio:Double, marca:String, porcentajeAzucar:Int, promocion:Boolean): Bebida(litros, precio, marca) {
    var porcentajeAzucar:Int
    var promocion:Boolean
    init{
        this.porcentajeAzucar=porcentajeAzucar
        this.promocion=promocion
    }

    override fun toString(): String {
        return super.toString(); "porcentaje=$porcentajeAzucar"
    }
    override fun Calcular(cant_prod: Int): Double {
        if (promocion){
            return super.Calcular(cant_prod)*0.9
        }
        else{
            return super.Calcular(cant_prod)
        }
    }
}