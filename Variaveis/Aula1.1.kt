package Variaveis

fun main() {

    var Idade: Byte
    Idade = 22
    var Idade2: Byte = 22
    var Idade3 = 22



    var NumeroFloat = 100.5F
    var NumeroFloat1: Float
        NumeroFloat1 = 0.1F + 0.2F + 0.3F



    var NumeroDouble = 150.0
    var NumeroDouble1: Double
        NumeroDouble1 = 0.1 + 0.2 + 0.3



    var EstaChovendo: Boolean = false
    var EstaChovendo1 = true


    var Caracter: Char ='M'
    var Caracter1 = 'F'


    var s1 : String = "Sol"
    var s2 = "Sol"
    var s3 = StringBuilder().append("S").append("ol").toString()




    println("Byte " + Idade)
    println("Byte " + Idade2)
    println("Byte " + Idade3 + "\n")

    println("Float " + NumeroFloat)
    println("Flaot " + NumeroFloat1 + "\n")

    println("Double " + NumeroDouble)
    println("Double " + NumeroDouble1 + "\n")

    println("Boolean " + EstaChovendo)
    println("Boolean " + EstaChovendo1 + "\n")

    println("Char " + Caracter)
    println("char " + Caracter1 + "\n")

    println("String " + s1)
    println("String " + s2)
    println("String " + s3)
    println("String " + (s1 == s3))
    println("String " + (s1 === s3))
}