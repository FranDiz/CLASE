package Compra

class Perecedero(nombre:String, precio:Double, var diasCaduca:Int): Producto(nombre, precio) {
    init {
       this.diasCaduca=diasCaduca
    }


    override fun Calcular(cant_prod:Int) : Double{
        if (diasCaduca==1){
            return super.Calcular(cant_prod)/4
        }
        if (diasCaduca==2){
            return super.Calcular(cant_prod)/3
        }
        if(diasCaduca==3){
            return super.Calcular(cant_prod)/2
        }
        return TODO("Provide the return value")
    }
}