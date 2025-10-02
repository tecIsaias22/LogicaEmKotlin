fun main(){
    /*
    val nomes = arrayOf(
        "isaias", "Ana"
    )
    //nomes[0] = "mudou"
    println(nomes [0])

    var numero = 1
    //while (numero in 1..8)
    while (numero <= 5){
        println("Executou: $numero")
        numero++
    }

    for(numero in 1..5){
        println("Executou: $numero")
    }
     */

    var postagens = arrayOf(
        "Viagem para a praia",
        "Levei o meu cachorro no veterinario",
        "trilha com os amigos"
    )
    for(( indice,postagem) in postagens.withIndex() ){
       println("$indice: $postagem")
    }

}

