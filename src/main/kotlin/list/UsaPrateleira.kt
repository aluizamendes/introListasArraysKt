package list

fun main() {
    val prateleira = Prateleira("Literatura", livros)

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    porAutor.imprimeComMarcador()
    porAnoPublicacao.imprimeComMarcador()
}