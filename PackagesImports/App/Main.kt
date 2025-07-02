package PackagesImports.App

///import PackagesImports.Vitrine.Produto
///import PackagesImports.Carrinho.Produto

import PackagesImports.Vitrine.Xpto
import PackagesImports.Vitrine.Produto as vit
import PackagesImports.Carrinho.Produto as car

fun  Main() {

    val cadProdutoVitrine = vit(1, "Monitor", 850.0)
    val cadProdutoCarrinho = car(1, 850.0, 9)
    val Xpto = Xpto()
}