fun main() {
    // =============================
    // Operadores Aritméticos
    // =============================
    val n1 = 30
    val n2 = 20

    val soma = n1 + n2
    val subtracao = n1 - n2
    val multiplicacao = n1 * n2
    val divisao = n1 / n2           // divisão inteira
    val divisaoDecimal = n1.toDouble() / n2  // divisão decimal
    val resto = n1 % n2

    println("Soma (n1 + n2): $soma")
    println("Subtração (n1 - n2): $subtracao")
    println("Multiplicação (n1 * n2): $multiplicacao")
    println("Divisão inteira (n1 / n2): $divisao")
    println("Divisão decimal (n1 / n2): $divisaoDecimal")
    println("Resto (n1 % n2): $resto")

    println("--------------------------------------------------")

    // =============================
    // Operadores Relacionais
    // =============================
    val a = 5
    val b = 3

    println("a > b: ${a > b}")
    println("a < b: ${a < b}")
    println("a >= b: ${a >= b}")
    println("a <= b: ${a <= b}")
    println("a == b: ${a == b}")
    println("a != b: ${a != b}")

    println("--------------------------------------------------")

    // =============================
    // Operadores Lógicos
    // =============================
    val log1 = true && true       // true
    val log2 = 2 > 1 && 5 > 3     // true
    val log3 = 3 > 2 && false     // false
    val log4 = 4 > 5 && 3 == 3    // false
    val log5 = 5 > 4 && 2 == 2    // true

    println("log1: $log1")
    println("log2: $log2")
    println("log3: $log3")
    println("log4: $log4")
    println("log5: $log5")

    println("--------------------------------------------------")

    // =============================
    // Exemplo de Idade e Compra
    // =============================
    val idadePessoa1 = 50
    val compraPessoa1 = 500
    val resultado1 = idadePessoa1 >= 50 && compraPessoa1 >= 400
    println("Pessoa 1: idade >=50 e compra >=400? $resultado1")

    val idadePessoa2 = 20
    val compraPessoa2 = 500
    val resultado2 = idadePessoa2 >= 50 || compraPessoa2 >= 400
    println("Pessoa 2: idade >=50 ou compra >=400? $resultado2")
}
