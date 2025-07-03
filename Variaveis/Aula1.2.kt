package Variaveis

import java.util.Properties

const val s2: String = "Maria"

fun main(){

    var s5 = "Matheus"
    println(s5)
    s5 = "Carlos"
    println(s5)

    val s1 : String ="Isaias"
    println(s1)

}

class Exemplo {
    companion object{
        const val s3 ="Ana"
    }
}
class Exemplu {
    companion object{
        val s4 = Properties().propertyNames()
    }
}