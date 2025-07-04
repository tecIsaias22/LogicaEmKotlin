package Variaveis

fun main() {
    /*

 * Imprime o que voce escrever entre os dois parente no verde
 * print("Ola mundo")

 * Imprime o que voce escrever entre os dois parente no verde
 * print("Espero que voce esteja bem?")

 * Numeros
 * Tipo tamanho (bits) faixa de valores
 *
 * Byte | UByte      8      - 126 A 127                              | 0 A 255 (u) unsigned
 * Short | UShort    16     - 32_768 A 32_767                        | o A 655535 (u)
 * Int | UInt        32     - 2_147_483_648 A 2_147_483_647          | 0 A 4294967295 (u)
 * Long | ULong      64     - 9 223_372_036_854_775_807 A
                              9 223_372_036_854_775_808              | 0 A 18446744073709551615 A 9 (u)

 * Float             32       Aproximadamente +3.4 X 10^38
 * Double            64       Aproximadamente +1.7 X 10^308


 * Boolean           8
 * char              16

    */

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