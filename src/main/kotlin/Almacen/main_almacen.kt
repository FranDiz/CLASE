package Almacen

fun main(){
    var cocacola=BebidaAzucarada(2.0, 1.5, "Coca-cola", 15, true)
    var almacen1=Almacen()
    almacen1.estanteria1.add(cocacola)
    for (i in almacen1.estanteria1){
        println(i)
    }
}