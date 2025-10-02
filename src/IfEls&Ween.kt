fun main(){
    /*
    val notaAluno = 5
    val condicao = notaAluno >= 6

    val opcao = 1

    if(opcao == 1 ){
        println("Cartao de credito")
    }
    else if(opcao == 2 ){
        println("Extrato bancario")
    }
    else if(opcao == 3){
        println("saldo")
    }

    val opcao = 10
    if (opcao in 1..3){
        println("opções selecionadas: 1,2,3")
    }else if (opcao in 4..8)
        println("opçoes selecionadas: 4, 5, 6, 7, 8")
     */
    val opcao = 1
    // println("Cartao de cretido")
    // println("extrato bancario")
    // println("saldo")
    when (opcao){
        1 -> println("Cartao de cretido")
        2 -> println("Extrato bancario")
        in 3 ..5 -> println("saldo")
        else -> println("Nenhuma opcao selecionada")
    }
}