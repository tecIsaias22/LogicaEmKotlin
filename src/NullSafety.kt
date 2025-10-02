class Carro {
    var cor = "Vermelho"

    fun acelerar(){
        //***
    }
}
fun main(){
    val carro: Carro? = null
    // carro = carro()
    // ***
    //println(carro?.cor);
   /* if (carro != null){
        println(carro.cor)
    }*/
    val cor = carro?.cor ?: "cor padrão"
    //println(carro?.cor)
    println(cor)

}