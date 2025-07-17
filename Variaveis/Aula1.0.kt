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


    /*
    var n1 = 1
    var n2 = 2
    var Soma = n1 + n2

    var n3 = 3
    var n4 = 4
    var Subt = n3 - n4

    var n5 = 5
    var n6 = 6
    var Mult: Float = n5.toFloat() / n6

    var n7 = 7
    var n8 = 8
    var Div = n7 * n8

    var n9 = 9

    var n10 = 10
    n10 += 5 // n10 = (n1 + 5)
    var n11 = 10
    n11 -= 5
    var n12 = 10
    n12 *= 5
    var n13 = 10
    n13 /= 5

    var n14 = 10
    var n15 = 12
    var resultado = n14 <= n15
 */


    /*
    && - E true  true = true
    && - E true  false = false

    || - OU true    false = true
    || - OU true    true = true
    || - OU false   true = true
    || - OU false   false = false

    xor - OU exclusivo true  false = true
    xor - OU exclusivo true  true = false
    xor - OU exclusivo false  false = false
    xor - OU exclusivo false  true = true
    beber xor dirigir
     */


    /*
    var idade = 18
    var sexo = 'M'
    var emancipada = true

    // False OU True = True

    var beber = true
    var dirigir = true

 */


    val idade: Int
    idade = 10
    if(idade == 10){
        println("SIM")
    }else{
        println("NAO")

    }

    /*
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

    println("++ " + (++n9))
    println("-- " +(--n9) + "\n")

    println("+= " + n10)
    println("-= " + n11)
    println("*= " + n12)
    println("/= " + n13 + "\n")

    println("!= " + (n14 != n15))
    println(">= " + (n14 >= n15))
    println("<= " + resultado)
    println("< " + (n14 < n15))
    println("> " + (n14 > n15) + "\n")

    println(idade>18 || sexo=='M')
    println(idade > 18 && sexo == 'M' || emancipada && sexo == 'M') // T ou F
    println( beber xor dirigir)
     */



}

