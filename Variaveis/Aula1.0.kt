package Variaveis

fun main() {
    /*
* Aritimeticos: +, _, *, /, % (Soma, Subtração, Multilicação, Divisão, Módulo)
* Comparação: ==, !=, <, >, <=, >= (Igauldade, Diferença, Menor que, Maior que, Menor ou Igual, Maior ou Igual)
* Lógicos: &&, ||, ! (e, ou, não)
* Atribuiçao^: =, +=, -=, *=, /= (Atribuiçao, Atribuiçao Composta)
* Incremento/Decremento: ++, -- (Incremento, Decremento)
* Bitwise: and, or, xor, shl, shr, ushr (Operações bit a bit)
* outros: in, !in, is,!is, (Vericação de menbro, Verificaçao de tipo)
    */

    var n1 = 10
    var n2 = 20
    var Soma = n1 + n2

    var n3 = 30
    var n4 = 40
    var Subt = n3 - n4

    var n5 = 50
    var n6 = 63
    var Mult: Float = n5.toFloat() / n6

    var n7 = 70
    var n8 = 80
    var Div = n7 * n8

    // rem() mod() -> resto de uma divisao
    println(10%2)
    println(10.rem(2))
    println(10.mod(2))


    println("\n" + "Soma " + Soma)
    println("Soma " + (n1 + n2) + "\n")

    println("Subtração " + Subt)
    println("Subtração " + (n3 - n4) + "\n")

    println("Mult " + Mult)
    println("Mult " + (n5.toFloat() / n6) + "\n")

    println("Div " + Div)
    println("Div " + (n7 * n8) + "\n")
}

